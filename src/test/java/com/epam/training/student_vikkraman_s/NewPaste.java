package com.epam.training.student_vikkraman_s;

import com.epam.NewPastePageObject.NewPasteWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewPaste {
    private WebDriver driver;

    @BeforeTest
    public void start(){
        driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
    }

    @Test(description = "Enter the code and title and click create button")
    public void checkNewPaste(){
        NewPasteWebElements.code(driver).sendKeys("Hello from WebDriver");
        NewPasteWebElements.pasteName(driver).sendKeys("helloweb");
        NewPasteWebElements.button(driver).click();
    }
    @AfterTest
    public void close() {
        driver.quit();
    }
}
