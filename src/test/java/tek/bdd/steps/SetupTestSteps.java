package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.seleniumUtility;

import static org.openqa.selenium.By.className;

public class SetupTestSteps extends seleniumUtility {

    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
        String topLeftCornerText =getElementText(By.className("top-nav__logo"));
        Assert.assertEquals("TEKSCHOOL",topLeftCornerText);
    }


    @Then("Validate Sign in button is Enabled")
    public void ValidateSignInButtonIsEnabled(){
        boolean isSignInBtnEnabled=isElementEnabled(By.id("signinLink"));
        Assert.assertTrue(isSignInBtnEnabled);
    }
}
