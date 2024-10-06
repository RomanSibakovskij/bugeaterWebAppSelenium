package app.web.bugeater;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NumberAdditionChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //current challenge text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement currentChallengeText;
    //'Number Addition' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberAdditionChallengeTitle;
    @FindBy(css = "svg#questionMark")
    private WebElement numberAdditionGuideButton;
    @FindBy(xpath = "//a[@id='videoLink']")
    private WebElement videoGuideLink;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement instructionsTitle;
    @FindBy(xpath = "//p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //'Number Addition' challenge list web element
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li")
    private WebElement challengeOne;
    //'Number Addition' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(css = "#testForm p:nth-child(3)")
    private WebElement inputFormEnteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement number1InputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement number2InputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p")
    private WebElement calculationResult;
    //button web elements
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement clearFormButton;
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    @FindBy(xpath = "//button[@class='_challengeButtons_1a4cy_115 btn btn-outline-danger']")
    private WebElement startOverButton;

    //number addition input data
    private int number1 = 1;
    private int number2 = 2;

    public NumberAdditionChallengePage(WebDriver driver) {
        super(driver);
    }

    //number addition input methods
    public void inputNumber1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(number1));
    }
    public void inputNumber2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(number2));
    }

    //click 'calculate' button method
    public void clickCalculateButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));
        calculateButton.click();
    }

    //tutorial modal 'skip' button click method
    public void clickSkipTutorialButton(){tutorialSkipButton.click();}

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //number addition challenge page title getter
    public String getNumberAdditionChallengeTitle() {return numberAdditionChallengeTitle.getText();}
    //instructions title getter
    public String getNumberAdditionInstructionsTitle() {return instructionsTitle.getText();}
    //challenges counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge one text getter
    public String getChallengeOne(){return challengeOne.getText();}
    //input form title getter
    public String getInputFormTitle() {return inputFormTitle.getText();}
    //input form 'entered values' text getter
    public String getInputFormEnteredValuesText() {return inputFormEnteredValuesText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //calculation result getter
    public String getCalculationResultText() {return calculationResult.getText();}

    //'Number Addition challenge' web element assert methods
    public boolean isNumberAdditionChallengePageTitleDisplayed(){return numberAdditionChallengeTitle.isDisplayed();}
    public boolean isNumberAdditionChallengeGuideIconDisplayed(){return numberAdditionGuideButton.isDisplayed();}
    public boolean isVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isInstructionsTitleDisplayed(){return instructionsTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    public boolean isNumberAdditionChallengeOneDisplayed(){return challengeOne.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed() {return inputFormEnteredValuesText.isDisplayed();}
    public boolean isNumber1InputFieldDisplayed() {return number1InputField.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isNumber2InputFieldDisplayed() {return number2InputField.isDisplayed();}
    public boolean isCalculationResultDisplayed() {return calculationResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isClearButtonDisplayed() {return clearFormButton.isDisplayed();}
    public boolean isCalculateButtonDisplayed() {return calculateButton.isDisplayed();}

}
