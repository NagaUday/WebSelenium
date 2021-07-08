package com.webframework.StepDefination;

import Pages.WelcomePage.Footer.FooterPage;
import Pages.WelcomePage.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDefination{

    WelcomePage welcomePage = new WelcomePage();


    @Given("I launch the application")
    public void iLaunchTheApplication() {
        welcomePage.LanuchApplication();
    }


    @And("I should be able to see the footer on homepage")
    public void iShouldBeAbleToSeeTheFooterOnHomepage() throws Exception {
        welcomePage.Footer.NavigateToFooter();
    }

    @And("I should be able to see {string} footer")
    public void iShouldBeAbleToSeeFooter(String arg0) {
        Assert.assertTrue(welcomePage.Footer.IsAllFooterTitleDispalyed(arg0), "UNABLE TO LOCATE "+arg0);
    }


    @When("I dismiss the PopUP window")
    public void iDismissThePopUPWindow() throws InterruptedException {
        welcomePage.DismissPopUpWindow();
    }

    @And("I should be able to see {string} under SUPPORT")
    public void iShouldBeAbleToSeeUnderSUPPORT(String arg0) {
        Assert.assertTrue(welcomePage.Footer.ValidateTheFooterBulletOptions(arg0));
    }
}
