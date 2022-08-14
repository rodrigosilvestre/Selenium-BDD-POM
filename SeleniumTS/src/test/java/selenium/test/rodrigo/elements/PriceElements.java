package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceElements {

	public WebElement fieldPriceOption(WebDriver driver, String priceOption) {
		return driver.findElement(By.id(priceOption));
	}

	public WebElement fieldCounter(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"selectpriceoption\"]/span"));
	}

	public WebElement fieldNextTab(WebDriver driver) {
		return driver.findElement(By.id("nextsendquote"));
	}
}
