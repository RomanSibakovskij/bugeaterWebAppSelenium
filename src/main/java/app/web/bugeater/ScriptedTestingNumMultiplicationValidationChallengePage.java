package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScriptedTestingNumMultiplicationValidationChallengePage extends BasePage{

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
    //Scripted testing 'Number multiplication' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberMultiplicationChallengeTitle;
    @FindBy(css = "svg#questionMark")
    private WebElement numberMultiplicationGuideButton;
    @FindBy(xpath = "//a[@id='videoLink']")
    private WebElement videoGuideLink;
    //Scripted testing 'Number multiplication' test case section web elements
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement testCaseSectionTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Number multiplication' test cases for validation web elements
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
    //Scripted testing 'Number Multiplication' input form web elements
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
    private WebElement challengeCalculationResult;
    //button web elements
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement clearFormButton;
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    @FindBy(xpath = "//button[@class='_challengeButtons_1a4cy_115 btn btn-outline-danger']")
    private WebElement startOverButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Number Addition' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingNumMultiplicationValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //number multiplication input methods (for challenge 1) (both inputs are blank)
    public void inputTCValidationMultiplicationChallenge1Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("");
    }
    public void inputTCValidationMultiplicationChallenge1Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys("");
    }
    //number multiplication input methods (for challenge 2) (number 1 as String)
    public void inputTCValidationMultiplicationChallenge2Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("abc");
    }
    public void inputTCValidationMultiplicationChallenge2Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //number multiplication input methods (for challenge 3) (valid input)
    public void inputTCValidationMultiplicationChallenge3Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(5));
    }
    public void inputTCValidationMultiplicationChallenge3Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(7));
    }

    //click 'submit' button method
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

    //verify test case validation completion (tick icon) methods
    public void verifyTestCase1Completion(){
        //assert the test case 1 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseOne, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseOne
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 1 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 1 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase2Completion(){
        //assert the test case 2 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseTwo, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseTwo
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 2 has been verified successfully (tick icon present)." + "\n");
        } else {
            logger.error("Test case 2 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase3Completion(){
        //assert the test case 3 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseThree, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseThree
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 3 has been verified successfully (tick icon present)." + "\n");
        } else {
            logger.error("Test case 3 hasn't been verified. No tick icon detected." + "\n");
        }
    }

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //Scripted testing current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //Scripted testing test cases validation section title getter
    public String getScriptedTestingIndividualPageInstructionsChallengeTitle(){return testCaseSectionTitle.getText();}
    //Scripted testing test cases input form title getter
    public String getInputFormTitle(){return inputFormTitle.getText();}
    //Scripted testing number multiplication challenge page title getter
    public String getNumberMultiplicationChallengeTitle() {return numberMultiplicationChallengeTitle.getText();}
    //Scripted testing challenges counter getter (before challenge one completion)
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
    //Scripted testing input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //Scripted testing calculation result getter
    public String getCalculationResult() {return challengeCalculationResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number multiplication challenge' web element assert methods
    public boolean isNumberMultiplicationPageTitleDisplayed(){return numberMultiplicationChallengeTitle.isDisplayed();}
    public boolean isNumberMultiplicationGuideIconDisplayed(){return numberMultiplicationGuideButton.isDisplayed();}
    public boolean isVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isTestCaseSectionTitleDisplayed(){return testCaseSectionTitle.isDisplayed();}
    public boolean isChallengesCompletedCounterDisplayed() {return challengesCompletedCounter.isDisplayed();}

    //test case web element assert methods
    public boolean isNumberMultiplicationTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isNumberMultiplicationTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isNumberMultiplicationTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isNumberMultiplicationTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isNumberMultiplicationTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isNumberMultiplicationTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}

    public boolean isInputFormTitleDisplayed() {return inputFormTitle.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed() {return enteredValuesText.isDisplayed();}
    public boolean isChallengeHintDisplayed() {return challengeHintText.isDisplayed();}
    public boolean isNumber1InputFieldDisplayed() {return numberOneInputField.isDisplayed();}
    public boolean isNumber2InputFieldDisplayed() {return numberTwoInputField.isDisplayed();}
    public boolean isCalculationResultDisplayed() {return challengeCalculationResult.isDisplayed();}
    public boolean isStartOverButtonDisplayed() {return startOverButton.isDisplayed();}
    public boolean isCalculateButtonDisplayed() {return calculateButton.isDisplayed();}

}
