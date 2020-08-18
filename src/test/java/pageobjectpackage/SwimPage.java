package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SwimPage extends DriverFactory {
    @FindBy(css = "a[data-page-area='Swim']")
    WebElement swimproducts;
    @FindBy(linkText = "Swimwear")
    WebElement swimwear;
    @FindBy(css = "a[data-ga-label='Swim | Swimwear | Swimming Caps']")
    WebElement swimmingcaps;
    /*@FindBy(css = "a[data-ga-label='Swim | Swimwear | Swimsuits']")
    WebElement swimsuite;
    @FindBy(css = "a[data-ga-label='Swim | Swimwear | Swimsuits | Two Piece Swimsuits']")
    WebElement twopiece;*/

    public void select() throws InterruptedException {

        driver.findElement(By.cssSelector("a[class='cta secondary close']")).click();

        Actions act = new Actions(driver);
        act.moveToElement(swimproducts).build().perform();
        act.moveToElement(swimwear).click().build().perform();
        //driver.findElement(By.cssSelector("div[class='bem-search-sort']")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("select[class='bem-search-sort__select']")));
        System.out.println(dropdown.getOptions().size());

        List<WebElement> options = dropdown.getOptions();
        for (WebElement ee : options) {
            try {
                ee.getText();
                if (ee.getText().contains("Price: Low to High")) {
                    ee.click();
                }
            } catch (StaleElementReferenceException e) {
                System.out.println(e);
            }


            List<WebElement> opti = driver.findElements(By.cssSelector("button[class='bem-left-hand-navigation__option js-toggle-section']"));
            System.out.println(opti.size());
            for (WebElement e : opti) {
                try {
                    System.out.println(e.getText());
                    if (e.getText().contains("Stock")) {
                        e.click();
                    }
                } catch (StaleElementReferenceException eg) {
                    System.out.println(eg);
                }
            }

        }
        }
        public void selectproduct() throws InterruptedException {
            driver.findElement(By.cssSelector("a[data-ga-action='Stock']")).click();
            Thread.sleep(3000);
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,500)");
            driver.findElement(By.linkText("dhb Blok Swim Cap - Palm")).click();
            driver.findElement(By.id("quickBuyButton")).click();
            driver.findElement(By.id("checkoutnow")).click();
        }

}