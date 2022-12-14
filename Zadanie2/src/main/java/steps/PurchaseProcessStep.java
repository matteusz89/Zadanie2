package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.time.Duration;

public class PurchaseProcessStep {
    public static WebDriver driver;
    public String url = "https://mystore-testlab.coderslab.pl/index.php/";

    @Given("Uzytkownik znajduje sie na stronie glownej aplikacji")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("Uzytkownik wybiera opcje Sign In")
    public void goToLoginPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
    }

    @And("Uzytkownik wpisuje poprawny email oraz haslo a nastepnie zatwierdza  dane poprzez klikniecie przycisku zalogowania")
    public void logInToApp() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.login();
    }

    @And("W polu wyszukiwarki wpisuje Hummingbird Printed Sweater oraz wchodzi na stronę produktu")
    public void goToProductPage(){
        SearchForProduct searchForProduct = new SearchForProduct(driver);
        searchForProduct.searchRequest();
        searchForProduct.isDiscountApplied();
    }


    @And("Wybiera rozmiar oraz liczbę sztuk oraz dodaje do koszyka")
    public void addToCart(){
        FillUpShoppingCart fillUpShoppingCart = new FillUpShoppingCart(driver);
        fillUpShoppingCart.addToCartProcess();
    }

    @Then("Przechodzi do platnosci oraz finalizuje ją")
    public void placeAnOrder()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CheckoutAndPayment checkoutAndPayment = new CheckoutAndPayment(driver);
        checkoutAndPayment.purchase();
    }

    @And("Zrobi screenshot z potwierdzeniem zamowienia oraz zamknie przegladarke")
    public void tearDown() throws IOException {
        GrabAScreenshot grabAScreenshot = new GrabAScreenshot(driver);
        grabAScreenshot.scrShot();
        driver.quit();
    }

}
