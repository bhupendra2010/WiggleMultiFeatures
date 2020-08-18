package stepdefinationpackage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.FootWearPage;

public class StepDefFootwear {
        FootWearPage foot=new FootWearPage();
    @When("^User Naviagate to footwear page$")
    public void user_Naviagate_to_footwear_page() throws Throwable {
    foot.searchfootwear();
    }

    @When("^Select required footwear$")
    public void select_required_footwear() {
    foot.selectfootear();
    }

    @Then("^User should able to put footwear in basket$")
    public void user_should_able_to_put_footwear_in_basket() throws Throwable {
    foot.choosefootwear();
    }
}
