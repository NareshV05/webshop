package org.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass {
	
	public Locators() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath = "//a[@class='ico-register']")
	private WebElement register;
	
	@FindBy (id = "gender-male")
	private WebElement Gender;
	
	@FindBy (id = "FirstName")
	private WebElement firstname;
	
	@FindBy (id = "LastName")
	private WebElement lastname;
	
	@FindBy (id = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement password;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy (id = "register-button")
	private WebElement save;
	
   @FindBy (xpath = "//a[contains(text(),'Log in')]")
	private WebElement login;
		
	@FindBy (xpath = "(//input[@type='submit'])[2]")
	private WebElement login2;
		
	@FindBy (xpath = "(//a[contains(text(),'Electronics')])[3]")
	private WebElement electronics;
		
	@FindBy (xpath = "(//a[contains(text(),'Cell phones')])[3]")
	private WebElement cellphones;
		
	@FindBy (xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addtocart;
	
	@FindBy (xpath = "//a[contains(text(),'Gift Cards')]")
	private WebElement giftcard;
	
	@FindBy (xpath = "//input[@class='recipient-name']")
	private WebElement Rname;
	
	@FindBy (xpath = "//input[@class='recipient-email']")
	private WebElement Rmail;

	@FindBy (xpath = "//input[@value='Email a friend']")
	private WebElement emailfriend;
	
	@FindBy (xpath = "//input[@class='friend-email']")
	private WebElement emailfriend2;
	
	@FindBy (xpath = "//input[@name='send-email']")
	private WebElement sendmail;

	
	
	
	public WebElement getGiftcard() {
		return giftcard;
	}

	public WebElement getRname() {
		return Rname;
	}

	public WebElement getRmail() {
		return Rmail;
	}

	public WebElement getEmailfriend() {
		return emailfriend;
	}

	public WebElement getEmailfriend2() {
		return emailfriend2;
	}

	public WebElement getSendmail() {
		return sendmail;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogin2() {
		return login2;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getCellphones() {
		return cellphones;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	
	

	
}
