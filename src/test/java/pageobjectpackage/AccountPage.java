package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;

public class AccountPage extends DriverFactory {
    public void Accountcreation(){
        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("DualRegisterEmailModel_Email")).sendKeys("bhupendra201@hotmail.com");
        driver.findElement(By.id("qa-dual-register")).click();

        driver.findElement(By.id("RegisterModel_EmailConfirm")).sendKeys("bhupendra201@hotmail.com");
        driver.findElement(By.id("RegisterModel_Password")).sendKeys("Bhupen1979");
        driver.findElement(By.name("RegisterModel.FirstName")).sendKeys("Bhupendrakumar");
        driver.findElement(By.name("RegisterModel.Surname")).sendKeys("Nayee");
        //driver.findElement(By.id("RegisterModel_ReceiveEmails")).click();
        //driver.findElement(By.name("RegisterSelector_Register")).click();
    }

}
