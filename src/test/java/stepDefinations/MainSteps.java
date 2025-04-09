package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("User is on netbanking landing page");
    }

//    @When("User login into application with {string} and password {string}")
//    public void user_login_into_application(String user, String password) {
//        System.out.println("User login into application " + user + " " + password);
//    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application(String user, String password) {
        System.out.println("User login into application " + user + " " + password);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Validating Home Page");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are Displayed");
    }


    @Given("User is on Practice Landing Page")
    public void user_is_on_practice_landing_page() {
        System.out.println("User is on Practice Landing Page");
    }

    @When("User SignUp into application")
    public void user_sign_up_into_application(List<String> data) {
        System.out.println("Name: " + data.getFirst());
        System.out.println("Last Name: " + data.get(1));
        System.out.println("Email: " + data.get(2));
        System.out.println("Number: " + data.getLast());
    }

}
