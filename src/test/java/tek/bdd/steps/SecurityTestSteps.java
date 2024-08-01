package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.utility.seleniumUtility;

public class SecurityTestSteps extends seleniumUtility {

    @When("user click on sign in link")
    public void user_click_on_sign_in_link(){
        clickOnElement(HomePage.signInLink);

    }
    @Then("validate user is in sign in page")
    public void Validate_user_is_in_sign_in_page(){
        String pageSubTitle=getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("sign in",pageSubTitle);
    }
    @When("user enter username and password and click on login")
    public void user_enter_username_and_password_and_click_on_login() {
        sendText(SignInPage.EMIL_INPUT, "khatiramoradi150@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT, "Khatira@123");
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @When("user entre {String}and{String}and click on login")
    public void userEnterUserNameAndPassword(String username,String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @Then("user should be able to see account link")
    public void user_should_be_able_to_see_account_link(){
        boolean IsAccountDisplayed=isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(IsAccountDisplayed);

    }


}
