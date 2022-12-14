package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutAndPayment {

    public CheckoutAndPayment (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement goToCheckoutBtn;

    @FindBy (xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    WebElement checkoutPage;

    @FindBy (xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    WebElement proceedToShipping;

    @FindBy (xpath = "//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span")
    WebElement pickACarrier;

    @FindBy (xpath = "//*[@id=\"js-delivery\"]/button")
    WebElement continueToPayment;

    @FindBy (xpath = "//*[@id=\"payment-option-1-container\"]/span")
    WebElement pickAPaymentMethod;

    @FindBy (xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    WebElement agreetoTOS;

    @FindBy (xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    WebElement placeOrder;

    public void purchase(){
        goToCheckoutBtn.click();
        checkoutPage.click();
        proceedToShipping.click();
        pickACarrier.click();
        continueToPayment.click();
        pickAPaymentMethod.click();
        agreetoTOS.click();
        placeOrder.click();
    }


}
