package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class seleniumUtility extends BaseSetup {

    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20));
    }
    private WebElement WaitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // create  a methode to click on a given locator
    public void clickOnElement(By locator){
      getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendText(By locator,String value){
     WaitForVisibility(locator).sendKeys(value);

    }
    public String getElementText(By locator) {
      return  WaitForVisibility(locator).getText();

    }
    public boolean isElementEnabled(By locator){
        return WaitForVisibility(locator).isEnabled();

    }
    public  boolean isElementDispaled(By locator){
        return WaitForVisibility(locator).isDisplayed();

    }

}
