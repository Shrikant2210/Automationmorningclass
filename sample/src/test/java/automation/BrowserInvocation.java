package automation;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvocation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("abc");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.id("Login")).click();

        String actualErrorMessage = driver.findElement(By.id("error")).getText();
        String ExpectedErrorMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if (actualErrorMessage.equals(ExpectedErrorMessage)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Error message are not equal");
        }

    }
}
