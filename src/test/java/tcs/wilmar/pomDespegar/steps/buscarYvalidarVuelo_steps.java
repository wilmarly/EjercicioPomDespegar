package tcs.wilmar.pomDespegar.steps;

import net.thucydides.core.annotations.Step;
import tcs.wilmar.pomDespegar.pageObject.buscarYvalidarVuelo_pageObject;

public class buscarYvalidarVuelo_steps {
	buscarYvalidarVuelo_pageObject PgObj;

	@Step
	public void ingreso_a_navegador()  {
		PgObj.open();
	}
}
