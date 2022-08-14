package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductElements {

	public WebElement fieldStartdate(WebDriver driver) {
		return driver.findElement(By.id("startdate"));
	}

	public WebElement fieldInsuranceSum(WebDriver driver, String insuranceSum) {
		return driver.findElement(By.cssSelector("select#insurancesum> option[value = \"" + insuranceSum + "\"]"));
	}

	public WebElement fieldMeritRating(WebDriver driver, String meritRating) {
		return driver.findElement(By.cssSelector("select#meritrating > option[value = \"" + meritRating + "\"]"));
	}

	public WebElement fieldDamageInsurance(WebDriver driver, String damageInsurance) {
		return driver
				.findElement(By.cssSelector("select#damageinsurance > option[value = \"" + damageInsurance + "\"]"));
	}

	public WebElement fieldOptionalProducts(WebDriver driver, String product) {
		return driver.findElement(By.id(product));
	}

	public WebElement fieldCourtesyCar(WebDriver driver, String courtesycar) {
		return driver.findElement(By.cssSelector("select#courtesycar > option[value = \"" + courtesycar + "\"]"));
	}

	public WebElement fieldCounter(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"enterproductdata\"]/span"));
	}

	public WebElement fieldNextTab(WebDriver driver) {
		return driver.findElement(By.id("nextselectpriceoption"));
	}
}
