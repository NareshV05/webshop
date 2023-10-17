package org.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SDC extends BaseClass {
	
	public static Locators l = new Locators();

	@Given("User should be in the  home page {string}")
	public void user_should_be_in_the_home_page(String URL)  {
		browserLaunch();
		urlLaunch(URL);
		maximise();
		impWait(10);
	}

	@Then("Validate the home page and User should click register button")
	public void validate_the_home_page_and_user_should_click_register_button() {
		
		l = new Locators();
		
		click(l.getRegister());

	}

	@Then("Enter the details {string},{string},{string},{string},{string}")
	public void enter_the_details(String firstname, String lastname, String email, String password, String confirmpassword) {
		
		l = new Locators();
		
		click(l.getGender());
		sendkeys(l.getFirstname(), firstname);
		sendkeys(l.getLastname(), lastname);
		sendkeys(l.getEmail(), email);
		sendkeys(l.getPassword(), password);
		sendkeys(l.getConfirmpassword(), confirmpassword);




	}

	@Then("Click on save button")
	public void click_on_save_button() {
		
		l = new Locators();
		click(l.getSave());
	}
	
	@Then("user should click login button")
	public void user_should_click_login_button() {
		l = new Locators();
	   click(l.getLogin());
	}
	
	@Then("Enter username and password {string},{string}")
	public void enter_username_and_password(String username, String password) {
		
		sendkeys(l.getEmail(), username);
		sendkeys(l.getPassword(), password);

	   
	}

	@Then("click login button")
	public void click_login_button() {
	   click(l.getLogin2());
	}
       
	@Then("click electronics link")
	public void click_electronics_link() throws Exception {
		Thread.sleep(5000);

		click(l.getElectronics());
		
	}
	   

	@Then("click cellphones link")
	public void click_cellphones_link() {
	    click(l.getCellphones());
	}

	@Then("click add to cart button")
	public void click_add_to_cart_button() {
	   click(l.getAddtocart());
	}

	
	




}
