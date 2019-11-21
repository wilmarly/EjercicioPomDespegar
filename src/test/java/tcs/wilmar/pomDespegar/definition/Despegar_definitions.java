package tcs.wilmar.pomDespegar.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.wilmar.pomDespegar.steps.Despegar_steps;

public class Despegar_definitions {
	@Steps
	Despegar_steps step;

	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador() {
		step.ingreso_a_navegador();
	}

	@When("^seleccionar si el viaje es de \"([^\"]*)\" o \"([^\"]*)\"$")
	public void seleccionar_si_el_viaje_es_de_o(String arg1, String arg2) throws Exception {
		step.diligenciar_parametros_del_viaje(arg1, arg2);
	}
	
	@When("^Buscar un vuelvo desde \"([^\"]*)\" a \"([^\"]*)\" de solo ida$")
	public void buscar_un_vuelvo_desde_a_de_solo_ida(String arg1, String arg2) throws Exception {
		step.buscar_vuelo_de_solo_ida(arg1, arg2);
	}

	@When("^Buscar un vuelvo desde \"([^\"]*)\" a \"([^\"]*)\"$")
	public void buscar_un_vuelvo_desde_a(String arg1, String arg2) throws Exception {
		step.buscar_vuelo_de_ida_y_vuelta(arg1, arg2);
	}

	@When("^seleccionar el numero de (\\d+) y el numero de (\\d+)$")
	public void seleccionar_el_numero_de_y_el_numero_de(int arg1, int arg2) throws Exception {
		step.seleccionar_niños_y_adultos(arg1, arg2);
	}

	@Then("^validadr el vuelo mas barato$")
	public void validadr_el_vuelo_mas_barato() throws Exception {
		step.validar_precio();
	}
}
