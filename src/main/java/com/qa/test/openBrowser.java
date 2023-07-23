package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main (String []args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://colend-qa.go-yubi.in/");

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        

        WebElement element = driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/form/div[1]/div/div/div/input"));
       element.sendKeys("test_colending@vivriticapital.com");

       WebElement button = driver.findElement(By.cssSelector("[class='c89f1057d c08709d93 cfdf7e7ce c948a708e _button-login-id']"));
       button.click();

       WebElement pwd = driver.findElement(By.cssSelector("[class='input ca4b7f6ee c58cecd1f']"));
       pwd.sendKeys("Think@123");

       WebElement submitBtn = driver.findElement(By.cssSelector("[class='c89f1057d c08709d93 cfdf7e7ce c948a708e _button-login-password']"));
       submitBtn.click();

       Thread.sleep(5000);

       WebElement otp1 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit')]")); ////div/div/div/div/div[1]
       otp1.sendKeys("9");

       WebElement otp2 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 2')]"));
       otp2.sendKeys("9");

       WebElement otp3 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 3')]"));
       otp3.sendKeys("9");

       WebElement otp4 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 4')]"));
       otp4.sendKeys("9");

       WebElement otp5 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 5')]"));
       otp5.sendKeys("9");

       WebElement otp6 = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 6')]"));
       otp6.sendKeys("9");

        WebElement verifyButton = driver.findElement(By.xpath("//button[text()='Verify Email']"));
        verifyButton.click();


      System.out.println(driver.getTitle());
    
    }
}
