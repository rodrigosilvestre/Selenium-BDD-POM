package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsurantElements {

	public WebElement fieldFirstName(WebDriver driver) {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement fieldLastName(WebDriver driver) {
		return driver.findElement(By.id("lastname"));
	}

	public WebElement fieldDateBirth(WebDriver driver) {
		return driver.findElement(By.id("birthdate"));
	}

	public WebElement fieldGender(WebDriver driver, String gender) {
		return driver.findElement(By.id("gendermale"));
	}

	public WebElement fieldStreetAddress(WebDriver driver) {
		return driver.findElement(By.id("streetaddress"));
	}

	public WebElement fieldCountry(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#country option:nth-child(" + i + ")"));
	}

	public WebElement fieldZipCode(WebDriver driver) {
		return driver.findElement(By.id("zipcode"));
	}

	public WebElement fieldCity(WebDriver driver) {
		return driver.findElement(By.id("city"));
	}

	public WebElement fieldOccupation(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#occupation option:nth-child(" + i + ")"));
	}

	public WebElement fieldHobbies(WebDriver driver, String hobbies) {
		return driver.findElement(By.id(hobbies));
	}

	public WebElement fieldWebsite(WebDriver driver) {
		return driver.findElement(By.id("website"));
	}

	public WebElement fieldPicture(WebDriver driver) {
		return driver.findElement(By.id("open"));
	}

	public WebElement fieldCounter(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"enterinsurantdata\"]/span"));
	}

	public WebElement fieldNextTab(WebDriver driver) {
		return driver.findElement(By.id("nextenterproductdata"));
	}

}
