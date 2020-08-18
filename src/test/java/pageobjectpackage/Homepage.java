package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends DriverFactory {

    public void baseurl(){

        driver.getCurrentUrl();
    }
    public void searchproduct(String products){
        driver.findElement(By.id("rs")).sendKeys(products);
        driver.findElement(By.id("rs")).sendKeys(Keys.ENTER);
    }

}
