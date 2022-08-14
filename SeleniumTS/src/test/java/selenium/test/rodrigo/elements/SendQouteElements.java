package selenium.test.rodrigo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQouteElements {

	public WebElement fieldEmail(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}

	public WebElement fieldPhone(WebDriver driver) {
		return driver.findElement(By.id("phone"));
	}

	public WebElement fieldUsername(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}

	public WebElement fieldPassword(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public WebElement fieldConfirmPassword(WebDriver driver) {
		return driver.findElement(By.id("confirmpassword"));
	}

	public WebElement fieldComments(WebDriver driver) {
		return driver.findElement(By.id("Comments"));
	}

	public WebElement fieldCounter(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"sendquote\"]/span"));
	}

	public WebElement fieldSendQuote(WebDriver driver) {
		return driver.findElement(By.id("sendemail"));
	}
	
	public WebElement verifySucessMessage(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[4]/h2"));
	}
}
