package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ScriptedTestingPasswordTCValidationChallengePage extends BasePage {

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Scripted testing current challenge text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement currentChallengeText;
    //Scripted testing 'Password Validation' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberDivisionChallengeTitle;
    //Scripted testing 'Password Validation' test case section web elements
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement testCaseSectionTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Password Validation' test cases for validation web elements
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
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[9]")
    private WebElement testCaseNine;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[10]")
    private WebElement testCaseTen;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[11]")
    private WebElement testCaseEleven;
    //Scripted testing 'Password Validation' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValueText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengePasswordValidationResult;
    //button web elements
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    //Scripted testing 'Password Validation' halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Password Validation' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingPasswordTCValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //Scripted testing current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //Scripted testing test cases validation section title getter
    public String getScriptedTestingIndividualPageInstructionsChallengeTitle(){return testCaseSectionTitle.getText();}
    //Scripted testing test cases input form title getter
    public String getInputFormTitle(){return inputFormTitle.getText();}
    //Scripted testing number division challenge page title getter
    public String getNumberDivisionChallengeTitle() {return numberDivisionChallengeTitle.getText();}
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
    //challenge nine text getter
    public String getTestCaseNine(){return testCaseNine.getText();}
    //challenge ten text getter
    public String getTestCaseTen(){return testCaseTen.getText();}
    //challenge eleven text getter
    public String getTestCaseEleven(){return testCaseEleven.getText();}
    //Scripted testing input form 'entered value' text getter
    public String getEnteredValueText() {return enteredValueText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //Scripted testing password validation result getter
    public String getPasswordValidationResult() {return challengePasswordValidationResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Password validation challenge' web element assert methods
    //test case web element assert methods
    public boolean isPasswordValidationTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isPasswordValidationTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isPasswordValidationTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isPasswordValidationTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isPasswordValidationTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isPasswordValidationTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isPasswordValidationTestCaseSevenDisplayed(){return testCaseSeven.isDisplayed();}
    public boolean isPasswordValidationTestCaseEightDisplayed(){return testCaseEight.isDisplayed();}
    public boolean isPasswordValidationTestCaseNineDisplayed(){return testCaseNine.isDisplayed();}
    public boolean isPasswordValidationTestCaseTenDisplayed(){return testCaseTen.isDisplayed();}
    public boolean isPasswordValidationTestCaseElevenDisplayed(){return testCaseEleven.isDisplayed();}
    public boolean isPasswordValidationInputFieldDisplayed(){return passwordInputField.isDisplayed();}
}
