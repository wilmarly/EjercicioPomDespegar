package tcs.wilmar.pomDespegar.steps;

import net.thucydides.core.annotations.Step;
import tcs.wilmar.pomDespegar.pageObject.buscarYvalidarVuelo_pageObject;

public class buscarYvalidarVuelo_steps {
	buscarYvalidarVuelo_pageObject PgObj;

	@Step
	public void select_origen() {
		PgObj.click_en_campo_origen();
	}
}
