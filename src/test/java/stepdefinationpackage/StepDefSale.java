package stepdefinationpackage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.SalePage;

public class StepDefSale {
    SalePage salePage=new SalePage();
    @When("^User going on sale page$")
    public void user_going_on_sale_page() throws Throwable {
        salePage.saleoption();
    }

    @When("^User find the necessary items$")
    public void user_find_the_necessary_items() throws Throwable {

    }

    @Then("^User should put that item in basket$")
    public void user_should_put_that_item_in_basket() throws Throwable {

    }

    @Then("^User can goback to mainpage to add some more items$")
    public void user_can_goback_to_mainpage_to_add_some_more_items() throws Throwable {

    }
}
