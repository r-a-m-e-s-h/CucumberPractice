package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	
	@Given("click on the searchBar")
	public void click_on_the_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}

	@When("enter the text")
	public void enter_the_text() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement txtbox = driver.findElement(By.name("q"));
		txtbox.sendKeys("Selenium Testing"+Keys.ENTER);
		
	}

	@And("click on enter")
	public void click_on_enter() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("clicked");
	}

	@Then("get the title fof the page")
	public void get_the_title_fof_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("The Title is : "+driver.getTitle());
	}

}
