package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleElements {

	public WebElement fieldMake(WebDriver driver, String make) {
		return driver.findElement(By.cssSelector("select#make> option[value = \"" + make + "\"]"));
	}

	public WebElement fieldModel(WebDriver driver, String model) {
		return driver.findElement(By.cssSelector("select#model> option[value = \"" + model + "\"]"));
	}

	public WebElement fieldCylinderCapacity(WebDriver driver) {
		return driver.findElement(By.id("cylindercapacity"));
	}

	public WebElement fieldEnginePerformace(WebDriver driver) {
		return driver.findElement(By.id("engineperformance"));
	}

	public WebElement fieldManufactureDate(WebDriver driver) {
		return driver.findElement(By.id("dateofmanufacture"));
	}

	public WebElement fieldNumberSeats(WebDriver driver, String numberSeats) {
		return driver.findElement(By.cssSelector("select#numberofseats> option[value = \"" + numberSeats + "\"]"));
	}

	public WebElement fieldRightHandDrive(WebDriver driver, String rightHandDrive) {
		return driver.findElement(By.cssSelector("input[id*='righthanddrive'][value= \"" + rightHandDrive + "\"]"));
	}

	public WebElement fieldNumberOfSeatsMotorcycle(WebDriver driver, String numberSeatsMotorcycle) {
		return driver.findElement(
				By.cssSelector("select#numberofseatsmotorcycle> option[value =\"" + numberSeatsMotorcycle + "\"]"));
	}

	public WebElement fieldFuelType(WebDriver driver, String fuelType) {
		return driver.findElement(By.cssSelector("select#fuel> option[value = \"" + fuelType + "\"]"));
	}

	public WebElement fieldPayload(WebDriver driver) {
		return driver.findElement(By.id("payload"));
	}

	public WebElement fieldTotalWeight(WebDriver driver) {
		return driver.findElement(By.id("totalweight"));
	}

	public WebElement fieldListPrice(WebDriver driver) {
		return driver.findElement(By.id("listprice"));
	}

	public WebElement fieldLicensePlateNumber(WebDriver driver) {
		return driver.findElement(By.id("licenseplatenumber"));
	}

	public WebElement fieldAnnualMileage(WebDriver driver) {
		return driver.findElement(By.id("annualmileage"));
	}

	public WebElement fieldCounter(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"entervehicledata\"]/span"));
	}

	public WebElement fieldNextTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]"));
	}

}
