
package selenium.test.rodrigo.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.elements.VehicleElements;

public class PoVehiclePage extends DriverConfigurantion {

	VehicleElements vehicleElements = new VehicleElements();

	public void getInside() {
		DriverConfigurantion.open("http://sampleapp.tricentis.com/101/app.php");
	}

	public void fillUpVehicleData(int makeOption, int model, String cylinderCapacity, String enginePerformace,
			String dateManufacture, int seatsOption, String righthand, int numberSeatsMotorcycle, int fuelTypeOption,
			String payload, String totalWeight, String listPrice, String licePlateNum, String annMiliage) {
		Actions actions = new Actions(driver);
		vehicleElements.fieldMake(driver, makeOption).click();
		vehicleElements.fieldModel(driver, model).click();
		vehicleElements.fieldCylinderCapacity(driver).sendKeys(cylinderCapacity);
		vehicleElements.fieldEnginePerformace(driver).sendKeys(enginePerformace);
		vehicleElements.fieldManufactureDate(driver).sendKeys(dateManufacture);
		vehicleElements.fieldNumberSeats(driver, seatsOption).click();
		actions.moveToElement(vehicleElements.fieldRightHandDrive(driver, righthand)).click().build().perform();
		vehicleElements.fieldNumberOfSeatsMotorcycle(driver, numberSeatsMotorcycle).click();
		vehicleElements.fieldFuelType(driver, fuelTypeOption).click();
		vehicleElements.fieldPayload(driver).sendKeys(payload);
		vehicleElements.fieldTotalWeight(driver).sendKeys(totalWeight);
		vehicleElements.fieldListPrice(driver).sendKeys(listPrice);
		vehicleElements.fieldLicensePlateNumber(driver).sendKeys(licePlateNum);
		vehicleElements.fieldAnnualMileage(driver).sendKeys(annMiliage);
	}

	public void checkInformation() {
		WebElement realCounter = vehicleElements.fieldCounter(driver);
		assertEquals("0", realCounter.getText());
	}

	public void nextTab() {
		vehicleElements.fieldNextTab(driver).click();
	}

}
