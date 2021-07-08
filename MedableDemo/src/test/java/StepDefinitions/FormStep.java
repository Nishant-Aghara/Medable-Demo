package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class FormStep {

	WebDriver driver = null;

	@Given("Patient navigate to activity list as {string}")
	public void patient_navigate_to_activity_list_as(String string) {

		//for relative path
		String projectPath = System.getProperty("user.dir");
		//set chromedriver path
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//manage for page load for synchronize
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//for window maximize
		//driver.navigate().to("https://mystudy.qa.medable.com/task/5f495224a0a6f70100d5c245");
		driver.manage().window().maximize();
		System.out.println("inside Step - Patient navigate to activity list as user.provided@medable.com");
	}

	@And("Patient select Form Step Task on activity list page")
	public void patient_select_form_step_task_on_activity_list_page() {
		// patient click on radio button
		WebElement FST = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[3]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[2]/a[20]/div[1]/*[1]"));
		FST.click();
		System.out.println("inside Step - Patient select Form Step Task on activity list page");
	}

	@And("Patient should see Form Step Task task ready to start")
	public void patient_should_see_form_step_task_task_ready_to_start() {
		System.out.println("inside Step - Patient should see Form Step Task task ready to start");
	}

	@And("Patient completes Form step with values")
	public void patient_completes_form_step_with_values(io.cucumber.datatable.DataTable dataTable) {
		//fulfilling values...
		//Email step
		driver.findElement(By.xpath("//input[@id='5f495246a0a6f70100d5e355_email']")).sendKeys("a@a.com");

		//Text step
		driver.findElement(By.xpath("//input[@id='5f495246a0a6f70100d5e395_text']")).sendKeys("Automation");

		//Numeric step
		driver.findElement(By.xpath("//input[@id='5f495246a0a6f70100d5e3d2_numeric']")).sendKeys("21");

		//Value picker step
		WebElement mySelectElement = driver.findElement(By.xpath("//button[@id='5f495246a0a6f70100d5e40f_value_picker']"));
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByVisibleText("Option 1");

		//Boolean step
		WebElement Yes = driver.findElement(By.xpath("//div[contains(text(),'Yes')]"));
		Yes.click();

		//Continuous scale step
		driver.findElement(By.xpath("//*[@id=\"5f495248a0a6f70100d5e555_continuous_scale\"]")).click();

		//Integer scale step
		driver.findElement(By.xpath("//*[@id=\"5f495248a0a6f70100d5e5a0_integer_scale\"]")).click();

		//Location step
		WebElement mySelectLoc = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]"
				+ "/form/div/div/div/div/div/div/div[2]"
				+ "/div/div/div/div[8]/div/div/div/div[1]/div/input"));
		Select drpdown = new Select(mySelectLoc);
		drpdown.selectByVisibleText("Córdoba, Cordoba, Argentina");

		//Text scale step
		driver.findElement(By.xpath("//*[@id=\"5f495249a0a6f70100d5e644_text_scale\"]")).click();

		//Time interval step
		WebElement myHour = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/form"
				+ "/div/div/div/div/div/div/div[2]/div/div/div/div[10]/div/div[2]/div/div[1]/div/button"));
		myHour.click();
		Select hour = new Select(myHour);
		hour.selectByVisibleText("2 Hours");

		WebElement myMinute = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/form/div"
				+ "/div/div/div/div/div/div[2]/div/div/div/div[10]/div/div[2]/div/div[2]/div/button"));
		myMinute.click();
		Select minute = new Select(myMinute);
		minute.selectByVisibleText("2 Minutes");

		//Time of day step
		WebElement myTimeHour = driver.findElement(By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_hour']"));
		myTimeHour.click();
		Select TimeHour = new Select(myTimeHour);
		TimeHour.selectByVisibleText("1");

		WebElement myTimeMinute = driver.findElement(By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_minute']"));
		myTimeMinute.click();
		Select TimeMinute = new Select(myTimeMinute);
		TimeHour.selectByVisibleText("1");

		WebElement myTimePM = driver.findElement(By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_meridiem']"));
		myTimePM.click();
		Select TimePM = new Select(myTimePM);
		TimeHour.selectByVisibleText("PM");

		System.out.println("inside Step - Patient completes Form step with values");
	}

	@And("Patient click next button in step page")
	public void patient_click_next_button_in_step_page() {
		//click on next button
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		System.out.println("inside Step - Patient click next button in step page");
	}

	@And("Patient click skip button in step page")
	public void patient_click_skip_button_in_step_page() {
		//click on skip button
		driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
		System.out.println("inside Step - Patient click skip button in step page");
	}

	@And("Patient should see the completion step page")
	public void patient_should_see_the_completion_step_page() {
		System.out.println("inside Step - Patient should see the completion step page");
	}

	@And("Patient click done button in step page")
	public void patient_click_done_button_in_step_page() {
		//click done button
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		System.out.println("inside Step - Patient click done button in step page");
	}

	@Then("Patient should see the activity list page")
	public void patient_should_see_the_activity_list_page() {
		System.out.println("inside Step - Patient should see the activity list page");
	}

	@Then("Patient should see Form Step Task completed")
	public void patient_should_see_form_step_task_completed() {
		System.out.println("inside Step - Patient should see Form Step Task completed");
	}

}
