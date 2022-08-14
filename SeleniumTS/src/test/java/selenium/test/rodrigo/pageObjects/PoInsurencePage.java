package selenium.test.rodrigo.pageObjects;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.elements.InsurantElements;

public class PoInsurencePage extends DriverConfigurantion {

	InsurantElements insurantElements = new InsurantElements();

	public void fillUpInsurantData(String firstName, String lastName, String dateBirth, String gender,
			String streetAdress, String country, String zipCode, String city, String occupation, String hobbies,
			String website) {
		Actions actions = new Actions(driver);
		insurantElements.fieldFirstName(driver).sendKeys(firstName);
		insurantElements.fieldLastName(driver).sendKeys(lastName);
		insurantElements.fieldDateBirth(driver).sendKeys(dateBirth);
		actions.moveToElement(insurantElements.fieldGender(driver, gender)).click().build().perform();
		insurantElements.fieldStreetAddress(driver).sendKeys(streetAdress);
		insurantElements.fieldCountry(driver, country).click();
		insurantElements.fieldZipCode(driver).sendKeys(zipCode);
		insurantElements.fieldCity(driver).sendKeys(city);
		insurantElements.fieldOccupation(driver, occupation).click();
		actions.moveToElement(insurantElements.fieldHobbies(driver, hobbies)).click().build().perform();
		insurantElements.fieldWebsite(driver).sendKeys(website);
	}

	public void sendPicture(String picture) {
		insurantElements.fieldPicture(driver).sendKeys(picture);
	}

	public void checkInformation() {
		WebElement realCounter = insurantElements.fieldCounter(driver);
		assertEquals("0", realCounter.getText());
	}

	public void nextTab() {
		wait(2);
		insurantElements.fieldNextTab(driver).click();
	}

}
