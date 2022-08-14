package selenium.test.rodrigo.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.elements.SendQouteElements;

public class PoSendQuotePage extends DriverConfigurantion {

	SendQouteElements sendQouteElements = new SendQouteElements();

	public void fillUpSendQuote(String email, String phone, String username, String password, String confirmPassword,
			String comments) {
		sendQouteElements.fieldEmail(driver).sendKeys(email);
		sendQouteElements.fieldPhone(driver).sendKeys(phone);
		sendQouteElements.fieldUsername(driver).sendKeys(username);
		sendQouteElements.fieldPassword(driver).sendKeys(password);
		sendQouteElements.fieldConfirmPassword(driver).sendKeys(confirmPassword);
		sendQouteElements.fieldComments(driver).sendKeys(comments);
	}

	public void checkInformation() {
		WebElement realCounter = sendQouteElements.fieldCounter(driver);
		assertEquals("0", realCounter.getText());
	}

	public void sendQuote() {
		sendQouteElements.fieldSendQuote(driver).click();
		WebElement sucessMessage = sendQouteElements.verifySucessMessage(driver);
		assertEquals("Sending e-mail success!", sucessMessage.getText());
		wait(5);
		driver.close();
	}
}
