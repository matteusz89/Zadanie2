package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillUpShoppingCart {

    public FillUpShoppingCart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id=\"group_1\"]/option[2]")
    WebElement pickSize;

    @FindBy (xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i")
    WebElement quantityInput;

    @FindBy (xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    WebElement addToCartBtn;



    public void addToCartProcess(){
        pickSize.click();
        quantityInput.click();
        quantityInput.click();
        quantityInput.click();
        quantityInput.click();
        addToCartBtn.click();

    }
}
