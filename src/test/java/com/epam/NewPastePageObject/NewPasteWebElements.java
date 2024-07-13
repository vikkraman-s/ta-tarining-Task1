package com.epam.NewPastePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPasteWebElements {

    public static WebElement code(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"postform-text\"]"));
    }
    public static WebElement pasteName(WebDriver driver){
        return  driver.findElement(By.xpath("//*[@id=\"postform-name\"]"));
    }
    public static WebElement button(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button"));
    }
}
