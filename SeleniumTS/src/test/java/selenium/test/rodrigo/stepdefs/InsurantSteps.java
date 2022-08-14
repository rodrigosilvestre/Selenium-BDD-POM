package selenium.test.rodrigo.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.test.rodrigo.pageObjects.PoInsurencePage;

public class InsurantSteps {
	PoInsurencePage pgInsurencePage = new PoInsurencePage();

	@When("^fill in the Insurant Data fields (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void fill_in_the_insurant_data_fields(String firstName, String lastName, String dateBirth, String gender,
			String streetAdress, String country, String zipCode, String city, String occupation, String hobbies,
			String website) {
		pgInsurencePage.fillUpInsurantData(firstName, lastName, dateBirth, gender, streetAdress, country, zipCode, city,
				occupation, hobbies, website);
	}

	@When("^send a (.*)$")
	public void send_a_picture(String picture) {
		pgInsurencePage.sendPicture(picture);
	}

	@Then("check that all insurant information has been filled in")
	public void check_that_all_insurant_information_has_been_filled_in() {
		pgInsurencePage.checkInformation();
	}

	@Then("proceed to the Product tab")
	public void proceed_to_the_product_tab() {
		pgInsurencePage.nextTab();
	}

}
