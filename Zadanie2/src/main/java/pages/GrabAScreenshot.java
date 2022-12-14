package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static steps.PurchaseProcessStep.driver;

public class GrabAScreenshot {

    public GrabAScreenshot (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "wrapper")
    WebElement screenShot;

    public void scrShot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("G:\\CodersLab\\Tester automatyzujący\\Zadania zaliczeniowe\\Zadanie2\\src\\main\\ScreenShot\\screen.png"));
        screenShot.getScreenshotAs(OutputType.FILE);
    }
}
