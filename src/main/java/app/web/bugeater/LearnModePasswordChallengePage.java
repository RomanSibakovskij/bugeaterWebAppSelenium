package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LearnModePasswordChallengePage extends BasePage{

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
    private WebElement passwordRestoreChallengeTitle;
    @FindBy(css = "svg#questionMark")
    private WebElement passwordRestoreGuideButton;
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
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[7]")
    private WebElement challengeSeven;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[8]")
    private WebElement challengeEight;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[9]")
    private WebElement challengeNine;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[10]")
    private WebElement challengeTen;
    @FindBy(xpath = "//ol[@class='_learnChallengeList_1erpu_1']/li[11]")
    private WebElement challengeEleven;
    //'Number Addition' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValueText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengePasswordRestoreResult;
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


    public LearnModePasswordChallengePage(WebDriver driver) {
        super(driver);
    }

    //password restore input method (for challenge 1)
    public void inputPasswordRestoreChallenge1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("P@ssw0rD");
    }
    //password restore input method (for challenge 2) (invalid password input - doesn't meet requirements)
    public void inputPasswordRestoreChallenge2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("hElloW0rld");
    }
    //password restore input method (for challenge 3) (invalid password input - pre-existing)
    public void inputPasswordRestoreChallenge3(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("Passw0rd!7");
    }
    //password restore input method (for challenge 4) (empty password input)
    public void inputPasswordRestoreChallenge4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("");
    }
    //password restore input method (for challenge 5) (invalid password input - too short)
    public void inputPasswordRestoreChallenge5(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("Mo7%");
    }
    //password restore input method (for challenge 6) (invalid password input - too long)
    public void inputPasswordRestoreChallenge6(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("asdfghjklpoiuytrewq");
    }
    //password restore input method (for challenge 7) (invalid password input - uppercase letters only)
    public void inputPasswordRestoreChallenge7(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("ONLYCAPITAL");
    }
    //password restore input method (for challenge 8) (invalid password input - lowercase letters only)
    public void inputPasswordRestoreChallenge8(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("onlylower");
    }
    //password restore input method (for challenge 9) (invalid password input - digits only)
    public void inputPasswordRestoreChallenge9(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("001122");
    }
    //password restore input method (for challenge 10) (invalid password input - special symbols only)
    public void inputPasswordRestoreChallenge10(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("@@@@@");
    }
    //password restore input method (for challenge 11) (invalid password input - not-allowed symbols only)
    public void inputPasswordRestoreChallenge11(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("Κωδικός");
    }

    //click 'submit' button method
    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
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
    //current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //number addition challenge page title getter
    public String getPasswordRestoreChallengeTitle() {return passwordRestoreChallengeTitle.getText();}
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
    //challenge seven text getter
    public String getChallengeSeven(){return challengeSeven.getText();}
    //challenge eight text getter
    public String getChallengeEight(){return challengeEight.getText();}
    //challenge nine text getter
    public String getChallengeNine(){return challengeNine.getText();}
    //challenge ten text getter
    public String getChallengeTen(){return challengeTen.getText();}
    //challenge eleven text getter
    public String getChallengeEleven(){return challengeEleven.getText();}
    //input form 'entered value' text getter
    public String getEnteredValueText() {return enteredValueText.getText();}
    //calculation result getter
    public String getPasswordRestoreResult() {return challengePasswordRestoreResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number Addition challenge' web element assert methods
    public boolean isNumberAdditionChallengePageTitleDisplayed(){return passwordRestoreChallengeTitle.isDisplayed();}
    public boolean isNumberAdditionChallengeGuideIconDisplayed(){return passwordRestoreGuideButton.isDisplayed();}
    public boolean isInstructionsTitleDisplayed(){return instructionsTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    public boolean isNumberAdditionChallengeOneDisplayed(){return challengeOne.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValueDisplayed() {return enteredValueText.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isPasswordRestoreResultDisplayed() {return challengePasswordRestoreResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isClearButtonDisplayed() {return clearFormButton.isDisplayed();}
    public boolean isSubmitButtonDisplayed() {return submitButton.isDisplayed();}


}
