package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IndividualChallengePage extends BasePage{

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
    private WebElement number1InputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement number2InputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeCalculationResult;
    //button web elements
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement clearFormButton;
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
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

    public IndividualChallengePage(WebDriver driver) {
        super(driver);
    }

    //number addition input methods (for challenge 1)
    public void inputAdditionChallenge1Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(1));
    }
    public void inputAdditionChallenge1Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(2));
    }
    //number addition input methods (for challenge 2)
    public void inputAdditionChallenge2Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(-2));
    }
    public void inputAdditionChallenge2Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(4));
    }
    //number addition input methods (for challenge 3)
    public void inputAdditionChallenge3Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(1.5));
    }
    public void inputAdditionChallenge3Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(2.5));
    }
    //number addition input methods (for challenge 4)
    public void inputAdditionChallenge4Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys("abc");
    }
    public void inputAdditionChallenge4Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(1));
    }
    //number addition input methods (for challenge 5) (both inputs are blank)
    public void inputAdditionChallenge5Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys("");
    }
    public void inputChallenge5Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys("");
    }
    //number addition input methods (for challenge 6) (one is above limit, second is 1)
    public void inputAdditionChallenge6Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys("10000000000");
    }
    public void inputAdditionChallenge6Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(1));
    }

    //click 'calculate' button method
    public void clickCalculateButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));
        calculateButton.click();
    }

    //number division input methods (for challenge 1)
    public void inputDivisionChallenge1Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(4));
    }
    public void inputDivisionChallenge1Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(2));
    }
    //number division input methods (for challenge 1)
    public void inputDivisionChallenge2Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number1InputField));
        number1InputField.sendKeys(String.valueOf(-10));
    }
    public void inputDivisionChallenge2Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(number2InputField));
        number2InputField.sendKeys(String.valueOf(2));
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
    public String getNumberAdditionChallengeTitle() {return numberAdditionChallengeTitle.getText();}
    //instructions title getter
    public String getNumberAdditionInstructionsTitle() {return instructionsTitle.getText();}
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
    //input form title getter
    public String getInputFormTitle() {return inputFormTitle.getText();}
    //input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //calculation result getter
    public String getCalculationResult() {return challengeCalculationResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number Addition challenge' web element assert methods
    public boolean isNumberAdditionChallengePageTitleDisplayed(){return numberAdditionChallengeTitle.isDisplayed();}
    public boolean isNumberAdditionChallengeGuideIconDisplayed(){return numberAdditionGuideButton.isDisplayed();}
    public boolean isVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isInstructionsTitleDisplayed(){return instructionsTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    public boolean isNumberAdditionChallengeOneDisplayed(){return challengeOne.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed() {return enteredValuesText.isDisplayed();}
    public boolean isNumber1InputFieldDisplayed() {return number1InputField.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isNumber2InputFieldDisplayed() {return number2InputField.isDisplayed();}
    public boolean isCalculationResultDisplayed() {return challengeCalculationResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isClearButtonDisplayed() {return clearFormButton.isDisplayed();}
    public boolean isCalculateButtonDisplayed() {return calculateButton.isDisplayed();}

}
