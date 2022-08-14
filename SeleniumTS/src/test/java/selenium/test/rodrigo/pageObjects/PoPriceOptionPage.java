package selenium.test.rodrigo.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.elements.PriceElements;

public class PoPriceOptionPage extends DriverConfigurantion {
	PriceElements priceElements = new PriceElements();

	public void fillUpPriceOption(String priceOption) {
		Actions actions = new Actions(driver);
		actions.moveToElement(priceElements.fieldPriceOption(driver, priceOption)).click().build().perform();
	}

	public void checkInformation() {
		WebElement realCounter = priceElements.fieldCounter(driver);
		assertEquals("0", realCounter.getText());
	}

	public void nextTab() {
		priceElements.fieldNextTab(driver).click();
	}

}
