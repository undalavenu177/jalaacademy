package stepd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    
    @Given("I am on the login page")
    public void iAmOnLoginPage() {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\jo\\Desktop\\Venu\\new drivers\\new\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver(); // Or use any other browser driver
        loginPage = new LoginPage(driver);
        driver.get("https://www.facebook.com/login/"); // Replace with your login page URL
    }
    
    @When("I enter username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    
    @When("I click the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    
    @Then("I should be logged in successfully")
    public void verifyLoginSuccess() {
        // Add assertions or verification steps here
    }
    
    @Then("I should see an error message")
    public void verifyErrorMessage() {
        // Add assertions or verification steps here
    }
    
  
}
