package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationMappingSteps {

    WebDriver driver;
    WebElement currencyElement;

    @Given("User launch the browser and navigate to the URL")
    public void LaunchBrowser(){
        driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        driver.manage().window().maximize();

    }
    @When("User enter the username {string} and password {string}")
    public void enterUsernamePassword(String userName, String password){

        //driver.findElement(By.id("username")).sendKeys(userName);
        //driver.findElement(By.name("pw")).sendKeys(password);
        //driver.findElement(By.name("pw")).sendKeys("mumbai"+ Keys.ENTER); //type and click simultaneously
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();

    }

    @And("User clicks the login button")
    public void loginButton() {

        driver.findElement(By.id("Login")).click();
    }

    @Then("Validate the error message")
    public void errorMessageValidation() {
        String actualErrorMessage = driver.findElement(By.id("error")).getText();
        String ExpectedErrorMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if (actualErrorMessage.equals(ExpectedErrorMessage)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Error message are not equal");
        }
    }


    @Then("Validate whether the user navigates to homepage")
    public void validateWhetherTheUserNavigatesToHomepage() {
    }

    @When("User select the specific dropdown value")
    public void handelDropdown() {
    currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select selectCurrency = new Select(currencyElement);
        //selectCurrency.selectByIndex(3);
        //selectCurrency.selectByVisibleText("EUR");
        selectCurrency.selectByValue("GBP");

        driver.findElement(By.id("divpaxinfo")).click();

        WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select adultDropdown = new Select(adultElement);
        adultDropdown.selectByIndex(4);
    }

    @And("User iterates the dropdown values")
    public void userIteratesTheDropdownValues() {
        int currencyDropdownSize = currencyElement.findElements(By.tagName("option")).size();
        for (int i=0; i<currencyDropdownSize; i++){
            String value = currencyElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }

    }
}
