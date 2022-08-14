#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@allAutomobileTest
Feature: Tests of Automobile Insurance functionality
  	As a customer
    I want to fill the form of Automobile Insurance
    To send a quote

  @vehicleDataTest
  Scenario Outline: Enter Vehicle Data
    Given inside the sampleapp tricentis website
    When fill in the Vehicle Data fields <Make>,<Model>,<Cylinder Capacity>,<Engine Performance>,<Date of Manufacture>,<Number of Seats>,<Right Hand Drive>,<Number Seats Motorcycle>,<Fuel Type>,<Payload>,<Total Weight>,<List Price>,<License Plate Number> and <Annual Mileage>
    Then check that all vehicle information has been filled in
    And proceed to the Insurant tab
    
  Examples:
    |Make|Model			|Cylinder Capacity|Engine Performance|Date of Manufacture|Number of Seats|Right Hand Drive|Number Seats Motorcycle|Fuel Type|Payload|Total Weight|List Price |License Plate Number|Annual Mileage|
    |BMW |Motorcycle|100							|1000							 |08/12/2000   			 |2 						 |Yes							|2   					 				  |Gas	    |100		|120				 |35000	     |Acc3n7ure					  |3000		 			 |
    
  @insurantDataTest
  Scenario Outline: Enter Insurant Data
    When fill in the Insurant Data fields <First Name>,<Last Name>,<Date of Birth>,<Gender>,<Street Address>,<Country>,<Zip Code>,<City>,<Occupation>,<Hobbies> and <Website>
    And send a <picture>
    Then check that all insurant information has been filled in
    And proceed to the Product tab
    
  Examples:
    |First Name|Last Name|Date of Birth|Gender|Street Address		 |Country|Zip Code|City						 |Occupation|Hobbies  |Website			|picture															 	 	  |
    |Rodrigo   |Silvestre|08/12/1999   |Male  |Afonso Pena Street|Brazil |42703390|Lauro de Freitas|Employee  |skydiving|accenture.com|.src\\test\\resources\\files\\FotoMinha.jpg|
     
    
  @productDataTest  
  Scenario Outline: Enter Product Data
    When fill in the Product Data fields <Start Date>,<Insurance Sum>,<Merit Rating>,<Damage Insurance>,<Optional Products> and <Courtesy Car>
    Then check that all product information has been filled in
    And proceed to the Price Option tab
  Examples:
    |Start Date|Insurance Sum|Merit Rating|Damage Insurance|Optional Products|Courtesy Car|
    |12/01/2022|7000000		   |Bonus 3		  |Full Coverage   |EuroProtection   |Yes					|
    
  @priceOptionTest 
  Scenario Outline: Select Price Option
		When select the <Price Option>
    Then check that all price information has been filled in
    And proceed to the Send Quote tab
   Examples:
    |Price Option  |
    |selectultimate|
    
  @sendQuoteTest  
 	Scenario Outline: Send Quote
    When fill in the Send Quote fields <E-Mail>,<Phone>,<Username>,<Password>,<Confirm Password> and <Comments>
    Then check that all Quote information has been filled in
    And verify the success message
  Examples:
    |E-Mail								 |Phone			 |Username |Password|Confirm Password|Comments					|
    |testSelenium@gmail.com|71988101080|rodrigoss|123321rR|123321rR				 |No comments at all|
    