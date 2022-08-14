package selenium.test.rodrigo.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.test.rodrigo.pageObjects.PoPriceOptionPage;

public class PriceOptionSteps {
	PoPriceOptionPage poPriceOptionPage = new PoPriceOptionPage();

	@When("^select the (.*)$")
	public void select_the_selectultimate(String priceOption) {
		poPriceOptionPage.fillUpPriceOption(priceOption);
	}

	@Then("check that all price information has been filled in")
	public void check_that_all_price_information_has_been_filled_in() {
		poPriceOptionPage.checkInformation();
	}

	@Then("proceed to the Send Quote tab")
	public void proceed_to_the_send_quote_tab() {
		poPriceOptionPage.nextTab();
	}
}
