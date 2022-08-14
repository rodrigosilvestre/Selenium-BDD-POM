package selenium.test.rodrigo.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.test.rodrigo.pageObjects.PoSendQuotePage;

public class SendQuoteSteps {
	PoSendQuotePage poSendQuotePage = new PoSendQuotePage();
	
	@When("^fill in the Send Quote fields (.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void fill_in_the_send_quote_fields(String email, String phone, String username, String password, String confirmPassword,
			String comments) {
		poSendQuotePage.fillUpSendQuote(email, phone, username, password, confirmPassword, comments);
	}

	@Then("check that all Quote information has been filled in")
	public void check_that_all_quote_information_has_been_filled_in() {
		poSendQuotePage.checkInformation();
	}

	@Then("verify the success message")
	public void verify_the_success_message() {
		poSendQuotePage.sendQuote();
	}
}
