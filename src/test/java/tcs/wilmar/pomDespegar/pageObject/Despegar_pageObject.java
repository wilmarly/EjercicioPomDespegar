package tcs.wilmar.pomDespegar.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tcs.wilmar.pomDespegar.utilidades.*;
//import com.mifmif.common.regex.Generex;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class Despegar_pageObject extends PageObject {
	utilidades utilidades = new utilidades();
	// Localizadores
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Vuelos')]")
	private WebElementFacade selectVuelos;

	@FindBy(how = How.XPATH, using = "//div[1]/div/div[3]/div[2]/div[1]/div[1]//input[1]")
	private WebElementFacade txtOrigen;

	@FindBy(how = How.XPATH, using = "//div[@class='ac-wrapper -desktop -show']//li[@class='item -active']")
	private WebElementFacade selectOrigin;

	@FindBy(how = How.XPATH, using = "//div[1]/div[1]/div[3]/div[2]/div[1]/div[2]//input[1]")
	private WebElementFacade txtDestination;

	@FindBy(how = How.XPATH, using = "//div[@class='ac-wrapper -desktop -show']//li[@class='item -active']")
	private WebElementFacade selectDstination;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input")
	private WebElementFacade txtFecha;

	@FindBy(how = How.XPATH, using = "//div[4]//div[2]//span[9]/span[1]")
	private WebElementFacade selectFechaIda;

	@FindBy(how = How.XPATH, using = "//div[2]//span[13]/span[1]")
	private WebElementFacade selectFechavuelta;

	@FindBy(how = How.XPATH, using = "//div[3]/div[7]/div[1]/div[1]/div[1]")
	private WebElementFacade selectpasajerosYClase;

	@FindBy(how = How.XPATH, using = "//div[3]//div[1]//div[1]/div[2]/div[1]/a[2]")
	private WebElementFacade agregarAdultos;

	@FindBy(how = How.XPATH, using = "//div[3]//div[1]/div[2]/div[2]/div[1]/a[2]")
	private WebElementFacade agregarMenores;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ida y vuelta')]")
	private WebElementFacade select_ida_y_vuelta;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Solo ida')]")
	private WebElementFacade select_solo_ida;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[2]/a[1]")
	private WebElementFacade select_aplicar;

	@FindBy(how = How.XPATH, using = "//div[4]/div[1]/a[1]/em[1]")
	private WebElementFacade select_buscar;

	@FindBy(how = How.XPATH, using = "//div[@id='dreck-wrongcountry-modal']")
	private WebElementFacade ignore_window;

	@FindBy(how = How.XPATH, using = "//span[1]/span[1]//span[1]//span[1]//span[1]//span[1]//span[1]/span[1]/em[1]/span[2]")
	private WebElementFacade get_value;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/span/label")
	private WebElementFacade select_sin_decidir_fecha;
	
	String txt_findElementsWithThispath = "//cluster[1]//em[1]/span[2]";

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
		if (arg2.equals("no") && arg1.equals("no")) {
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
					//By.xpath("//div[3]//div[1]//div["+i+"]/div[2]/div[1]/div[1]/select[1]/option[" + (3 + i) + "]"));
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

//		List<WebElement> elements = new ArrayList<WebElement>();
//		elements = 
		utilidades.findElementsAndStore(txt_findElementsWithThispath);

	}
}

//Locale locale = new Locale("es", "CO");//localizador de area "colombia" Supported Locales
//NumberFormat numberFormat = NumberFormat.getInstance(locale);
//List<WebElement> elements = getDriver().findElements(By.xpath(
//		"//cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/main-fare[1]/span[1]/span[2]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]"));
////System.out.println("Number of elements: " + elements.size());
//
////for (int i = 0; i < elements.size(); i++) {
////	System.out.println("Precio " + i + ":" + elements.get(i).getText());
////}
//
//int[] arregloPrecios = new int[elements.size()];
////System.out.println("arreglo length" + arregloPrecios.length);
//
//for (int i = 0; i < elements.size(); i++) {
//	arregloPrecios[i] = Integer.parseInt(elements.get(i).getText().replace(".", ""));
//}
//
//int min = Arrays.stream(arregloPrecios).min().getAsInt();
//int max = Arrays.stream(arregloPrecios).max().getAsInt();
//System.out.println("el precio minimo es COP : " + numberFormat.format(min));
//System.out.println("el precio maximo es COP : " + numberFormat.format(max));
