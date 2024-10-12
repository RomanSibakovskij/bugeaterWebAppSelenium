package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class TCGNumSummationTCValidationChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Number summation challenge page title web element
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberSummationChallengePageTitle;
    //Number summation instructions text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement numberSummationInstructionsText;
    //guide button web element
    @FindBy(css = "svg#questionMark")
    private WebElement numberSummationGuideButton;
    //video guide link web element
    @FindBy(xpath = "//a[@id='videoLink']")
    private WebElement videoGuideLink;
    //'Number Summation' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/h2")
    private WebElement testCaseBuildChallengeTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement testCaseFoundChallengeTitle;
    //'Number Summation' test case section web element
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;

    //'Number Summation' test case option one dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/span[1]/div[@class='dropdown']")
    private WebElement testCaseOptionOneDropdownMenu;

    //'Number Summation' test case option two dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/span[2]/div[@class='dropdown']")
    private WebElement testCaseOptionTwoDropdownMenu;

    //'Number Summation' test case result dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/div[@class='dropdown']")
    private WebElement testCaseOptionResultDropdownMenu;

    //'Number Summation' test case validation button web element
    @FindBy(xpath = "//div[@class='_challengeFormActions_1a4cy_109']/button[@type='button']")
    private WebElement testCaseValidateButton;

    //'Number Summation' test cases found web element
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li")
    private WebElement testCaseOne;

    //'Number Summation' start over web element
    @FindBy(xpath = "//div[@id='testCases']/button[@type='reset']")
    private WebElement startOverButton;

    //'Number Summation' input form web elements
    @FindBy(xpath = "//input[@id='first']")
    private WebElement numberOneAmountInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement numberTwoAmountInputField;
    //'Number Summation' test case challenge hint web element
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    //'Number Summation' test case found result web element
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeCalculationResult;
    //calculate button web element
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Number Summation' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;


    public TCGNumSummationTCValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //click 'calculate' button method
    public void clickCalculateButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));
        calculateButton.click();
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
    //Number summation challenge page title getter
    public String getNumberSummationChallengePageTitle() {return numberSummationChallengePageTitle.getText();}
    //Number summation instructions text getter
    public String getNumberSummationInstructionsText() {return numberSummationInstructionsText.getText();}
    //Number summation test cases build title getter
    public String getTestCasesBuildTitle() {return testCaseBuildChallengeTitle.getText();}
    //Number summation test cases found title getter
    public String getTestCasesFoundTitle() {return testCaseFoundChallengeTitle.getText();}
    //Scripted testing challenges counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge one text getter
    public String getTestCaseOne(){return testCaseOne.getText();}
    //Number summation calculation result getter
    public String getCalculationResult() {return challengeCalculationResult.getText();}
    //challenge hint text getter
    public String getChallengeHint(){return challengeHintText.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number Summation challenge' web element assert methods
    public boolean isNumberSummationChallengePageTitleDisplayed(){return numberSummationChallengePageTitle.isDisplayed();}
    public boolean isNumberSummationChallengeInstructionsTextDisplayed(){return numberSummationInstructionsText.isDisplayed();}
    public boolean isNumberSummationGuideIconDisplayed(){return numberSummationGuideButton.isDisplayed();}
    public boolean isNumberSummationVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isNumberSummationTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isNumberSummationOptionOneDropdownMenuDisplayed(){return testCaseOptionOneDropdownMenu.isDisplayed();}
    public boolean isNumberSummationOptionTwoDropdownMenuDisplayed(){return testCaseOptionTwoDropdownMenu.isDisplayed();}
    public boolean isNumberSummationResultDropdownMenuDisplayed(){return testCaseOptionResultDropdownMenu.isDisplayed();}
    public boolean isNumberSummationStartOverButtonDisplayed(){return startOverButton.isDisplayed();}
    public boolean isNumberSummationTestCaseValidationButtonDisplayed(){return testCaseValidateButton.isDisplayed();}
    public boolean isNumberSummationCalculationResultDisplayed(){return challengeCalculationResult.isDisplayed();}
    public boolean isNumberSummationNumberOneInputFieldDisplayed(){return numberOneAmountInputField.isDisplayed();}
    public boolean isNumberSummationNumberTwoInputFieldDisplayed(){return numberTwoAmountInputField.isDisplayed();}
    public boolean isNumberSummationChallengeHintDisplayed(){return challengeHintText.isDisplayed();}
    public boolean isNumberSummationCalculateButtonDisplayed(){return calculateButton.isDisplayed();}

}
