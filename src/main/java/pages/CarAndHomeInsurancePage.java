package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestHelper;

public class CarAndHomeInsurancePage {
    private WebDriver driver;
    private By byNameInputField = By.id("name");
    private By bySurnameInputField = By.id("surname");
    private By byCellPhoneNumber = By.id("cell");
    private By byEmailInputField = By.id("email");
    private By byIdRadioBtn = By.xpath("//label[@title='ID number']");
    private By byIdField = By.id("idField");
    private By byPassportRadionBtn = By.xpath("Passport number");
    private By byPassportField = By.id("passportField");
    private By bySelectGender = By.xpath("//select[@name='selectGender']");
    private By byDateOfBirth = By.id("dob");
    private By bySelectYearWithPrevious = By.xpath("//select[@name='selectYearsWithPrevious']");
    private By byConsentCheckBox = By.xpath("//input[@name='consent']");
    private By byNextBtn = By.xpath("//span[text()='Next']");
    private By byRegistratingRadioBtn = By.xpath("//label[text()='Registration number']");
    private By byRegistrationInput = By.id("regInput");
    private By bySearchBtn = By.xpath("//span[text()='Search']");
    private By byContinueBtn = By.xpath("//span[text()=\"Yes, let's continue\"]");
    private By bySuburbInput = By.id("suburb");
    private By bySelectSecurity = By.xpath("//select[@name='selectSecurity']");
    private By byYesFreqDriver = By.xpath("//label[text()='Yes']");
    private By byNoFreqDriver = By.xpath("//label[text()='No']");
    private By byGetAQuoteBtn = By.xpath("//span[text()='Get a quote']");

    public CarAndHomeInsurancePage(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String name){
        TestHelper.fillText(this.driver, byNameInputField, name);
    }

    public void setSurname(String surname){
        TestHelper.fillText(this.driver, bySurnameInputField, surname);
    }

    public void setCellPhoneNumber(String cellPhoneNumber){
        TestHelper.fillText(this.driver, byCellPhoneNumber, cellPhoneNumber);
    }

    public void setEmail(String email){
        TestHelper.fillText(this.driver, byEmailInputField, email);
    }

    public void selectIdentityOption(String option){
        if (option.equals("ID Number")) TestHelper.click(this.driver, byIdRadioBtn); else {TestHelper.click(this.driver, byPassportRadionBtn);}
    }

    public void selectYearWithPrevious(String visibleText){
        TestHelper.selectByVisibleText(this.driver, bySelectYearWithPrevious, visibleText);
    }

    public void selectConsent(){
        TestHelper.click(this.driver, byConsentCheckBox);
    }
}
