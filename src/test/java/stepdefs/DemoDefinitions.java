package stepdefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DemoDefinitions {

    @Given(value = "^I open https://coinmarketcap.com/$")
    public void i_open_httpscoinmarketcapcom() throws Throwable {
        throw new PendingException();
    }

    @When("^I click ‘View all’$")
    public void i_click_view_all() throws Throwable {
        throw new PendingException();
    }

    @Then("^I verify 100 results are displayed$")
    public void i_verify_100_results_are_displayed() throws Throwable {
        throw new PendingException();
    }
}