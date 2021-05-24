package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass{

	public static WebDriver driver = Runner.driver;
	
	LoginPage lp = new LoginPage(driver);
	
	@Given("^User enter url of adactin application$")
	public void user_enter_url_of_adactin_application() throws Throwable {
	    
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	   inputOnElement(lp.getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    inputOnElement(lp.getPassword(), arg1);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
	   clickOnElement(lp.getLogin_btn());
	}

	@Then("^User validate login button$")
	public void user_validate_login_button() throws Throwable {
	    
	}
}
