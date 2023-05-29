package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://49.206.243.82:8082/");
        driver.findElement(By.id("chnageLan")).click();
        driver.findElement(By.id("lblKGID")).click();
        driver.findElement(By.id("lblKGID")).click();
        driver.findElement(By.id("kgid_number")).sendKeys("1883311");
        driver.findElement(By.name("mobile-no-kgid")).click();
        driver.findElement(By.id("otp_authentication_kgid")).click();
        driver.findElement(By.id("otp_kgid")).sendKeys("2121");


    }
}
