package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ScriptedTestingCurrencyConverterValidationChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Scripted testing current challenge text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement currencyConverterInstructionsText;
    //guide button web element
    @FindBy(css = "svg#questionMark")
    private WebElement currencyConverterGuideButton;
    //Scripted testing 'Currency Converter' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement currencyConverterChallengeTitle;
    //Scripted testing 'Currency Converter' test case section web element
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Currency Converter' test cases for validation web elements
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
    //Scripted testing 'Currency Converter' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement conversionAmountInputField;
    //'Scripted Testing' currency from dropdown menu web element
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][1]/div")
    private WebElement currencyFromDropdownMenu;
    //'Scripted Testing' currency from option web elements
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][1]/div//a[1]")
    private WebElement currencyFromUSDOption;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][1]/div//a[2]")
    private WebElement currencyFromGBPOption;

    //'Scripted Testing' currency to dropdown menu web element
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][2]/div")
    private WebElement currencyToDropdownMenu;
    //'Scripted Testing' currency to option web elements
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][2]/div//a[2]")
    private WebElement currencyToGBPOption;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169'][2]/div//a[3]")
    private WebElement currencyToEUROption;


    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeConversionResult;
    //button web element
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement convertButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Currency Converter' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingCurrencyConverterValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //click currency from dropdown menu method
    public void clickCurrencyFromDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(currencyFromDropdownMenu));
        currencyFromDropdownMenu.click();
    }
    //select 'USD' from conversion from dropdown menu method
    public void selectUSDConversionFromOption(){currencyFromUSDOption.click();}
    //select 'GBP' from conversion from dropdown menu method
    public void selectGBPConversionFromOption(){currencyFromGBPOption.click();}

    //click currency to dropdown menu method
    public void clickCurrencyToDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(currencyToDropdownMenu));
        currencyToDropdownMenu.click();
    }
    //select 'EUR' from conversion from dropdown menu method
    public void selectEURConversionToOption(){currencyToEUROption.click();}
    //select 'GBP' from conversion from dropdown menu method
    public void selectGBPConversionToOption(){currencyToGBPOption.click();}

    //currency converter input method (for challenge 1) (valid input)
    public void inputCurrencyConverterTCValidationChallenge1Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys(String.valueOf(1000));
    }
    //currency converter input method (for challenge 2) (valid input)
    public void inputCurrencyConverterTCValidationChallenge2Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys(String.valueOf(1500.567));
    }
    //currency converter input method (for challenge 3) (valid input - from GBP to GBP)
    public void inputCurrencyConverterTCValidationChallenge3Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys(String.valueOf(350));
    }
    //currency converter input method (for challenge 4) (valid input - from USD to EUR (too large input))
    public void inputCurrencyConverterTCValidationChallenge4Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys("1000000000000");
    }
    //currency converter input method (for challenge 5) (valid input - from USD to EUR (0))
    public void inputCurrencyConverterTCValidationChallenge5Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys(String.valueOf(0));
    }
    //currency converter input method (for challenge 6) (invalid input - from USD to EUR (empty input))
    public void inputCurrencyConverterTCValidationChallenge6Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys("");
    }
    //currency converter input method (for challenge 7) (invalid input - from USD to EUR (-500 as value))
    public void inputCurrencyConverterTCValidationChallenge7Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys(String.valueOf(-500));
    }
    //currency converter input method (for challenge 8) (invalid input - from USD to EUR ("abc" as value))
    public void inputCurrencyConverterTCValidationChallenge8Value(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(conversionAmountInputField));
        conversionAmountInputField.sendKeys("abc");
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

    //click 'convert' button method
    public void clickConvertButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(convertButton));
        convertButton.click();
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
    //Scripted testing current challenge instructions text getter
    public String getCurrencyConverterInstructionsText() {return currencyConverterInstructionsText.getText();}
    //Scripted testing currency converter challenge page title getter
    public String getCurrencyConverterChallengeTitle() {return currencyConverterChallengeTitle.getText();}
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
    //Scripted testing input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //Scripted testing currency conversion result getter
    public String getConversionResult() {return challengeConversionResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Change profile challenge' web element assert methods
    public boolean isCurrencyConverterGuideIconDisplayed(){return currencyConverterGuideButton.isDisplayed();}
    //test case web element assert methods
    public boolean isChangeProfileTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isChangeProfileTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isChangeProfileTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isChangeProfileTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isChangeProfileTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isChangeProfileTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isChangeProfileTestCaseSevenDisplayed(){return testCaseSeven.isDisplayed();}
    public boolean isChangeProfileTestCaseEightDisplayed(){return testCaseEight.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed(){return enteredValuesText.isDisplayed();}
    public boolean isCurrencyFromDropdownMenuDisplayed(){return currencyFromDropdownMenu.isDisplayed();}
    public boolean isCurrencyToDropdownMenuDisplayed(){return currencyToDropdownMenu.isDisplayed();}
}
