package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class TCGNumSummationTCValidationChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Number summation challenge page title web element
    @FindBy(xpath = "//div[@class='_challengeHeadingBlock_1a4cy_184']/h1")
    private WebElement numberSummationChallengePageTitle;
    //Number summation instructions text web element
    @FindBy(xpath = "//div[@class='container']/p[@id='challengeDescription']")
    private WebElement numberSummationInstructionsText;
    //guide button web element
    @FindBy(css = "svg#questionMark")
    private WebElement numberSummationGuideButton;
    //video guide link web element
    @FindBy(xpath = "//a[@id='videoLink']")
    private WebElement videoGuideLink;
    //'Number Summation' challenge page web elements
    @FindBy(xpath = "//div[@class='_challengePanelGeneratorList_go1ll_1']/h2")
    private WebElement testCaseBuildChallengeTitle;
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/h2")
    private WebElement testCaseFoundChallengeTitle;
    //'Number Summation' test case section web element
    @FindBy(xpath = "//div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;

    //'Number Summation' test case option one dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/span[1]/div[@class='dropdown']")
    private WebElement testCaseOptionOneDropdownMenu;
    //test case one option one web element
    @FindBy(xpath = "//div[@id='generatorForm']//div[@class='dropdown-menu show']/a[1]")
    private WebElement testCaseNumberOneOptionOne;
    //test case two option one web element
    @FindBy(xpath = "//div[@id='generatorForm']//div[@class='dropdown-menu show']/a[2]")
    private WebElement testCaseMinusTwoOptionOne;

    //'Number Summation' test case option two dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/span[2]/div[@class='dropdown']")
    private WebElement testCaseOptionTwoDropdownMenu;
    //test case one option two web element
    @FindBy(xpath = "//div[@id='generatorForm']//div[@class='dropdown-menu show']/a[1]")
    private WebElement testCaseNumberOneOptionTwo;

    //'Number Summation' test case result dropdown menu web element
    @FindBy(xpath = "//div[@id='generatorForm']/div[1]")
    private WebElement testCaseOptionResultDropdownMenu;
    //test case result dropdown menu options
    @FindBy(xpath = "//div[@id='generatorForm']//div[@class='dropdown-menu show']/a[1]")
    private WebElement testCaseOptionResultNumberOption;


    //'Number Summation' test case validation button web element
    @FindBy(xpath = "//div[@class='_challengeFormActions_1a4cy_109']/button[@type='button']")
    private WebElement testCaseValidateButton;

    //'Number Summation' test cases found web elements
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li")
    private WebElement testCaseOne;
    @FindBy(xpath = "//ol[@class='_challengeList_1a4cy_164']/li[2]")
    private WebElement testCaseTwo;

    //'Number Summation' start over web element
    @FindBy(xpath = "//div[@id='testCases']/button[@type='reset']")
    private WebElement startOverButton;

    //'Number Summation' input form web elements
    @FindBy(xpath = "//input[@id='first']")
    private WebElement numberOneAmountInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement numberTwoAmountInputField;
    //'Number Summation' test case challenge hint web element
    @FindBy(xpath = "//p[@class='_challengeListHint_1a4cy_179']")
    private WebElement challengeHintText;
    //'Number Summation' test case found result web element
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement challengeCalculationResult;
    //calculate button web element
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement calculateButton;
    //Scripted testing halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Scripted testing 'Number Summation' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;


    public TCGNumSummationTCValidationChallengePage(WebDriver driver) {
        super(driver);
    }

    //click 'option 1' dropdown menu method
    public void clickOptionOneDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseOptionOneDropdownMenu));
        testCaseOptionOneDropdownMenu.click();
    }
    //select '1' in option 1 dropdown menu
    public void selectOneInOptionOneDropdown(){testCaseNumberOneOptionOne.click();}
    //select '-2' in option 1 dropdown menu
    public void selectMinusTwoInOptionOneDropdown(){testCaseMinusTwoOptionOne.click();}

    //click 'option 2' dropdown menu method
    public void clickOptionTwoDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseOptionTwoDropdownMenu));
        testCaseOptionTwoDropdownMenu.click();
    }
    //select '1' in option 2 dropdown menu
    public void selectOneInOptionTwoDropdown(){testCaseNumberOneOptionTwo.click();}


    //click 'result' dropdown menu method
    public void clickResultDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseOptionResultDropdownMenu));
        testCaseOptionResultDropdownMenu.click();
    }
    //select 'Number' in result dropdown menu
    public void selectNumberInResultDropdown(){testCaseOptionResultNumberOption.click();}


    //click 'validate test case' button method
    public void clickValidateTestCaseButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(testCaseValidateButton));
        testCaseValidateButton.click();
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
    //Number summation challenge page title getter
    public String getNumberSummationChallengePageTitle() {return numberSummationChallengePageTitle.getText();}
    //Number summation instructions text getter
    public String getNumberSummationInstructionsText() {return numberSummationInstructionsText.getText();}
    //Number summation test cases build title getter
    public String getTestCasesBuildTitle() {return testCaseBuildChallengeTitle.getText();}
    //Number summation test cases found title getter
    public String getTestCasesFoundTitle() {return testCaseFoundChallengeTitle.getText();}
    //Scripted testing challenges counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //challenge one text getter
    public String getTestCaseOne(){return testCaseOne.getText();}
    //challenge two text getter
    public String getTestCaseTwo(){return testCaseTwo.getText();}
    //Number summation calculation result getter
    public String getCalculationResult() {return challengeCalculationResult.getText();}
    //challenge hint text getter
    public String getChallengeHint(){return challengeHintText.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Scripted testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

    //'Number Summation challenge' web element assert methods
    public boolean isNumberSummationChallengePageTitleDisplayed(){return numberSummationChallengePageTitle.isDisplayed();}
    public boolean isNumberSummationChallengeInstructionsTextDisplayed(){return numberSummationInstructionsText.isDisplayed();}
    public boolean isNumberSummationGuideIconDisplayed(){return numberSummationGuideButton.isDisplayed();}
    public boolean isNumberSummationVideoGuideLinkDisplayed(){return videoGuideLink.isDisplayed();}
    public boolean isNumberSummationTestCaseOneDisplayed(){return testCaseOne.isDisplayed();}
    public boolean isNumberSummationTestCaseTwoDisplayed(){return testCaseTwo.isDisplayed();}
    public boolean isNumberSummationOptionOneDropdownMenuDisplayed(){return testCaseOptionOneDropdownMenu.isDisplayed();}
    public boolean isNumberSummationOptionTwoDropdownMenuDisplayed(){return testCaseOptionTwoDropdownMenu.isDisplayed();}
    public boolean isNumberSummationResultDropdownMenuDisplayed(){return testCaseOptionResultDropdownMenu.isDisplayed();}
    public boolean isNumberSummationStartOverButtonDisplayed(){return startOverButton.isDisplayed();}
    public boolean isNumberSummationTestCaseValidationButtonDisplayed(){return testCaseValidateButton.isDisplayed();}
    public boolean isNumberSummationCalculationResultDisplayed(){return challengeCalculationResult.isDisplayed();}
    public boolean isNumberSummationNumberOneInputFieldDisplayed(){return numberOneAmountInputField.isDisplayed();}
    public boolean isNumberSummationNumberTwoInputFieldDisplayed(){return numberTwoAmountInputField.isDisplayed();}
    public boolean isNumberSummationChallengeHintDisplayed(){return challengeHintText.isDisplayed();}
    public boolean isNumberSummationCalculateButtonDisplayed(){return calculateButton.isDisplayed();}

}
