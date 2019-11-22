package tcs.wilmar.pomDespegar.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/validarPrecio.feature", glue = "tcs.wilmar.pomDespegar.definition",tags="@tag2")
public class Despegar_runner {

}

