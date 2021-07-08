package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientLoginPage {
	
	WebDriver driver;
	
	//Identifiers
	By signIn_Button = By.xpath("//button[contains(text(),'Sign In')]");
	By txt_Username = By.name("email");
	By txt_Password = By.name("password");
    By login_Button = By.xpath("//button[contains(text(),'Log In')]");
    By ignore_Button = By.xpath("//button[contains(text(),'Ignore')]");
    
    //constructor
    public void PatientLoginPage(WebDriver driver) {
    	this.driver=driver;
    }
    //Methods
    public void clickSignInButton() {
    	driver.findElement(signIn_Button);
    }
    public void enterUserName(String username) {
    	driver.findElement(txt_Username).sendKeys(username);
    }
    public void enterPassword(String password) {
    	driver.findElement(txt_Password).sendKeys(password);
    }
    public void clickLogin () {
    	driver.findElement(login_Button).click();
    }
    public void clickIgnore () {
    	driver.findElement(ignore_Button).click();
    }
}
