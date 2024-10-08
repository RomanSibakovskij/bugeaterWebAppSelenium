package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnModeUpdateProfilePage extends BasePage{

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
    private WebElement updateProfileChallengeTitle;
    @FindBy(css = "svg#questionMark")
    private WebElement updateProfileGuideButton;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement instructionsTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //'Number Addition' challenge web elements
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
    //'Number Addition' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement nicknameInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='third']")
    private WebElement lastNameInputField;
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

    public LearnModeUpdateProfilePage(WebDriver driver) {
        super(driver);
    }

    //update profile input methods (for challenge 1)
    public void inputUpdateProfileChallenge1Nickname1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("skyline7");
    }
    public void inputUpdateProfileChallenge1FirstName1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys("Michael");
    }
    public void inputUpdateProfileChallenge1LastName1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Henderson");
    }
    //update profile input methods (for challenge 2) (inputs shorter than min length)
    public void inputUpdateProfileChallenge2Nickname2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("k_3");
    }
    public void inputUpdateProfileChallenge2FirstName2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys("J");
    }
    public void inputUpdateProfileChallenge2LastName2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Z");
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

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //number addition challenge page title getter
    public String getUpdateProfileChallengeTitle() {return updateProfileChallengeTitle.getText();}
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
    //calculation result getter
    public String getUpdateProfileResult() {return challengeUpdateProfileResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Update profile challenge' web element assert methods
    public boolean isUpdateProfileChallengePageTitleDisplayed(){return updateProfileChallengeTitle.isDisplayed();}
    public boolean isUpdateProfileChallengeGuideIconDisplayed(){return updateProfileGuideButton.isDisplayed();}
    public boolean isInstructionsTitleDisplayed(){return instructionsTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    public boolean isUpdateProfileChallengeOneDisplayed(){return challengeOne.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed() {return enteredValuesText.isDisplayed();}
    public boolean isNicknameInputFieldDisplayed() {return nicknameInputField.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isUpdateProfileResultDisplayed() {return challengeUpdateProfileResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isClearButtonDisplayed() {return clearFormButton.isDisplayed();}
    public boolean isSubmitButtonDisplayed() {return submitButton.isDisplayed();}
}
