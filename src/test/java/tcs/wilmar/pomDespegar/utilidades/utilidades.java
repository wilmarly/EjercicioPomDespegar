package tcs.wilmar.pomDespegar.utilidades;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;

public class utilidades extends PageObject {
	

	public List<WebElement> findElementsAndStore(String findElementsWithThispath) {
		
		Locale locale = new Locale("es", "CO");//localizador de area "colombia" 
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		
		List<WebElement> elements = getDriver().findElements(By.xpath(findElementsWithThispath));
		

		int[] arregloPrecios = new int[elements.size()];
	
		for (int i = 0; i < elements.size(); i++) {
			
			arregloPrecios[i] = Integer.parseInt(elements.get(i).getText().replace(".", ""));
		}

		int min = Arrays.stream(arregloPrecios).min().getAsInt();
		int max = Arrays.stream(arregloPrecios).max().getAsInt();
		System.out.println("el precio minimo es: COP " + numberFormat.format(min));
		System.out.println("el precio maximo es: COP " + numberFormat.format(max));
		
		return elements;
		
	}

}
