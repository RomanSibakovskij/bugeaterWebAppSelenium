package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ExploratoryTestingRestorePasswordChallengePage extends BasePage{

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

    //Exploratory testing 'Restore password' test cases for validation web element
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

    //Exploratory testing 'Restore Password' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValueText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement exploratoryTestingResult;
    //Exploratory testing 'Restore Password' halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Exploratory testing 'Restore Password' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;
    //'submit' button web element
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement submitButton;

    public ExploratoryTestingRestorePasswordChallengePage(WebDriver driver) {
        super(driver);
    }

    //restore password input methods (for challenge 1) (input is blank)
    public void inputTCValidationPasswordChallenge1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("");
    }
    //restore password input methods (for challenge 2) (password is too short)
    public void inputTCValidationPasswordChallenge2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("AkT");
    }
    //restore password input methods (for challenge 3) (password is too long)
    public void inputTCValidationPasswordChallenge3(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("AsGrdfggre_8987GG_Sdfgd");
    }
    //restore password input methods (for challenge 4) (input existing password in database)
    public void inputTCValidationPasswordChallenge4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("myPass#7");
    }
    //restore password input methods (for challenge 5) (lowercase password only)
    public void inputTCValidationPasswordChallenge5(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("dfhgjjhkk");
    }
    //restore password input methods (for challenge 6) (lowercase password only)
    public void inputTCValidationPasswordChallenge6(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("ASCFGHBG");
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

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //Restore password input form 'entered values' text getter
    public String getEnteredValueText() {return enteredValueText.getText();}
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

    //'Exploratory testing' restore password specific page web element assert methods
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}

    //'Exploratory testing' restore password test case web element assert methods
    public boolean isRestorePasswordTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isRestorePasswordTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isRestorePasswordTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isRestorePasswordTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isRestorePasswordTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isRestorePasswordTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
}
