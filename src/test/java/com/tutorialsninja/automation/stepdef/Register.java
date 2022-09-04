package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.WebDriver;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to Account Registraion Page$")
	public void i_navigate_to_Account_Registraion_Page()  {
	   
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable arg1)  {
	   
	}

	@And("^I Select the Privacy Policy$")
	public void i_Select_the_Privacy_Policy()  {
	   
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button()  {
	   
	}

	@Then("^I should see that User account has Successfully created$")
	public void i_should_see_that_User_account_has_Successfully_created()  {
	    
	}
}
