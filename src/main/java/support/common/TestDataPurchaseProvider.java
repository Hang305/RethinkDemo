package support.common;

import support.actions.ExcelReaderUtils;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class TestDataPurchaseProvider implements Variable {
    private WebDriver driver;

    String excelFileName = "TestData.xlsx", expectedResult = "";
    File excelFileLocation = new File(System.getProperty("user.dir") + "/src/test/resources/Data/" + excelFileName);
    int startRowIndex = 1, startColIndex = 0, totalRow, totalCol;

    public TestDataPurchaseProvider(WebDriver driver) {
        this.driver = driver;
        this.driver.get(BASE_URL);

    }
    //Read a file excel for email field with invalid data
    public void EmailInvalidDataTest(String msg) {
        String sheetName = "email_Invalid";
        ExcelReaderUtils excelReaderUtils = new ExcelReaderUtils(excelFileLocation, sheetName, startRowIndex, startRowIndex);
        totalRow = excelReaderUtils.getTotalRow();
        totalCol = excelReaderUtils.getTotalColumn();

        Object[][] emailData = new Object[totalRow - startRowIndex][totalCol - startColIndex];
        for (int startRow = startRowIndex; startRow < totalRow; startRow++) {
            emailData[startRow - startRowIndex][startColIndex] = excelReaderUtils.getCellValue(startRow, startColIndex);
            emailData[startRow - startRowIndex][startColIndex + 1] = excelReaderUtils.getCellValue(startRow, startColIndex + 1);

//            Login login = new Login(emailData[startRow - startRowIndex][startColIndex].toString(), emailData[startRow - startRowIndex][startColIndex + 1].toString());
//            loginPage.login(login.getEmail(), login.getPassword());
//            helperAction.equals(loginPage.emailErrorElement(), msg);
//            loginPage.clear();
        }
    }
}
