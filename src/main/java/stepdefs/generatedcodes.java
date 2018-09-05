package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class generatedcodes {
	
WebDriver driver;
	
	@Given("^User goes to google$")
	public void user_goes_to_google(){
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.lk"); 
		
	}

	@When("^User search 'Selenium'$")
	public void user_search_Selenium() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		   driver.findElement(By.name("btnK")).click();	  
	}

	@Then("^User should get the 'Selenium HQ site' in the results page$")
	public void user_should_get_the_Selenium_HQ_site_in_the_results_page(){
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		  Assert.assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		
	}
	
}




	//public void user_goes_to_google() throws Exception 


	//public void user_search_Selenium() throws Exception {

	//public void user_should_get_the_Selenium_HQ_site_in_the_results_page() throws Exception {
	
