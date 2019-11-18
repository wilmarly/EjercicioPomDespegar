package tcs.wilmar.pomDespegar.pageObject;

//import com.mifmif.common.regex.Generex;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class buscarYvalidarVuelo_pageObject extends PageObject{
	
    //Localizadores
    @FindBy(how = How.XPATH,using = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline']//input[@placeholder='Ingresa una ciudad']")
    private WebElementFacade txtOrigen;
    
    public void write_origin(){
    	txtOrigen.click();	
    }

}
