package tcs.wilmar.pomDespegar.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.wilmar.pomDespegar.steps.buscarYvalidarVuelo_steps;

public class buscarYvalidarVuelo_definition {
	@Steps
	buscarYvalidarVuelo_steps step;
	
	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador()  {
		step.ingreso_a_navegador();
	}
}
