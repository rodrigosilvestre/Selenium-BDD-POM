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

	public WebElement fieldRightHandDrive(WebDriver driver, String rightHandDrive) {
		return driver.findElement(By.cssSelector("input[id*='righthanddrive'][value= \"" + rightHandDrive + "\"]"));
	}

	public WebElement fieldGender(WebDriver driver, String gender) {
		return driver.findElement(By.cssSelector("input[id*='gendermale'][value= \"" + gender + "\"]"));
	}

	public WebElement fieldStreetAddress(WebDriver driver) {
		return driver.findElement(By.id("streetaddress"));
	}

	public WebElement fieldCountry(WebDriver driver, String country) {
		return driver.findElement(By.cssSelector("select#country> option[value =\"" + country + "\"]"));
	}

	public WebElement fieldZipCode(WebDriver driver) {
		return driver.findElement(By.id("zipcode"));
	}

	public WebElement fieldCity(WebDriver driver) {
		return driver.findElement(By.id("city"));
	}

	public WebElement fieldOccupation(WebDriver driver, String occupation) {
		return driver.findElement(By.cssSelector("select#occupation> option[value =\"" + occupation + "\"]"));
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
