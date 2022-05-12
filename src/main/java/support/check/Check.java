package support.check;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check extends PageObject {

    //Verify <element> is displayed, if not show <message>
    public void checkElementDisPlayed(WebElement element, String message){
        Assert.assertTrue(message,element.isDisplayed());
    }

    //Verify <element> is enabled, if not show <message>
    public void checkElementEnabled(WebElement element,String message) {
        Assert.assertTrue(message,element.isEnabled());
    }

    //Verify <element> is enabled, if not show <message>
    public void checkElementNotEnabled(WebElement element,String message) {
        Assert.assertFalse(message,element.isEnabled());
    }

    //Verify <element> is selected, if not show <message>
    public void checkElementSelected(WebElement element,String message){
        Assert.assertTrue(message,element.isSelected());
    }

    //Verify <element> contains text that equals with expected text, if not show <message>
    public void checkContainText(WebElement webElement, String expectedText, String message){
        String content = webElement.getText();
        System.out.println(content);
        Assert.assertTrue(message,content.equals(expectedText));
    }

    //Verify that the url is displayed correctly matching with the current url
    public void checkContainUrlText( String actualText, String expectedText, String message){
        Assert.assertTrue(message,actualText.equals(expectedText));
    }

    //Verify that navigate to correct <expected url>, if not show <message>
    public void checkURL(WebDriver driver, String expectedUrl, String message){
        Assert.assertEquals(message, expectedUrl,  driver.getCurrentUrl());
    }

    //Verify <element> contains value that equals with expected text, if not show <message>
    public void checkEqualValue(WebElement webElement, String expectedText, String message){
        String text = webElement.getAttribute("value");
        Assert.assertTrue(message,text.equals(expectedText));
    }
}

