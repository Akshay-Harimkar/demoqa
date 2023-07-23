package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    WebDriver driver;

    public void setupBrowser(String browser, String Url) {
        
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        
       
        if(Url!=""){
            driver.get(Url);
        }

        
        if(browser.equalsIgnoreCase("chrome")|| browser.equalsIgnoreCase("firefox")){
            String title = driver.getTitle();
            System.out.println(title);
         }
 
    }

    public static void main(String[] args) {
        App ap = new App();
        ap.setupBrowser("chrome", "https://www.google.com");
        
    }
}
