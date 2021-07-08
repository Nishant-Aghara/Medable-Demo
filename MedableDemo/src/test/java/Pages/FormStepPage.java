package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormStepPage {
	
	WebDriver driver;

	//Identifiers
	By fst_Radio_Button = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[3]"
			+"/div[1]/div[1]/div[1]/div[1]/div[2]/a[20]/div[1]/*[1]");

	By email_Step = By.xpath("//input[@id='5f495246a0a6f70100d5e355_email']");
	By text_Step = By.xpath("//input[@id='5f495246a0a6f70100d5e395_text']");
	By numeric_Step = By.xpath("//input[@id='5f495246a0a6f70100d5e3d2_numeric']");
	By value_Picker_Step = By.xpath("//button[@id='5f495246a0a6f70100d5e40f_value_picker']");
	By boolean_Step = By.xpath("//div[contains(text(),'Yes')]");
	By continuous_Scale_Step = By.xpath("//*[@id=\\\"5f495248a0a6f70100d5e555_continuous_scale\\\"]");
	By integer_Scale_Step = By.xpath("//*[@id=\\\"5f495248a0a6f70100d5e5a0_integer_scale\\\"]");
	By location_Step = By.xpath("//*[@id=\\\"app\\\"]/div/div/div[3]/div[1]\"\r\n" + 
			"				+ \"/form/div/div/div/div/div/div/div[2]\"\r\n" + 
			"				+ \"/div/div/div/div[8]/div/div/div/div[1]/div/input");
	By text_Scale_Step = By.xpath("//*[@id=\\\"5f495249a0a6f70100d5e644_text_scale\\\"]");
	//Time Interval Step
	By myHour_Step = By.xpath("//*[@id=\\\"app\\\"]/div/div/div[3]/div[1]/form\"\r\n" + 
			"				+ \"/div/div/div/div/div/div/div[2]/div/div/div/div[10]/div/div[2]/div/div[1]/div/button\"");
	By myMinute_Step = By.xpath("//*[@id=\\\"app\\\"]/div/div/div[3]/div[1]/form/div\"\r\n" + 
			"				+ \"/div/div/div/div/div/div[2]/div/div/div/div[10]/div/div[2]/div/div[2]/div/button");
	//Time of day step
	By myTimeHour_Step = By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_hour']");
	By myTimeMinute_Step = By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_minute']");
	By myTimePM_Step = By.xpath("//button[@id='5f495249a0a6f70100d5e6d3_time_of_day_meridiem']");
	
	
	//Methods
	public void clickRadioButton() {
		driver.findElement(fst_Radio_Button).click();
	}
	public void fulfillingValues() {
		driver.findElement(email_Step).sendKeys("a@a.com");
		driver.findElement(text_Step).sendKeys("Automation");
		driver.findElement(numeric_Step).sendKeys("21");
		driver.findElement(boolean_Step).click();
		driver.findElement(continuous_Scale_Step).click();
		driver.findElement(integer_Scale_Step).click();
		driver.findElement(text_Scale_Step).click();
		driver.findElement(myHour_Step).click();
		driver.findElement(myMinute_Step).click();
		driver.findElement(myTimeHour_Step).click();
		driver.findElement(myTimeMinute_Step).click();
		driver.findElement(myTimePM_Step).click();
		
	}


}
