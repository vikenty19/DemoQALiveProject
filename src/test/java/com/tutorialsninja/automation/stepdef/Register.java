package com.tutorialsninja.automation.stepdef;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
public class Register {


            @Given("I launch the app")
            public void i_launch_the_app(){
            }
            @And("^I navigate to Account Registration page$")
            public void i_navigate_to_Account_Registration_Page()    {
            }


              @When("^I provide all the below valid details$")
             public void iProvideAllTheBelowValidDetails(DataTable dataTable) {
               }

            @And("^I check-in the Privacy Policy$")
            public void iCheckInThePrivacyPolicy() {
           }

            @And("^Iclick on continue button$")
            public void iclickOnContinueButton() {
            }

            @Then("^I should see that the User Account has successfully been created$")
            public void iShouldSeeThatTheUserAccountHasSuccessfullyBeenCreated() {
            }

    }


