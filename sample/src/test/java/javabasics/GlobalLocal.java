package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalLocal {
    double pie =3.14; // global variable
    WebDriver driver; // global
    public void m1(){
        int a = 20; // local variable
        System.out.println(a);
        System.out.println(pie);
        driver = new ChromeDriver();
    }

    public void m2(){
        System.out.println(pie);

    }
}
