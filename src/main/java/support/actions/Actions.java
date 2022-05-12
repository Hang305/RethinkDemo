package support.actions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions extends PageObject{

    //Clear input field
    public void clearInputField(WebElement element){
        element.clear();
    }

    //Click element
    public void clickElement(WebElement element) {
        element.click();
    }

    //Send key
    public void enterData(WebElement element, String content){
        element.sendKeys(content);
    }

    //Get text
    public String getText(WebElement element){
        return element.getText();
    }

    //Refresh page
    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    //Delete cookies
    public void deleteCookies(Cookie cookie) {
        getDriver().manage().deleteCookie(cookie);
    }

    //Delete all cookies
    public void deleteAllCookies() { getDriver().manage().deleteAllCookies();}

    //Dropdown static using value
    public static void selectDropdownList(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    //Wait time
    public void waitTime(int time) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
    }

    // Click on tab
    public void clickOnTab(WebElement webElement){
        webElement.sendKeys(Keys.TAB);
    }

    //Select element of the static dropdown with index start from 0,1,2..
    public void selectByIndex (WebElement webElement, Integer index){
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

    //Select element of the static dropdown with get text is displayed
    public void selectGetText (WebElement webElement, String optionName){
        Select select = new Select(webElement);
        select.selectByVisibleText(optionName);
    }

    //Select element of the static dropdown with value of option
    public void selectGetValueOfOption (WebElement webElement, String valueOptionName){
        Select select = new Select(webElement);
        select.selectByValue(valueOptionName);
    }

    //    public void checkSelected(WebElement element){
//        element.isSelected();
//    }
//
//    public boolean checkIsDisplay(WebElement element) {
//        return element.isDisplayed();
//    }
//
//    public void checkIsEnable(WebElement element){
//        element.isEnabled();
//    }
//
//    public String getAttribute( WebElement element, String value){
//        return element.getAttribute(value);
//    }
//
    public String getUrl(){
        return getDriver().getCurrentUrl();
    }

}
