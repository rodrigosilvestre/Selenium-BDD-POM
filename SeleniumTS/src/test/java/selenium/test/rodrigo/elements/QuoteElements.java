package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteElements {
	public WebElement fieldFirstName(WebDriver driver) {
		return driver.findElement(By.id("firstname"));
	}
}
