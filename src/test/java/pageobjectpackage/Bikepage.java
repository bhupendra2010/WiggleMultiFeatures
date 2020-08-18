package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;

public class Bikepage extends DriverFactory {

    public void selectproduct(String products){
        driver.findElement(By.xpath("//*[@id=\"multi-select\"]/div[2]/button/i")).click();
        driver.findElement(By.cssSelector("input[name='mi']")).clear();
        driver.findElement(By.cssSelector("input[name='mi']")).sendKeys("50");
        driver.findElement(By.cssSelector("input[name='ma']")).clear();
        driver.findElement(By.cssSelector("input[name='ma']")).sendKeys("4000");

    }
}
