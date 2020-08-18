package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.Homepage;
import pageobjectpackage.SwimPage;

public class StepDefSwim {
    Homepage homepage=new Homepage();
    SwimPage swimPage=new SwimPage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        homepage.baseurl();
    }

    @When("^User search for the swimsuite and select it$")
    public void user_search_for_the_swimsuite_and_select_it() throws Throwable {
    swimPage.select();
   }

    @Then("^User should able to put it in basket\\.$")
    public void user_should_able_to_put_it_in_basket() throws Throwable {
    swimPage.selectproduct();
    }
}
