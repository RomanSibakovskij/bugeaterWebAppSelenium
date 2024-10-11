package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ScriptedTestingNumDivisionValidationChallengePage extends BasePage{

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
    //Scripted testing 'Number Division' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberDivisionChallengeTitle;
    //Scripted testing 'Number Division' test case section web elements
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement testCaseSectionTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Number Division' test cases for validation web elements
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
    //Scripted testing 'Number Division' input form web elements
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
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Number Division' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingNumDivisionValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //number division input methods (for challenge 1) (valid input)
    public void inputTCValidationDivisionChallenge1Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(4));
    }
    public void inputTCValidationDivisionChallenge1Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //number division input methods (for challenge 2) (valid input)
    public void inputTCValidationDivisionChallenge2Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(-10));
    }
    public void inputTCValidationDivisionChallenge2Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //number division input methods (for challenge 3) (valid input)
    public void inputTCValidationDivisionChallenge3Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(5));
    }
    public void inputTCValidationDivisionChallenge3Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //number division input methods (for challenge 4) (valid input - number 1 as '10000000000')
    public void inputTCValidationDivisionChallenge4Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("10000000000");
    }
    public void inputTCValidationDivisionChallenge4Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(8));
    }
    //number division input methods (for challenge 5) (invalid input - number 1 as String)
    public void inputTCValidationDivisionChallenge5Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("abc");
    }
    public void inputTCValidationDivisionChallenge5Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(1));
    }
    //number division input methods (for challenge 6) (invalid input - both inputs are blank)
    public void inputTCValidationDivisionChallenge6Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("");
    }
    public void inputTCValidationDivisionChallenge6Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys("");
    }
    //number division input methods (for challenge 7) (invalid input - number 2 is 0)
    public void inputTCValidationDivisionChallenge7Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(10));
    }
    public void inputTCValidationDivisionChallenge7Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(0));
    }

    //verify test case validation completion (tick icon) methods
    public void verifyTestCase1Validation(){
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
    public void verifyTestCase2Validation(){
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
            logger.info("Test case 2 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 2 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase3Validation(){
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
            logger.info("Test case 3 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 3 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase4Validation(){
        //assert the test case 4 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseFour, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseFour
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 4 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 4 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase5Validation(){
        //assert the test case 5 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseFive, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseFive
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 5 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 5 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase6Validation(){
        //assert the test case 6 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseSix, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseSix
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 6 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 6 hasn't been verified. No tick icon detected." + "\n");
        }
    }
    public void verifyTestCase7Validation(){
        //assert the test case 7 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseSeven, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseSeven
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 7 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 7 hasn't been verified. No tick icon detected." + "\n");
        }
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

    //'Number division challenge' web element assert methods
    //test case web element assert methods
    public boolean isNumberDivisionTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isNumberDivisionTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isNumberDivisionTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isNumberDivisionTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isNumberDivisionTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isNumberDivisionTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isNumberDivisionTestCaseSevenDisplayed(){return testCaseSeven.isDisplayed();}
}
