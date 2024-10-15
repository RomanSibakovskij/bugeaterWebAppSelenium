package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.Duration;

public class ExploratoryTestingBookADeskChallengePage extends BasePage{

    //tutorial modal web elements
    @FindBy(xpath = "(//div[.='This description explains the challenge and what you need to do. Read it carefully before starting the challenge.'])[1]")
    private WebElement tutorialDescriptionText;
    @FindBy(xpath = "//button[@data-test-id='button-skip']")
    private WebElement tutorialSkipButton;
    @FindBy(xpath = "//button[@data-test-id='button-primary']")
    private WebElement tutorialNextButton;

    //Exploratory testing 'Book A Desk' challenge text web element
    @FindBy(xpath = "//div[@id='testBugs']/div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement challengesCompletedCounter;
    //Exploratory testing 'Book A Desk' challenge text web element
    @FindBy(xpath = "//div[@id='testBugs']/div[@class='_challengePanelResultsHeading_1a4cy_60']/p[@class='_challengePanelResultsCaption_1a4cy_71']")
    private WebElement bugsFoundCounter;

    //Exploratory testing 'Book A Desk' test cases web elements
    @FindBy(xpath = "//div[@id='testCases']//ol[@class='_challengeList_1a4cy_164']/li")
    private WebElement testCaseOne;

    //Exploratory testing 'Book A Desk' bugs found web elements
    @FindBy(xpath = "//div[@id='testBugs']//ol[@class='_challengeList_1a4cy_164']/li")
    private WebElement bugOne;

    //Exploratory testing 'Book A Desk' input form web elements
    @FindBy(xpath = "//div[@id='testForm']/p[2]")
    private WebElement enteredValueText;
    @FindBy(xpath = "//input[@id='first']")
    private WebElement dateFromInputField;
    @FindBy(xpath = "//input[@id='second']")
    private WebElement dateToInputField;
    @FindBy(xpath = "//div[@id='testForm']/p[1]")
    private WebElement exploratoryTestingResult;
    //Exploratory testing 'Book A Desk' halfway there congratulation web element
    @FindBy(xpath = "//div[@id='root']/div[4]")
    private WebElement halfwayThereMessage;
    //Exploratory testing 'Book A Desk' challenge completion modal web elements
    @FindBy(xpath = "//div[@class='modal-header']/div[.='You did it!']")
    private WebElement challengeCompletionModalTitle;
    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement closeModalButton;
    //'search' button web element
    @FindBy(xpath = "//div[@id='testForm']/form//button[@type='submit']")
    private WebElement searchButton;

    public ExploratoryTestingBookADeskChallengePage(WebDriver driver) {
        super(driver);
    }

    //calculator input methods (for challenge 1) (booking date from is in the past)
    public void inputTCValidationBookADeskChallenge1Date1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(dateFromInputField));
        dateFromInputField.sendKeys("11-10-2023");
    }
    public void inputTCValidationBookADeskChallenge1Date2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(dateToInputField));
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")); //to make the current date updated automatically
        dateToInputField.sendKeys(currentDate);
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

    //tutorial modal 'skip' button click method
    public void clickSkipTutorialButton(){tutorialSkipButton.click();}

    //click 'close' button method
    public void clickCloseModalButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(closeModalButton));
        closeModalButton.click();
    }

    //click 'search' button method
    public void clickSearchButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    //tutorial modal description text getter
    public String getTutorialDescriptionText() {return tutorialDescriptionText.getText();}
    //Book A Desk input form 'entered values' text getter
    public String getEnteredValueText() {return enteredValueText.getText();}
    //Exploratory testing 'Book A Desk' counter getter
    public String getChallengesCounterText() {return challengesCompletedCounter.getText();}
    //Exploratory testing 'Book A Desk' bug counter getter
    public String getBugCounterText() {return bugsFoundCounter.getText();}
    //test case one getter
    public String getTestCaseOne() {return testCaseOne.getText();}
    //Exploratory testing 'Book A Desk' bug description getter
    public String getBugOneText() {return bugOne.getText();}
    //Exploratory testing test result getter
    public String getExploratoryTestingResult() {return exploratoryTestingResult.getText();}
    //'halfway there' message getter
    public String getHalfwayThereMessage(){return halfwayThereMessage.getText();}
    //Exploratory testing challenge completion modal title getter
    public String getChallengeCompletionModalTitle() {return challengeCompletionModalTitle.getText();}

}
