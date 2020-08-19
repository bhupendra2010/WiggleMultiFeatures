package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class FootWearPage extends DriverFactory {
    @FindBy(css = "a[data-page-area='Triathlon']")
    WebElement Triathlon;
    @FindBy(css = "a[data-ga-label='Triathlon | Footwear']")
    WebElement footwear;
    @FindBy(css = "a[data-ga-label='Triathlon | Footwear | Cycling Shoes']")
    WebElement cyclingshoes;

    public void searchfootwear(){
        Actions aa=new Actions(driver);
        aa.moveToElement(Triathlon).build().perform();
        aa.moveToElement(footwear).build().perform();
        aa.moveToElement(cyclingshoes).click().build().perform();
    }
    public void selectfootear(){
        List<WebElement>pricerange=driver.findElements(By.cssSelector("button[class='bem-left-hand-navigation__option js-toggle-section']"));
        System.out.println(pricerange.size());
        for (WebElement v:pricerange){
            System.out.println(v.getText());
            if (v.getText().contains("Price range")){
                v.click();
            }
        }
        driver.findElement(By.name("mi")).clear();
        driver.findElement(By.name("mi")).sendKeys("70");
        driver.findElement(By.name("ma")).clear();
        driver.findElement(By.name("ma")).sendKeys("250");
       /* try {
            driver.findElement(By.linkText("Apply")).click();
        }catch (NoSuchElementException e){
            System.out.println(e);
        }*/
        driver.findElement(By.cssSelector("button[class='bem-left-hand-navigation__option-button']")).click();

    }
    public void choosefootwear() throws InterruptedException {
       //JavascriptExecutor jj=(JavascriptExecutor)driver;
        //jj.executeScript("window.scrollBy(0,200)");

        List<WebElement>footwears=driver.findElements(By.cssSelector("a[class='bem-product-thumb__name--grid']"));
        System.out.println(footwears.size());
        Random random=new Random();
        WebElement randomno=footwears.get(random.nextInt(footwears.size()));
        Thread.sleep(3000);
        randomno.click();

        driver.findElement(By.id("quickBuyButton")).click();
    }

}
