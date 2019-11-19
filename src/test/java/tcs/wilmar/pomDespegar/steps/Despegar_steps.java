package tcs.wilmar.pomDespegar.steps;

import net.thucydides.core.annotations.Step;
import tcs.wilmar.pomDespegar.pageObject.Despegar_pageObject;

public class Despegar_steps {
	Despegar_pageObject PgObj;

	@Step
	public void ingreso_a_navegador()  {
		PgObj.open();
	}
	
	@Step
	public void diligenciar_parametros_del_viaje(String arg1, String arg2)  {
		PgObj.select_vuelo_tab();
		PgObj.select_ida_y_vuelta(arg1,arg2);	
	}
	
	@Step
	public void buscar_vuelo(String arg1, String arg2) throws InterruptedException  {
		
		Thread.sleep(2000);
		PgObj.write_origin(arg1);
		PgObj.select_origin();
		PgObj.write_destination(arg2);
		PgObj.select_destination();
		PgObj.write_date();
		PgObj.select_go_date();
		PgObj.select_back_date();
	}
	
	@Step
	public void seleccionar_niños_y_adultos(int arg1, int arg2) throws InterruptedException  {
	PgObj.select_pasajeros_y_clases();
	PgObj.agregar_adulto(arg1);
	PgObj.agregar_Menores(arg2);
	Thread.sleep(16000);
	
	}
}
