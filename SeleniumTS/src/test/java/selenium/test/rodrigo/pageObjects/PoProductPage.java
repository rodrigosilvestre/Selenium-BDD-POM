package selenium.test.rodrigo.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.elements.ProductElements;

public class PoProductPage extends DriverConfigurantion {
	ProductElements productElements = new ProductElements();

	public void fillUpProductData(
			String startDate, String insuranceSum, String meritRating, String damageInsurance,
			String optionalProducts, String courtesyCar) {
		Actions actions = new Actions(driver);
		productElements.fieldStartdate(driver).sendKeys(startDate);
		productElements.fieldInsuranceSum(driver, insuranceSum).click();
		productElements.fieldMeritRating(driver, meritRating).click();
		productElements.fieldDamageInsurance(driver, damageInsurance).click();
		actions.moveToElement(productElements.fieldOptionalProducts(driver, optionalProducts)).click().build().perform();
		productElements.fieldCourtesyCar(driver, courtesyCar).click();
	}

	public void checkInformation() {
		WebElement realCounter = productElements.fieldCounter(driver);
		assertEquals("0", realCounter.getText());
	}

	public void nextTab() {
		productElements.fieldNextTab(driver).click();
	}
}
