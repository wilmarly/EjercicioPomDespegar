package tcs.wilmar.pomDespegar.steps;

import net.thucydides.core.annotations.Step;
import tcs.wilmar.pomDespegar.pageObject.Despegar_pageObject;

public class Despegar_steps {
	Despegar_pageObject PgObj;

	@Step
	public void ingreso_a_navegador() {
		PgObj.open();
		PgObj.maximiseScreen();
	}

	@Step
	public void diligenciar_parametros_del_viaje(String arg1, String arg2) throws InterruptedException {
		PgObj.select_vuelo_tab();
		Thread.sleep(3000);
		PgObj.select_ida_y_vuelta(arg1, arg2);
		
	}

	@Step
	public void buscar_vuelo_de_solo_ida(String arg1,String arg2){
		PgObj.write_origin(arg1);
		PgObj.select_origin();
		PgObj.write_destination(arg2);
		PgObj.select_destination();
		PgObj.write_date();
		PgObj.select_go_date();
	}
	
	@Step
	public void buscar_vuelo_de_ida_y_vuelta(String arg1, String arg2) {

		PgObj.write_origin(arg1);
		PgObj.select_origin();
		PgObj.write_destination(arg2);
		PgObj.select_destination();
		PgObj.write_date();
		PgObj.select_go_date();
		PgObj.select_back_date();
	}
	
	@Step
	public void buscar_vuelo_sin_indicar_fechas(String arg1, String arg2) {

		PgObj.write_origin(arg1);
		PgObj.select_origin();
		PgObj.write_destination(arg2);
		PgObj.select_destination();
		PgObj.select_buscar();
	}

	@Step
	public void seleccionar_niños_y_adultos(int arg1, int arg2) throws InterruptedException {
		
		PgObj.select_pasajeros_y_clases();
		PgObj.agregar_adulto(arg2);
		PgObj.agregar_Menores(arg1);
		PgObj.select_childrens_age(arg1);
		PgObj.select_aplicar();
		PgObj.select_buscar();
		PgObj.ignore_window();
	}

	@Step
	public void validar_precio() {
		PgObj.get_value();
		PgObj.waitFor(10);
	}
}
