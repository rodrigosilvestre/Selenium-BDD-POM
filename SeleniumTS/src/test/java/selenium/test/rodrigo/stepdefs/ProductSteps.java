package selenium.test.rodrigo.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.test.rodrigo.pageObjects.PoProductPage;

public class ProductSteps {
	PoProductPage poProductData = new PoProductPage();

	@When("^fill in the Product Data fields (.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void fill_in_the_product_data_fields(String startDate, String insuranceSum, String meritRating,
			String damageInsurance, String optionalProducts, String courtesyCar) {
		poProductData.fillUpProductData(startDate, insuranceSum, meritRating, damageInsurance, optionalProducts,
				courtesyCar);
	}

	@Then("check that all product information has been filled in")
	public void check_that_all_product_information_has_been_filled_in() {
		poProductData.checkInformation();
	}

	@Then("proceed to the Price Option tab")
	public void proceed_to_the_price_option_tab() {
		poProductData.nextTab();
	}
}
