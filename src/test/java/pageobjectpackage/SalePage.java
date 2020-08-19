package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SalePage  extends DriverFactory {

    public void saleoption(){
        driver.findElement(By.cssSelector("a[data-ga-label='Sale']")).click();
        driver.findElement(By.cssSelector("button[class='w-button transparent-grey-grey w-mt-2']")).click();

        List<WebElement>items=driver.findElements(By.cssSelector("button[class='bem-left-hand-navigation__option js-toggle-section']"));
        System.out.println(items.size());
        for(WebElement ed:items){
            System.out.println(ed.getText());
            if (ed.getText().contains("Categories")){
                ed.click();
            }
        }
        driver.findElement(By.cssSelector("a[data-tracking-name='Swimwear']")).click();
        List<WebElement>female=driver.findElements(By.cssSelector("button[class='bem-left-hand-navigation__option js-toggle-section']"));
        System.out.println(female.size());
        for(WebElement ef:female){
            System.out.println(ef.getText());
            if (ef.getText().contains("Gender")){
                ef.click();
            }
        }
        /*try {
            //driver.findElement(By.cssSelector("div[class='bem-left-hand-navigation__header bem-menu__section--gender col-xs-3']")).click();
            driver.findElement(By.cssSelector("a[data-tracking-name='Girls']")).click();
        }catch (StaleElementReferenceException ep){
            System.out.println(ep);
        }*/
            //driver.findElement(By.cssSelector("a[data-tracking-name='Girls']")).click();
    }
}
