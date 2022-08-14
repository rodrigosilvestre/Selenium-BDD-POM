package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleElements {

	public WebElement fieldMake(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#make>option:nth-child(" + i + ")"));
	}

	public WebElement fieldModel(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#model>option:nth-child(" + i + ")"));
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

	public WebElement fieldNumberSeats(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#numberofseats>option:nth-child(" + i + ")"));
	}

	public WebElement fieldRightHandDrive(WebDriver driver, String rightHandDrive) {
		return driver.findElement(By.id(rightHandDrive));
	}

	public WebElement fieldNumberOfSeatsMotorcycle(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#numberofseatsmotorcycle>option:nth-child(" + i + ")"));
	}

	public WebElement fieldFuelType(WebDriver driver, int i) {
		return driver.findElement(By.cssSelector("#fuel>option:nth-child(" + i + ")"));
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
