package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ScriptedTestingCreateProfileTCValidationChallengePage extends BasePage{

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
    //Scripted testing 'Create Profile' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement createProfileChallengeTitle;
    //Scripted testing 'Create Profile' test case section web element
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Scripted testing 'Create Profile' test cases for validation web elements
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
    //Scripted testing 'Create Profile' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValuesText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement nicknameInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement lastNameInputField;
    //'Scripted Testing' birth year dropdown menu web element
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']//div")
    private WebElement birthYearDropdownMenu;
    //'Scripted Testing' birth year dropdown menu option web elements
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[1]")
    private WebElement birthYear1998Option;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[3]")
    private WebElement birthYear2000Option;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[4]")
    private WebElement birthYear2001Option;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[7]")
    private WebElement birthYear2004Option;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[8]")
    private WebElement birthYear2005Option;
    @FindBy(xpath = "//div[@class='_challengeListItem_1a4cy_169']/div//a[10]")
    private WebElement birthYear2007Option;

    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeCreateProfileResult;
    //button web elements
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement submitButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Create Profile' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;

    public ScriptedTestingCreateProfileTCValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //click birth year dropdown menu method
    public void clickBirthYearDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(birthYearDropdownMenu));
        birthYearDropdownMenu.click();
    }
    //select '1998' from birth year dropdown menu
    public void select1998(){birthYear1998Option.click();}
    //select '2000' from birth year dropdown menu
    public void select2000(){birthYear2000Option.click();}
    //select '2001' from birth year dropdown menu
    public void select2001(){birthYear2001Option.click();}
    //select '2004' from birth year dropdown menu
    public void select2004(){birthYear2004Option.click();}
    //select '2005' from birth year dropdown menu
    public void select2005(){birthYear2005Option.click();}
    //select '2007' from birth year dropdown menu
    public void select2007(){birthYear2007Option.click();}

    //create profile input methods (for challenge 1) (valid input)
    public void inputCreateProfileTCValidationChallenge1Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("tech_go1");
    }
    public void inputCreateProfileTCValidationChallenge1LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Anderson");
    }
    //create profile input methods (for challenge 2) (invalid input - nickname too short)
    public void inputCreateProfileTCValidationChallenge2Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("c_99");
    }
    public void inputCreateProfileTCValidationChallenge2LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Harrison");
    }
    //create profile input methods (for challenge 3) (invalid input - nickname too long)
    public void inputCreateProfileTCValidationChallenge3Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("superlongnickname_2024");
    }
    public void inputCreateProfileTCValidationChallenge3LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Nguyen");
    }
    //create profile input methods (for challenge 4) (invalid input - empty input)
    public void inputCreateProfileTCValidationChallenge4Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("");
    }
    public void inputCreateProfileTCValidationChallenge4LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("");
    }
    //create profile input methods (for challenge 5) (invalid input - nickname contains special symbols only)
    public void inputCreateProfileTCValidationChallenge5Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("@@@@@");
    }
    public void inputCreateProfileTCValidationChallenge5LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("O'Reilly");
    }
    //create profile input methods (for challenge 6) (valid input)
    public void inputCreateProfileTCValidationChallenge6Nickname(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(nicknameInputField));
        nicknameInputField.sendKeys("galaxy_42");
    }
    public void inputCreateProfileTCValidationChallenge6LastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys("Newman");
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
    //Scripted testing change profile challenge page title getter
    public String getCreateProfileChallengeTitle() {return createProfileChallengeTitle.getText();}
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
    //Scripted testing input form 'entered values' text getter
    public String getEnteredValuesText() {return enteredValuesText.getText();}
    //Scripted testing create profile result getter
    public String getCreateProfileResult() {return challengeCreateProfileResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Change profile challenge' web element assert methods
    //test case web element assert methods
    public boolean isChangeProfileTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isChangeProfileTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isChangeProfileTestCaseThreeDisplayed(){return testCaseThree.isDisplayed();}
    public boolean isChangeProfileTestCaseFourDisplayed(){return testCaseFour.isDisplayed();}
    public boolean isChangeProfileTestCaseFiveDisplayed(){return testCaseFive.isDisplayed();}
    public boolean isChangeProfileTestCaseSixDisplayed(){return testCaseSix.isDisplayed();}
    public boolean isInputFormEnteredValuesDisplayed(){return enteredValuesText.isDisplayed();}
    public boolean isBirthYearDropdownMenuDisplayed(){return birthYearDropdownMenu.isDisplayed();}
}
