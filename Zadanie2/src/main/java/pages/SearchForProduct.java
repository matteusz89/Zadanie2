package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForProduct {

    public SearchForProduct(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    WebElement searchBar;

    @FindBy (xpath = "//*[@id=\"search_widget\"]/form/button/i")
    WebElement searchBtn;

    @FindBy (xpath = "//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[2]/h2/a")
    WebElement productPage;

    @FindBy (xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[2]")
    WebElement discountVerifier;

    public void searchRequest(){
        searchBar.sendKeys("Hummingbird Printed Sweater");
        searchBtn.click();
        productPage.click();
    }

    public boolean isDiscountApplied(){
        return discountVerifier.isDisplayed();
    }
}
