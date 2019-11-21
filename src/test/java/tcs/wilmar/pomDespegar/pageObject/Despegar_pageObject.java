package tcs.wilmar.pomDespegar.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.mifmif.common.regex.Generex;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class Despegar_pageObject extends PageObject {
		
	// Localizadores
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Vuelos')]")
	private WebElementFacade selectVuelos;

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde dónde viajas']")
	private WebElementFacade txtOrigen;

	@FindBy(how = How.XPATH, using = "//div[@class='ac-wrapper -desktop -show']//li[@class='item -active']")
	private WebElementFacade selectOrigin;

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//input[@placeholder='Ingresa hacia dónde viajas']")
	private WebElementFacade txtDestination;

	@FindBy(how = How.XPATH, using = "//div[@class='ac-wrapper -desktop -show']//li[@class='item -active']")
	private WebElementFacade selectDstination;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input")
	private WebElementFacade txtFecha;
	
//	@FindBy(how = How.XPATH, using = "//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']")
//	private WebElementFacade txtFecha;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div[5]/div[1]/div[4]/span[23]/span[1]")
	private WebElementFacade selectFechaIda;
	
//	@FindBy(how = How.XPATH, using = "//div[@class='_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show']//div[@class='_dpmg2--month _dpmg2--o-5 _dpmg2--month-active']//span[@class='_dpmg2--date-number'][contains(text(),'22')]")
//	private WebElementFacade selectFechaIda;

	@FindBy(how = How.XPATH, using = "//div[@class='_dpmg2--month _dpmg2--o-5 _dpmg2--has-start-range _dpmg2--month-active']//span[@class='_dpmg2--date-number'][contains(text(),'25')]")
	private WebElementFacade selectFechavuelta;

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-3-input -md sbox-distri-input sbox-3-validation -top-right sbox-bind-event-click-passengers-input sbox-bind-error-flight-roundtrip-passengers-distribution']//div[@class='input-tag sbox-distribution-container-input -rooms']")
	private WebElementFacade selectpasajerosYClase;

	@FindBy(how = How.XPATH, using = "//div[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//div[@class='_pnlpk-panel-scroll']//div[@class='_pnlpk-panel__blocks']//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemBlock__itemRows _pnlpk-dynamicContent']//div//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg']//a[@class='steppers-icon-right sbox-3-icon-plus']")
	private WebElementFacade agregarAdultos;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[2]")
	private WebElementFacade agregarMenores;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ida y vuelta')]")
	private WebElementFacade select_ida_y_vuelta;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Solo ida')]")
	private WebElementFacade select_solo_ida;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[2]/a[1]")
	private WebElementFacade select_aplicar;

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-button -ml3-l -mt5-l']//em[@class='btn-text'][contains(text(),'Buscar')]")
	private WebElementFacade select_buscar;

	@FindBy(how = How.XPATH, using = "//div[@id='dreck-wrongcountry-modal']")
	private WebElementFacade ignore_window;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/main-fare[1]/span[1]/span[2]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]")
	private WebElementFacade get_value;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/span/label")
	private WebElementFacade select_sin_decidir_fecha;
	
	public void maximiseScreen() {
		getDriver().manage().window().maximize();
	}

	public void select_vuelo_tab() {
		selectVuelos.click();
	}

	public void write_origin(String arg1) {
		txtOrigen.clear();
		txtOrigen.sendKeys(arg1);
	}

	public void select_origin() {
		selectOrigin.click();
	}

	public void write_destination(String arg2) {
		txtDestination.clear();
		txtDestination.sendKeys(arg2);
	}

	public void select_destination() {
		selectDstination.click();
	}

	public void write_date() {
		txtFecha.click();
	}

	public void select_go_date() {
		selectFechaIda.click();
	}

	public void select_back_date() {
		selectFechavuelta.click();
	}

	public void select_pasajeros_y_clases() {
		selectpasajerosYClase.click();
	}

	public void select_ida_y_vuelta(String arg1, String arg2) {

		if ((arg1.equals("si"))) {
			select_ida_y_vuelta.click();
			
		}
		if (arg2.equals("si")) {
			select_solo_ida.click();
		}
		if(arg2.equals("no") && arg1.equals("no")) {
			select_sin_decidir_fecha.click();
		}
	}

	public void agregar_adulto(int arg2) throws InterruptedException {
		for (int i = 1; i <= arg2 - 1; i++) {
			agregarAdultos.click();
			Thread.sleep(800);
		}
	}

	public void agregar_Menores(int arg1) throws InterruptedException {
		for (int i = 1; i <= arg1; i++) {
			agregarMenores.click();
			Thread.sleep(800);
		}
	}

	public void select_childrens_age(int arg1) {
		for (int i = 1; i <= arg1; i++) {
			WebElement childrensAge = getDriver().findElement(
					By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[" + i
							+ "]/div[2]/div[1]/div[1]/select[1]/option[" + (3 + i) + "]"));
			childrensAge.click();
			waitFor(2);
		}
	}

	public void select_aplicar() {
		select_aplicar.click();
	}

	public void select_buscar() {
		select_buscar.click();
		waitFor(2);
	}

	public void ignore_window() {
		ignore_window.click();
		waitFor(2);
	}

	public void get_value() {
		WebDriverWait esperaExplicita = new WebDriverWait(getDriver(),35);
		esperaExplicita.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/main-fare[1]/span[1]/span[2]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]")));
		System.out.println("El vuelo mas barato es: "+get_value.getText());
		waitFor(2);
		
		
	//	List<WebElement> elementName = getDriver().findElements(By.LocatorStrategy("LocatorValue"));
	}
}
