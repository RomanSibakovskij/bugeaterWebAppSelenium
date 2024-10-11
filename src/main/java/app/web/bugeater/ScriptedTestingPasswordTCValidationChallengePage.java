package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScriptedTestingPasswordTCValidationChallengePage extends BasePage {

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
    //Scripted testing 'Password Validation' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement passwordValidationChallengeTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Password Validation' test cases for validation web elements
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
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[8]")
    private WebElement testCaseEight;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[9]")
    private WebElement testCaseNine;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[10]")
    private WebElement testCaseTen;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[11]")
    private WebElement testCaseEleven;
    //Scripted testing 'Password Validation' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/h2")
    private WebElement inputFormTitle;
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValueText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengePasswordValidationResult;
    //button web elements
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement submitButton;
    //Scripted testing 'Password Validation' halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Password Validation' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingPasswordTCValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //number division input methods (for challenge 1) (invalid tc validation -  uppercase only)
    public void inputPasswordTCValidationChallenge1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("PASSWORD");
    }
    //number division input methods (for challenge 2) (invalid tc validation -  numbers only)
    public void inputPasswordTCValidationChallenge2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(String.valueOf(123456));
    }
    //number division input methods (for challenge 3) (invalid tc validation -  special chars only)
    public void inputPasswordTCValidationChallenge3(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("!@#$%");
    }
    //number division input methods (for challenge 4) (invalid tc validation -  existing password)
    public void inputPasswordTCValidationChallenge4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("Password1@23");
    }
    //number division input methods (for challenge 5) (invalid tc validation -  empty input)
    public void inputPasswordTCValidationChallenge5(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("");
    }
    //number division input methods (for challenge 6) (invalid tc validation -  too short password)
    public void inputPasswordTCValidationChallenge6(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("abc");
    }
    //number division input methods (for challenge 7) (invalid tc validation -  too long password)
    public void inputPasswordTCValidationChallenge7(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("qwertyuiopasdfghjklzxcvbnm");
    }
    //number division input methods (for challenge 8) (valid tc validation)
    public void inputPasswordTCValidationChallenge8(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys("P@ssword_1");
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
    public void verifyTestCase8Validation(){
        //assert the test case 8 validation has been completed - JavaScript to retrieve the content of the ::before pseudo-element
        //wait for the element to be captured
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(testCaseEight, "class"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript(
                "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
                testCaseEight
        );
        //validate if the ::before content (tick icon) is present
        if (beforeContent != null && !beforeContent.isEmpty() && !beforeContent.equals("none")) {
            logger.info("Test case 8 has been verified successfully(tick icon)." + "\n");
        } else {
            logger.error("Test case 8 hasn't been verified. No tick icon detected." + "\n");
        }
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
    //Scripted testing current challenge text getter
    public String getCurrentChallengeText() {return currentChallengeText.getText();}
    //Scripted testing password validation challenge page title getter
    public String getPasswordChallengeTitle() {return passwordValidationChallengeTitle.getText();}
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
    //challenge eight text getter
    public String getTestCaseEight(){return testCaseEight.getText();}
    //challenge nine text getter
    public String getTestCaseNine(){return testCaseNine.getText();}
    //challenge ten text getter
    public String getTestCaseTen(){return testCaseTen.getText();}
    //challenge eleven text getter
    public String getTestCaseEleven(){return testCaseEleven.getText();}
    //Scripted testing input form 'entered value' text getter
    public String getEnteredValueText() {return enteredValueText.getText();}
    //challenge hint text getter
    public String getChallengeHintText() {return challengeHintText.getText();}
    //Scripted testing password validation result getter
    public String getPasswordValidationResult() {return challengePasswordValidationResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Password validation challenge' web element assert methods
    //test case web element assert methods
    public boolean isPasswordValidationTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isPasswordValidationTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isPasswordValidationTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isPasswordValidationTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isPasswordValidationTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isPasswordValidationTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isPasswordValidationTestCaseSevenDisplayed(){return testCaseSeven.isDisplayed();}
    public boolean isPasswordValidationTestCaseEightDisplayed(){return testCaseEight.isDisplayed();}
    public boolean isPasswordValidationTestCaseNineDisplayed(){return testCaseNine.isDisplayed();}
    public boolean isPasswordValidationTestCaseTenDisplayed(){return testCaseTen.isDisplayed();}
    public boolean isPasswordValidationTestCaseElevenDisplayed(){return testCaseEleven.isDisplayed();}
    public boolean isPasswordValidationEnteredValueDisplayed(){return enteredValueText.isDisplayed();}
    public boolean isPasswordValidationInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isPasswordSubmitButtonDisplayed(){return submitButton.isDisplayed();}
}
