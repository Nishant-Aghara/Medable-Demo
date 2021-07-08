package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.PatientLoginPage;
import io.cucumber.java.en.*;

public class PatientLogin {
	
	private WebDriver driver = null;
	//PatientLoginPage pages;
	
	@Given("Patient navigates to welcome study page")
	public void patient_navigates_to_welcome_study_page() {
		
				//for relative path
				String projectPath = System.getProperty("user.dir");
				//set chromedriver path
				System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				//user open url
			//	driver.navigate().to("https://mystudy.qa.medable.com/?org=pawabqaauto");
				//manage for page load for synchronize
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				//for window maximize
				driver.manage().window().maximize();
				System.out.println("inside Step - Open browser and navigate to welcome study page");
	}

	@When("Patient click on Sign in button in welcome page")
	public void patient_click_on_sign_in_button_in_welcome_page() {
		//click on sign in button
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		System.out.println("inside Step - Patient click on Sign in button in welcome page");
	}

	@And("Patient should see the login page")
	public void patient_should_see_the_login_page() {
		//check login page displayed or not
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed();
		System.out.println("inside Step - Patient should see the login page");
	}

	@And("Patient enter the email \\{user.provided@medable.com} in login page")
	public void patient_enter_the_email_in_login_page() {
		//enter email
		driver.findElement(By.name("email")).sendKeys("user.provided@medable.com");
		System.out.println("inside Step - Patient enter email in login page");
	}

	@And("Patient enter the password qpal1010 in login page")
	public void patient_enter_the_password_qpal1010_in_login_page() {
		//enter password
		driver.findElement(By.name("password")).sendKeys("qpal1010");
		System.out.println("inside Step - Patient enter password in login page");
	}

	@And("Patient click login button in login page")
	public void patient_click_login_button_in_login_page() {
		//click on login button
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		System.out.println("inside Step - Patient click login button in login page");
	}

	@Then("Patient navigates to activity list page")
	public void patient_navigates_to_activity_list_page() throws InterruptedException {
		//handle alert popup
		driver.getWindowHandle();
		Alert alt = driver.switchTo().alert();
		//sleep time
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Ignore')]")).click();
		alt.accept();
		
		
		System.out.println("inside Step - Patient navigates to activity list page");
	}

}
