package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LearnModeNumMultiplicationPage extends BasePage{

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
    //'Number multiplication' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberMultiplicationChallengeTitle;
    @FindBy(css = "svg#questionMark")
    private WebElement numberMultiplicationGuideButton;
    @FindBy(xpath = "//a[@id='videoLink']")
    private WebElement videoGuideLink;
    //'Number multiplication test case section web elements
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/h2")
    private WebElement testCaseTitle;
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/span[1]/div[@class='dropdown'][1]/button[@id='dropdown-basic']")
    private WebElement testCaseDropdownValue1Menu;
    //value 1 menu select options web element
    @FindBy(xpath = "//span[1]/div[@class='show dropdown']/div/a[1]")
    private WebElement testCaseValue1MenuOptionTwo;
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/span[2]/div[@class='dropdown'][1]/button[@id='dropdown-basic']")
    private WebElement testCaseDropdownValue2Menu;
    //value 2 menu select options web element
    @FindBy(xpath = "//span[2]/div[@class='show dropdown']/div/a[1]")
    private WebElement testCaseValue2MenuOptionTwo;
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/div[@class='dropdown']")
    private WebElement testCaseDropdownResultMenu;
    //result menu select options web element
    @FindBy(xpath = "//div[@class='show dropdown']/div/a[1]")
    private WebElement testCaseResultMenuOptionResult;
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/div/button[@class='_challengeButtons_1a4cy_115 btn btn-primary']")
    private WebElement testCaseValidationButton;

    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement instructionsTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //'Number multiplication' challenge web elements
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li")
    private WebElement challengeOne;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[2]")
    private WebElement challengeTwo;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[3]")
    private WebElement challengeThree;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[4]")
    private WebElement challengeFour;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[5]")
    private WebElement challengeFive;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[6]")
    private WebElement challengeSix;
    //'Number Multiplication' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement numberOneInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement numberTwoInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeUpdateProfileResult;
    //button web elements
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement clearFormButton;
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//button[@class='_challengeButtons_1a4cy_115 btn btn-outline-danger']")
    private WebElement startOverButton;
    //halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //'Number Addition' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public LearnModeNumMultiplicationPage(WebDriver driver) {
        super(driver);
    }

    //tutorial modal 'skip' button click method
    public void clickSkipTutorialButton(){tutorialSkipButton.click();}

    //click 'submit' button method
    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    //click 'close' button method
    public void clickCloseModalButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(closeModalButton));
        closeModalButton.click();
    }
    //test case dropdown menu click methods
    public void clickTestCaseDropdownMenu1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseDropdownValue1Menu));
        testCaseDropdownValue1Menu.click();
    }
    public void clickTestCaseDropdownMenu2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseDropdownValue2Menu));
        testCaseDropdownValue2Menu.click();
    }
    public void clickTestCaseDropdownResultMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseDropdownResultMenu));
        testCaseDropdownResultMenu.click();
    }

    //click 'validate test case' button method
    public void clickTestCaseValidationButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseValidationButton));
        testCaseValidationButton.click();
    }

    //test case 'value 1' dropdown menu select method (option two)
    public void selectDropdownValueMenu1OptionTwo(){testCaseValue1MenuOptionTwo.click();}
    //test case 'value 2' dropdown menu select method (option two)
    public void selectDropdownValueMenu2OptionTwo(){testCaseValue2MenuOptionTwo.click();}
    //test case 'result' dropdown menu select method (option result)
    public void selectDropdownValueMenu1OptionResult(){testCaseResultMenuOptionResult.click();}

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //number multiplication challenge page title getter
    public String getNumberMultiplicationChallengeTitle() {return numberMultiplicationChallengeTitle.getText();}
    //challenges counter getter (before challenge one completion)
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge one text getter
    public String getChallengeOne(){return challengeOne.getText();}
    //challenge two text getter
    public String getChallengeTwo(){return challengeTwo.getText();}
    //challenge three text getter
    public String getChallengeThree(){return challengeThree.getText();}
    //challenge four text getter
    public String getChallengeFour(){return challengeFour.getText();}
    //challenge five text getter
    public String getChallengeFive(){return challengeFive.getText();}
    //challenge six text getter
    public String getChallengeSix(){return challengeSix.getText();}
    //input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //calculation result getter
    public String getCalculationResult() {return challengeUpdateProfileResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number multiplication challenge' web element assert methods
    public boolean isNumberMultiplicationPageTitleDisplayed(){return numberMultiplicationChallengeTitle.isDisplayed();}
    public boolean isNumberMultiplicationGuideIconDisplayed(){return numberMultiplicationGuideButton.isDisplayed();}
    public boolean isVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isTestCaseSectionTitleDisplayed(){return testCaseTitle.isDisplayed();}
    public boolean isTestCaseDropdownValue1MenuDisplayed(){return testCaseDropdownValue1Menu.isDisplayed();}
    public boolean isTestCaseDropdownValue2MenuDisplayed(){return testCaseDropdownValue2Menu.isDisplayed();}
    public boolean isTestCaseDropdownResultMenuDisplayed(){return testCaseDropdownResultMenu.isDisplayed();}
    public boolean isTestCaseValidationButtonDisplayed(){return testCaseValidationButton.isDisplayed();}
    public boolean isInstructionsTitleDisplayed(){return instructionsTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    public boolean isNumberMultiplicationChallengeOneDisplayed(){return challengeOne.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed() {return enteredValuesText.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isNumber1InputFieldDisplayed() {return numberOneInputField.isDisplayed();}
    public boolean isNumber2InputFieldDisplayed() {return numberTwoInputField.isDisplayed();}
    public boolean isCalculationResultDisplayed() {return challengeUpdateProfileResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isCalculateButtonDisplayed() {return submitButton.isDisplayed();}
}
