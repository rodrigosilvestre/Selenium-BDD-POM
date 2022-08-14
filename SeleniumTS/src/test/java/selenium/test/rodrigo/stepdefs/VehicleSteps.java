package selenium.test.rodrigo.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.test.rodrigo.config.DriverConfigurantion;
import selenium.test.rodrigo.pageObjects.PoVehiclePage;

public class VehicleSteps extends DriverConfigurantion {
	PoVehiclePage pgVehiclePage = new PoVehiclePage();

	@Given("inside the sampleapp tricentis website")
	public void inside_the_sampleapp_tricentis_website() {
		DriverConfigurantion.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@When("^fill in the Vehicle Data fields (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void fill_in_the_vehicle_data_fields(int makeOption, int model, String cylinderCapacity,
			String enginePerformace, String dateManufacture, int seatsOption, String righthand,
			int numberSeatsMotorcycle, int fuelTypeOption, String payload, String totalWeight, String listPrice,
			String licePlateNum, String annMiliage) {

		pgVehiclePage.fillUpVehicleData(makeOption, model, cylinderCapacity, enginePerformace, dateManufacture,
				seatsOption, righthand, numberSeatsMotorcycle, fuelTypeOption, payload, totalWeight, listPrice,
				licePlateNum, annMiliage);

	}

	@Then("check that all vehicle information has been filled in")
	public void check_that_all_vehicle_information_has_been_filled_in() {
		pgVehiclePage.checkInformation();
	}

	@Then("proceed to the Insurant tab")
	public void proceed_to_the_insurant_tab() {
		pgVehiclePage.nextTab();
	}

}
