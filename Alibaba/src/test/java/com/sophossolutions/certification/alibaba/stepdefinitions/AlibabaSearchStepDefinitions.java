package com.sophossolutions.certification.alibaba.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.certification.alibaba.models.SearchExpressions;
import static com.sophossolutions.certification.alibaba.models.build.DetailBuilder.myEmail;
import com.sophossolutions.certification.alibaba.tasks.FindProduct;
import com.sophossolutions.certification.alibaba.tasks.MakeContact;
import com.sophossolutions.certification.alibaba.tasks.OpenTheBrowser;
import com.sophossolutions.certification.alibaba.tasks.SearchWord;
import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;

/*
 * Steps Definitions
 */
public class AlibabaSearchStepDefinitions {

	//Definition of driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	Object [] ventana;
	
	//Definition of actor
	private Actor andres = Actor.named("andres");
	//Initialization of Principal Page
	private AlibabaHomePage alibabaHomePage;

	//Initialization of actor
	@Before
	public void setUp() {
		andres.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^I into Alibaba$")
	public void iIntoAlibaba() {
		andres.wasAbleTo(OpenTheBrowser.on(alibabaHomePage));
	}
		
	@When("^I search for an article (.*)$")
	public void iSearchForAnArticle(String product) {
		andres.attemptsTo(SearchWord.the(new SearchExpressions(product)));;
	}

	@When("^find some with at less diamonds$")
	public void findSomeWithAtLessDiamonds() {
		andres.attemptsTo(FindProduct.with());
		ventana = hisBrowser.getWindowHandles().toArray();
		andres.attemptsTo(Switch.toWindow(ventana[1].toString()));
	}

	@When("^contact with supplier (.*) (.*)$")
	public void contactWithSupplier(String email, String detail) {
		andres.attemptsTo(MakeContact.with(myEmail(email).andAskFor(detail).andAQuantityOf(100)));
	}

	@Then("^I validate the outcomes$")
	public void iValidateTheOutcomes() {
	    // Write code here that turns the phrase above into concrete actions

	}
}
