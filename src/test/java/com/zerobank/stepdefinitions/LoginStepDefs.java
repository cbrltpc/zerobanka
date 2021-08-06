package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginStepDefs {
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        new LoginPage().login();

    }
}
