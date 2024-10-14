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

    //Exploratory testing 'Calculator' test cases for validation web element
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

    //calculator input methods (for challenge 1) (both inputs are blank)
    public void inputTCValidationCalculatorChallenge1Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("");
    }
    public void inputTCValidationCalculatorChallenge1Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys("");
    }
    //calculator input methods (for challenge 2) (number 1 is a string)
    public void inputTCValidationCalculatorChallenge2Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("Kt");
    }
    public void inputTCValidationCalculatorChallenge2Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //calculator input methods (for challenge 3) (both numbers are valid)
    public void inputTCValidationCalculatorChallenge3Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(3));
    }
    public void inputTCValidationCalculatorChallenge3Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(2));
    }
    //calculator input methods (for challenge 4) (number 1 exceeds max input limit)
    public void inputTCValidationCalculatorChallenge4Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys("100000000000");
    }
    public void inputTCValidationCalculatorChallenge4Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(7));
    }
    //calculator input methods (for challenge 5) (both numbers are valid - decimals)
    public void inputTCValidationCalculatorChallenge5Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(7.5));
    }
    public void inputTCValidationCalculatorChallenge5Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(13.5));
    }
    //calculator input methods (for challenge 6) (both numbers are valid - negative numbers)
    public void inputTCValidationCalculatorChallenge6Number1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberOneInputField));
        numberOneInputField.sendKeys(String.valueOf(-20));
    }
    public void inputTCValidationCalculatorChallenge6Number2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberTwoInputField));
        numberTwoInputField.sendKeys(String.valueOf(-3));
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
    //Exploratory testing challenge instructions text getter
    public String getExploratoryTestingInstructionsText() {return exploratoryTestingInstructionsText.getText();}
    //Exploratory testing test cases validation section title getter
    public String getExploratoryTestingTestCaseSectionTitle(){return exploratoryTestingTestCaseSectionTitle.getText();}
    //Exploratory testing test cases input form title getter
    public String getExploratoryTestingInputFormTitle(){return exploratoryTestingInputFormTitle.getText();}
    //Calculator input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //Exploratory testing challenge page title getter
    public String getExploratoryTestingChallengeTitle() {return exploratoryTestingChallengeTitle.getText();}
    //Exploratory testing 'Calculator' counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //test case one text getter
    public String getTestCaseOne(){return testCaseOne.getText();}
    //test case two text getter
    public String getTestCaseTwo(){return testCaseTwo.getText();}
    //test case three text getter
    public String getTestCaseThree(){return testCaseThree.getText();}
    //test case four text getter
    public String getTestCaseFour(){return testCaseFour.getText();}
    //test case five text getter
    public String getTestCaseFive(){return testCaseFive.getText();}
    //test case six text getter
    public String getTestCaseSix(){return testCaseSix.getText();}
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
    //'Exploratory testing' test cases web element assert methods
    public boolean isCalculatorTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isCalculatorTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isCalculatorTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isCalculatorTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isCalculatorTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isCalculatorTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}

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
