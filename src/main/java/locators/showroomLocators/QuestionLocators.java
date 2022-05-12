package locators.showroomLocators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionLocators extends PageObject {
    //Homepage button
    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public WebElement backHomePageButton;

    //Common all question page
    @FindBy (xpath = "//button[contains(text(),'Next')]")
    public WebElement nextButton;
    @FindBy (xpath = "//button[contains(text(),'Back')]")
    public WebElement backToPreviousQuestionButton;


    //Question 1
    @FindBy (css = ".text-question")
    public WebElement q1Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement q1InputDate;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q1ErrorMess;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/a[1]")
    public WebElement q1LinkToEmail;

    //Question 2
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")
    public WebElement q2Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q2ErrorMess;
    @FindBy (xpath = "//div[contains(text(),'Yes')]")
    public WebElement yesButton;
    @FindBy (xpath = "//div[contains(text(),'No')]")
    public WebElement noButton;

    //Question 3
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]")
    public WebElement q3Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q3ErrorMess;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[3]/div/div/div/div/div[1]")
    public WebElement q3_yesButton;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[3]/div/div/div/div/div[2]")
    public WebElement q3_noButton;

    //Question 4
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/p[1]")
    public WebElement q4Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q4ErrorMess;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[4]/div/div/div/div/div[1]")
    public WebElement q4_yesButton;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[4]/div/div/div/div/div[2]")
    public WebElement q4_noButton;

    //Question 5
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/p[1]")
    public WebElement q5Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/label[1]")
    public WebElement q5Answer1;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/label[2]")
    public WebElement q5Answer2;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/label[3]")
    public WebElement q5Answer3;

    //Question 6
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/p[1]")
    public WebElement q6Content;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement q6InputData;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q6ErrorMess;

    //Question 7
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/p[1]")
    public WebElement q7Content;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[7]/div/div/div/div/label[1]")
    public WebElement q7Answer1;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[7]/div/div/div/div/label[2]")
    public WebElement q7Answer2;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q7ErrorMess;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/main/div/div[2]/div/div/div/div[7]/div/div/div/div/label[3]")
    public WebElement q7Answer3;

    //Question 8
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement q8Content;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]")
    public WebElement q8HelpButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
    public WebElement q8AnswerNo;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/label[2]")
    public WebElement q8Answer1000;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/label[3]")
    public WebElement q8Answer2000;

    //Question 9
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]")
    public WebElement q9Content;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")
    public WebElement q9HelpButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]")
    public WebElement q9Answer12;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[2]/label[2]")
    public WebElement q9Answer24;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[2]/label[3]")
    public WebElement q9Answer36;

    //Question 10
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/div[1]/p[1]")
    public WebElement q10Content;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]/*[1]")
    public WebElement q10HelpButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]")
    public WebElement q10AnswerYes;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/div[2]/label[2]")
    public WebElement q10AnswerNo;

    //Question 11
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[4]/div[1]/p[1]")
    public WebElement q11Content;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]/*[1]")
    public WebElement q11HelpButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[4]/div[2]/label[1]")
    public WebElement q11AnswerYes;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[4]/div[2]/label[2]")
    public WebElement q11AnswerNo;

    //Question 12
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[5]/div[1]/p[1]")
    public WebElement q12Content;
    @FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[5]/div[1]/button[1]/*[1]")
    public WebElement q12HelpButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[5]/div[2]/label[1]")
    public WebElement q12AnswerYes;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[5]/div[2]/label[2]")
    public WebElement q12AnswerNo;

    //Total premium
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/p[1]/span[1]")
    public WebElement totalPremium;
}
