package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.AccountPage;
import pageobjectpackage.Homepage;

public class StepDefAcc {
        Homepage homepage=new Homepage();
        AccountPage acc=new AccountPage();

    @When("^User fill all the details in account page$")
    public void user_fill_all_the_details_in_account_page() throws Throwable {
        acc.Accountcreation();
        }
    @Then("^User should able to create his account$")
    public void user_should_able_to_create_his_account() throws Throwable {

        }
}
