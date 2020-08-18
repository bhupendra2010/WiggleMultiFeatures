package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.Bikepage;
import pageobjectpackage.Homepage;

public class StepDef {
    Homepage homepage=new Homepage();
    Bikepage bikepage=new Bikepage();

    @Given("^user is on website$")
    public void user_is_on_website() throws Throwable {
    homepage.baseurl();
    }

    @When("^user search for the \"([^\"]*)\"$")
    public void user_search_for_the(String products) throws Throwable {
    homepage.searchproduct(products);
    bikepage.selectproduct(products);
    }

    @Then("^user should select the required product and put it in basket\\.$")
    public void user_should_select_the_required_product_and_put_it_in_basket() throws Throwable {

    }
}
