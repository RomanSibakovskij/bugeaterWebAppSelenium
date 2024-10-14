package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExploratoryTestingCalculatorChallengePage extends BasePage {

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Exploratory testing 'Calculator' challenge text web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement exploratoryTestingChallengeTitle;
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement exploratoryTestingInstructionsText;
    //guide button web element
    @FindBy(css = "svg#questionMark")
    private WebElement exploratoryTestingGuideButton;
    //Exploratory testing 'Calculator' test case section web elements
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement exploratoryTestingTestCaseSectionTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;

    //Exploratory testing 'Calculator' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement exploratoryTestingInputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement numberOneInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement numberTwoInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement exploratoryTestingResult;
    //Exploratory testing 'Calculator' halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Exploratory testing 'Calculator' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;
    //button web elements
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement exploratoryTestingClearFormButton;
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    @FindBy(xpath = "//button[@class='_challengeButtons_1a4cy_115 btn btn-outline-danger']")
    private WebElement exploratoryTestingStartOverButton;

    public ExploratoryTestingCalculatorChallengePage(WebDriver driver) {
        super(driver);
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
    //Exploratory testing challenge instructions text getter
    public String getExploratoryTestingInstructionsText() {return exploratoryTestingInstructionsText.getText();}
    //Exploratory testing test cases validation section title getter
    public String getExploratoryTestingTestCaseSectionTitle(){return exploratoryTestingTestCaseSectionTitle.getText();}
    //Exploratory testing test cases input form title getter
    public String getExploratoryTestingInputFormTitle(){return exploratoryTestingInputFormTitle.getText();}
    //Exploratory testing challenge page title getter
    public String getExploratoryTestingChallengeTitle() {return exploratoryTestingChallengeTitle.getText();}
    //Exploratory testing 'Calculator' counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //Exploratory testing test calculation result getter
    public String getExploratoryTestingResult() {return exploratoryTestingResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Exploratory testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Exploratory testing' page web element assert methods
    public boolean isExploratoryTestingPageTitleDisplayed(){return exploratoryTestingChallengeTitle.isDisplayed();}
    public boolean isExploratoryTestingGuideIconDisplayed(){return exploratoryTestingGuideButton.isDisplayed();}
    public boolean isExploratoryTestingTestCaseSectionTitleDisplayed(){return exploratoryTestingTestCaseSectionTitle.isDisplayed();}
    public boolean isExploratoryTestingChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}
    public boolean isExploratoryTestingChallengeInstructionsTextDisplayed(){return exploratoryTestingInstructionsText.isDisplayed();}
    public boolean isExploratoryTestingInputFormTitleDisplayed() {return exploratoryTestingInputFormTitle.isDisplayed();}
    public boolean isExploratoryTestingInputFormEnteredValuesDisplayed() {return enteredValuesText.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isNumber1InputFieldDisplayed() {return numberOneInputField.isDisplayed();}
    public boolean isNumber2InputFieldDisplayed() {return numberTwoInputField.isDisplayed();}
    public boolean isCalculationResultDisplayed() {return exploratoryTestingResult.isDisplayed();}
    public boolean isExploratoryTestingStartOverButtonDisplayed() {return exploratoryTestingStartOverButton.isDisplayed();}
    public boolean isExploratoryTestingClearFormButtonDisplayed(){return exploratoryTestingClearFormButton.isDisplayed();}
    public boolean isCalculateButtonDisplayed() {return calculateButton.isDisplayed();}
}
