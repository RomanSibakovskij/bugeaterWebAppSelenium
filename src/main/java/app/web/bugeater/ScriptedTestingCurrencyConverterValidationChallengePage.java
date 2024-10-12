package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScriptedTestingCurrencyConverterValidationChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Scripted testing current challenge text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement currencyConverterInstructionsText;
    //guide button web element
    @FindBy(css = "svg#questionMark")
    private WebElement currencyConverterGuideButton;
    //Scripted testing 'Currency Converter' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement currencyConverterChallengeTitle;
    //Scripted testing 'Currency Converter' test case section web element
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Currency Converter' test cases for validation web elements
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li")
    private WebElement testCaseOne;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[2]")
    private WebElement testCaseTwo;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[3]")
    private WebElement testCaseThree;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[4]")
    private WebElement testCaseFour;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[5]")
    private WebElement testCaseFive;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[6]")
    private WebElement testCaseSix;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[7]")
    private WebElement testCaseSeven;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[8]")
    private WebElement testCaseEight;
    //Scripted testing 'Create Profile' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement conversionAmountInputField;
    //'Scripted Testing' currency from dropdown menu web element
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']//div")
    private WebElement currencyFromDropdownMenu;
    //'Scripted Testing' currency to dropdown menu web element
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']//div")
    private WebElement currencyToDropdownMenu;

    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeConversionResult;
    //button web elements
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement convertButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Currency Converter' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingCurrencyConverterValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //click 'convert' button method
    public void clickConvertButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(convertButton));
        convertButton.click();
    }

    //tutorial modal 'skip' button click method
    public void clickSkipTutorialButton(){tutorialSkipButton.click();}

    //click 'close' button method
    public void clickCloseModalButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(closeModalButton));
        closeModalButton.click();
    }

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //Scripted testing current challenge instructions text getter
    public String getCurrencyConverterInstructionsText() {return currencyConverterInstructionsText.getText();}
    //Scripted testing currency converter challenge page title getter
    public String getCurrencyConverterChallengeTitle() {return currencyConverterChallengeTitle.getText();}
    //Scripted testing challenges counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge one text getter
    public String getTestCaseOne(){return testCaseOne.getText();}
    //challenge two text getter
    public String getTestCaseTwo(){return testCaseTwo.getText();}
    //challenge three text getter
    public String getTestCaseThree(){return testCaseThree.getText();}
    //challenge four text getter
    public String getTestCaseFour(){return testCaseFour.getText();}
    //challenge five text getter
    public String getTestCaseFive(){return testCaseFive.getText();}
    //challenge six text getter
    public String getTestCaseSix(){return testCaseSix.getText();}
    //challenge seven text getter
    public String getTestCaseSeven(){return testCaseSeven.getText();}
    //challenge eight text getter
    public String getTestCaseEight(){return testCaseEight.getText();}
    //Scripted testing input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //Scripted testing currency conversion result getter
    public String getConversionResult() {return challengeConversionResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Change profile challenge' web element assert methods
    public boolean isCurrencyConverterGuideIconDisplayed(){return currencyConverterGuideButton.isDisplayed();}
    //test case web element assert methods
    public boolean isChangeProfileTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isChangeProfileTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isChangeProfileTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isChangeProfileTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isChangeProfileTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isChangeProfileTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isChangeProfileTestCaseSevenDisplayed(){return testCaseSeven.isDisplayed();}
    public boolean isChangeProfileTestCaseEightDisplayed(){return testCaseEight.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed(){return enteredValuesText.isDisplayed();}
    public boolean isCurrencyFromDropdownMenuDisplayed(){return currencyFromDropdownMenu.isDisplayed();}
    public boolean isCurrencyToDropdownMenuDisplayed(){return currencyToDropdownMenu.isDisplayed();}
}
