package org.stepDefinition;

import org.baseClass.BaseClass;
import org.pojo.PojSign1;
import org.pojo.Pojo1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Quience_StepDefinition extends BaseClass {



@Given("User have to launch the Quience application through Chrome browser")
public void user_have_to_launch_the_Quience_application_through_Chrome_browser() {

	chromeBrowser();

	maxWindow();

	launchUrl("https://www.quince.com/?utm_source=topstartups.io&");

	getPageUrl();

	getPageTitle();

}

@When("User have to click the Signin button")
public void user_have_to_click_the_Signin_button() {

Pojo1 p = new Pojo1();
targetClick(p.getSignin());

}

@When("User have to pass the valid usename and password")
public void user_have_to_pass_the_valid_usename_and_password() {

implicitWaiting(5000);
PojSign1 p = new PojSign1();
targetClick(p.getCookies());
passValue(p.getUsername(), "pradeap77@gmail.com");
passValue(p.getPassword(), "Pk@123456789");
}

@When("User have to click the Login button")
public void user_have_to_click_the_Login_button() {

PojSign1 p = new PojSign1();
targetClick(p.getLogin());

}

@Then("User have to verify the valid page or not")
public void user_have_to_verify_the_valid_page_or_not() {
String url = driver.getCurrentUrl();
if (url.contains("privacy_mutation_token")) {
System.out.println("invalid credential page");
} else {
System.out.println("valid credential page");
}

}



}




