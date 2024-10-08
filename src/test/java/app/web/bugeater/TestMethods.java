package app.web.bugeater;

import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.*;

public class TestMethods extends BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to number addition challenge test method
    protected void navigateToNumberAdditionPageTest(){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //click 'accept' cookies modal button
        listOfChallengesPage.clickAcceptCookiesButton();
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //'List of Challenges' page web element assert
        isListOfChallengesWebElementDisplayed(listOfChallengesPage);
        //assert the 'list of challenges' page title is as expected
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
        //assert the learn mode section title is as expected
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn more section title doesn't match expectations");
        //click 'number addition' challenge link
        listOfChallengesPage.clickLearnModeChallengeLink1();
    }

    //number addition challenge test method (challenge 1) (valid number inputs)
    protected void solveNumberAdditionChallenge1Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the six step-by-step appearing instructions, entering values into the form. This way, you conduct a basic check of the form's proper functioning. You are practically applying the Scripted Testing.", learnModeNumAddDivisionChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", learnModeNumAddDivisionChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        learnModeNumAddDivisionChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"1\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"3\".", learnModeNumAddDivisionChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values:", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge1Number1();
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge1Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert entered values are displayed
        assertEquals("Entered Values: First Number: 1, Second Number: 2", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
    }

    //number addition challenge test method (challenge 2) (valid number inputs)
    protected void solveNumberAdditionChallenge2Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert the challenge two has correct text
        assertEquals("Input \"-2\" and \"4\" into the input fields where one number is negative, then click on the \"Calculate\" button. Expected Result: \"2\".", learnModeNumAddDivisionChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
       //assert calculation has the expected result (before challenge two completion)
        assertEquals("Result: 3", learnModeNumAddDivisionChallengePage.getCalculationResult(), "The calculation result before calculation doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after first challenge completion
        assertEquals("1 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge2Number1();
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge2Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 3) (valid number inputs)
    protected void solveNumberAdditionChallenge3Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert the challenge three has correct text
        assertEquals("Enter \"1.5\" and \"2.5\" into the input fields; both are decimal fractions, then click on the \"Calculate\" button. Expected Result: \"4.0\".", learnModeNumAddDivisionChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge three completion)
        assertEquals("Entered Values: First Number: -2, Second Number: 4", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge three completion)
        assertEquals("Result: 2", learnModeNumAddDivisionChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after second challenge completion
        assertEquals("2 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge3Number1();
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge3Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", learnModeNumAddDivisionChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //number addition challenge test method (challenge 4)
    protected void solveNumberAdditionChallenge4Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert the challenge three has correct text
        assertEquals("Enter \"abc\" in the First Number input field and \"1\" in the Second Number input field, then click on the \"Calculate\" button. Expected Result: \"User input error\".", learnModeNumAddDivisionChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge four completion)
        assertEquals("Entered Values: First Number: 1.5, Second Number: 2.5", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge four completion)
        assertEquals("Result: 4.0", learnModeNumAddDivisionChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after third challenge completion
        assertEquals("3 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (number 1 is a string)
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge4Number1();
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge4Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 5) (both test inputs are blank)
    protected void solveNumberAdditionChallenge5Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert the challenge three has correct text
        assertEquals("Leave both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", learnModeNumAddDivisionChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge five completion)
        assertEquals("Entered Values: First Number: abc, Second Number: 1", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge five completion)
        assertEquals("Result: User input error", learnModeNumAddDivisionChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after fourth challenge completion
        assertEquals("4 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (both inputs are blank)
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge5Number1();
        learnModeNumAddDivisionChallengePage.inputChallenge5Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 6) (one input is 10000000000 (out of limit bounds))
    protected void solveNumberAdditionChallenge6Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert the challenge three has correct text
        assertEquals("Input \"10000000000\" into the first input field, which is too large, and set the second value to \"1\", then click on the \"Calculate\" button. Expected Result: \"Application Error\".", learnModeNumAddDivisionChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge six completion)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge six completion)
        assertEquals("Result: User input error", learnModeNumAddDivisionChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after fifth challenge completion
        assertEquals("5 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (both inputs are blank)
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge6Number1();
        learnModeNumAddDivisionChallengePage.inputAdditionChallenge6Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", numberAdditionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModeNumAddDivisionChallengePage.clickCloseModalButton();
        //assert all challenges are completed
        assertEquals("6 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered has the expected display (after challenge six completion)
        assertEquals("Entered Values: First Number: 10000000000, Second Number: 1", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (after challenge six completion)
        assertEquals("Result: Application Error", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to number division challenge test method
    protected void navigateToNumberDivisionPageTest(){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //click 'accept' cookies modal button
        listOfChallengesPage.clickAcceptCookiesButton();
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //'List of Challenges' page web element assert
        isListOfChallengesWebElementDisplayed(listOfChallengesPage);
        //assert the 'list of challenges' page title is as expected
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
        //assert the learn mode section title is as expected
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn more section title doesn't match expectations");
        //click 'number addition' challenge link
        listOfChallengesPage.clickLearnModeChallengeLink2();
    }
    //number division challenge test method (challenge 1) (valid number inputs)
    protected void solveNumberDivisionChallenge1Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the six step-by-step appearing instructions, entering values into the form. This way, you conduct a basic check of the form's proper functioning. You are practically applying the Scripted Testing.", learnModeNumAddDivisionChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", learnModeNumAddDivisionChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        learnModeNumAddDivisionChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"4\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"2\".", learnModeNumAddDivisionChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values:", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge1Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge1Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert entered values are displayed
        assertEquals("Entered Values: First Number: 4, Second Number: 2", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
    }
    //number division challenge test method (challenge 2) (one number is negative)
    protected void solveNumberDivisionChallenge2Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenges counter gets updated after first challenge completion
        assertEquals("1 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge two has correct text
        assertEquals("Input \"-10\" and \"2\" into the input fields where one number is negative, then click on the \"Calculate\" button. Expected Result: \"-5\".", learnModeNumAddDivisionChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values: First Number: 4, Second Number: 2", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge two completion)
        assertEquals("Result: 2", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge2Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge2Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 3) (valid number inputs)
    protected void solveNumberDivisionChallenge3Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenges counter gets updated after second challenge completion
        assertEquals("2 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge three has correct text
        assertEquals("Enter \"5\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"2.5\" (decimal fraction).", learnModeNumAddDivisionChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge three completion)
        assertEquals("Entered Values: First Number: -10, Second Number: 2", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge three completion)
        assertEquals("Result: -5", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge3Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge3Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", learnModeNumAddDivisionChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //number division challenge test method (challenge 4) (number 1 is a string)
    protected void solveNumberDivisionChallenge4Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenges counter gets updated after third challenge completion
        assertEquals("3 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge four has correct text
        assertEquals("Enter \"abc\" in the First Number input field and \"1\" in the Second Number input field, then click on the \"Calculate\" button. Expected Result: \"User input error\".", learnModeNumAddDivisionChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge four completion)
        assertEquals("Entered Values: First Number: 5, Second Number: 2", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge four completion)
        assertEquals("Result: 2.5", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (number 1 is a string)
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge4Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge4Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 5) (both inputs are blank)
    protected void solveNumberDivisionChallenge5Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenges counter gets updated after fourth challenge completion
        assertEquals("4 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge five has correct text
        assertEquals("Leave both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", learnModeNumAddDivisionChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge five completion)
        assertEquals("Entered Values: First Number: abc, Second Number: 1", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge five completion)
        assertEquals("Result: User input error", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (both inputs are blank)
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge5Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge5Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 6) (invalid division by zero)
    protected void solveNumberDivisionChallenge6Test(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", learnModeNumAddDivisionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number addition/division page web element assert
        isLearnModeNumAddDivChallengePageWebElementDisplayed(learnModeNumAddDivisionChallengePage);
        //assert challenges counter gets updated after fifth challenge completion
        assertEquals("5 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Input \"10\" into the first input field and \"0\" into the second input field, then click on the \"Calculate\" button. Expected Result: \"Application Error\".", learnModeNumAddDivisionChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge six completion)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge six completion)
        assertEquals("Result: User input error", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", learnModeNumAddDivisionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
        //input numbers into input field (number 2 is 0)
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge6Number1();
        learnModeNumAddDivisionChallengePage.inputDivisionChallenge6Number2();
        //click 'calculate' button
        learnModeNumAddDivisionChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", numberAdditionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModeNumAddDivisionChallengePage.clickCloseModalButton();
        //assert all challenges are completed
        assertEquals("6 instruction(s) out of 6", learnModeNumAddDivisionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered has the expected display (after challenge six completion)
        assertEquals("Entered Values: First Number: 10, Second Number: 0", learnModeNumAddDivisionChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (after challenge six completion)
        assertEquals("Result: Application Error", learnModeNumAddDivisionChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to password restore challenge test method
    protected void navigateToPasswordRestorePageTest(){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //click 'accept' cookies modal button
        listOfChallengesPage.clickAcceptCookiesButton();
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //'List of Challenges' page web element assert
        isListOfChallengesWebElementDisplayed(listOfChallengesPage);
        //assert the 'list of challenges' page title is as expected
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
        //assert the learn mode section title is as expected
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn more section title doesn't match expectations");
        //click 'number addition' challenge link
        listOfChallengesPage.clickLearnModeChallengeLink3();
    }
    //password restore challenge test method (challenge 1)
    protected void solvePasswordRestoreChallenge1Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", learnModePasswordChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        learnModePasswordChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"P@ssw0rD\" as the password, which meets all the requirements, and then click on the \"Submit\" button. Expected result: \"Valid Password\".", learnModePasswordChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display
        assertEquals("Entered Value:", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (before operation)
        assertEquals("Result:", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge1();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
        //assert entered value is displayed (after challenge one completion)
        assertEquals("Entered Value: P@ssw0rD", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
    }
    //password restore challenge test method (challenge 2) (invalid password scenario - doesn't meet requirements)
    protected void solvePasswordRestoreChallenge2Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge one completion
        assertEquals("1 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge two has correct text
        assertEquals("Enter \"hElloW0rld\" as the password, which does not meet all the requirements, and click the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after first challenge)
        assertEquals("Entered Value: P@ssw0rD", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge one)
        assertEquals("Result: Valid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge2();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 3) (invalid password scenario - pre-existing password)
    protected void solvePasswordRestoreChallenge3Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge two completion
        assertEquals("2 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge three has correct text
        assertEquals("Enter the same password as the saved one - \"Passw0rd!7\" and click the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after second challenge)
        assertEquals("Entered Value: hElloW0rld", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge two)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge3();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 4) (no password scenario)
    protected void solvePasswordRestoreChallenge4Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge three completion
        assertEquals("3 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge four has correct text
        assertEquals("Leave the \"New Password\" field empty and click \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after third challenge)
        assertEquals("Entered Value: Passw0rd!7", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge three)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge4();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 5) (invalid password scenario - too short)
    protected void solvePasswordRestoreChallenge5Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge four completion
        assertEquals("4 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge five has correct text
        assertEquals("Enter \"Mo7%\" as the password, which is less than 5 characters long, and click the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after fourth challenge)
        assertEquals("Entered Value: Empty", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge four)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge5();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 6) (invalid password scenario - too long)
    protected void solvePasswordRestoreChallenge6Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge five completion
        assertEquals("5 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Enter \"asdfghjklpoiuytrewq\" as the password, which exceeds 15 characters, and then click the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after fifth challenge)
        assertEquals("Entered Value: Mo7%", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge five)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge6();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", learnModePasswordChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //password restore challenge test method (challenge 7) (invalid password scenario - uppercase letters only)
    protected void solvePasswordRestoreChallenge7Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the eleven step-by-step appearing instructions, entering an appropriate value into the \"New Password\" field. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Password criteria match.", learnModePasswordChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Restore", learnModePasswordChallengePage.getPasswordRestoreChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //password restore page web assert
        isLearnModePasswordRestoreChallengePageWebElementDisplayed(learnModePasswordChallengePage);
        //assert challenge counter has registered challenge six completion
        assertEquals("6 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Enter \"ONLYCAPITAL\" as the password, which contains only uppercase letters, and then click on the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeSeven(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after sixth challenge)
        assertEquals("Entered Value: asdfghjklpoiuytrewq", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge six)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge7();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }

    //general page web element assert (repeating web elements on all app pages)
    protected void isChallengeAppPageWebElementDisplayed(ListOfChallengesPage listOfChallengesPage){
        //assert 'list of challenges' navbar dropdown menu is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesDropdownMenuDisplayed(), "The dropdown menu is not displayed");
        //assert 'list of challenges' navbar account dropdown menu is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesAccountDropdownMenuDisplayed(), "The account dropdown menu is not displayed");
        //assert 'list of challenges' navbar language dropdown menu is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLanguageDropdownMenuDisplayed(), "The language dropdown menu is not displayed");
        //assert 'list of challenges' terms and conditions link is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesTermsConditionsLinkDisplayed(), "The 'Terms and Conditions' link is not displayed");
        //assert 'list of challenges' privacy policy link is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesPrivacyPolicyLinkDisplayed(), "The 'Privacy Policy' link is not displayed");
        //assert 'list of challenges' leave feedback link is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLeaveFeedbackLinkDisplayed(), "The 'Leave Feedback' link is not displayed");
        //assert 'list of challenges' linked-in icon button is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLinkedInIconButtonDisplayed(), "The 'LinkedIn' icon button is not displayed");
        //assert 'list of challenges' facebook icon button is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesFacebookIconButtonDisplayed(), "The 'Facebook' icon button is not displayed");
        //assert 'list of challenges' instagram icon button is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesInstagramIconButtonDisplayed(), "The 'Instagram' icon button is not displayed");
        //assert 'list of challenges' copyright element is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesCopyrightElementDisplayed(), "The copyright element is not displayed");
    }

    //'List of Challenges' specific page web element assert
    protected void isListOfChallengesWebElementDisplayed(ListOfChallengesPage listOfChallengesPage){
        //assert 'list of challenges' page title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesTitleDisplayed(), "The 'List of Challenges' page title is not displayed");
        //assert 'list of challenges' learn more section title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLearnModeTitleDisplayed(), "The 'learn more' section title is not displayed");
        //assert 'list of challenges' learn more challenge menu link list is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLearnModeChallengeLinkDisplayed(), "The 'learn more' section challenge link is not displayed");
        //assert 'list of challenges' scripted testing section title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesScriptedTestingChallengeTitleDisplayed(), "The 'scripted testing' section title is not displayed");
        //assert 'list of challenges' scripted testing challenge menu link list is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesScriptedTestingChallengeLinkDisplayed(), "The 'scripted testing' section challenge link is not displayed");
        //assert 'list of challenges' test case generator testing section title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesTestCaseGenChallengeTitleDisplayed(), "The 'test case generator' section title is not displayed");
        //assert 'list of challenges' test case generator challenge menu link is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesTestCaseGenChallengeLinkDisplayed(), "The 'test case generator' section challenge link is not displayed");
        //assert 'list of challenges' exploratory testing section title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesExploratoryTestingChallengeTitleDisplayed(), "The 'exploratory testing' section title is not displayed");
        //assert 'list of challenges' exploratory testing challenge menu link list is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesExploratoryTestingChallengeLinkDisplayed(), "The 'exploratory testing' section challenge link is not displayed");
    }

    //'Learn more' number addition/division challenge page specific web element assert
    protected void isLearnModeNumAddDivChallengePageWebElementDisplayed(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        //assert 'number addition' challenge page title is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isNumberAdditionChallengePageTitleDisplayed(), "The 'Number Addition' challenge page title is not displayed");
        //assert 'number addition' challenge guide icon is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isNumberAdditionChallengeGuideIconDisplayed(), "The 'Number Addition' challenge guide icon is not displayed");
        //assert 'number addition' challenge video guide link is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isVideoGuideLinkDisplayed(), "The 'Number Addition' challenge video guide link is not displayed");
        //assert 'number addition' challenge instructions title is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isInstructionsTitleDisplayed(), "The 'Number Addition' challenge instructions title is not displayed");
        //assert 'number addition' challenges completed counter is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Number Addition' challenges completed counter is not displayed");
        //assert 'number addition' challenge list is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isNumberAdditionChallengeOneDisplayed(), "The 'Number Addition' challenge list is not displayed");
        //assert 'number addition' challenge input form title is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isInputFormTitleDisplayed(), "The 'Number Addition' challenge input form title is not displayed");
        //assert 'number addition' challenge input form 'entered values' are displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Number Addition' challenge input form entered values are not displayed");
        //assert 'number addition' challenge number 1 input field is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isNumber1InputFieldDisplayed(), "The 'Number Addition' challenge number 1 input field is not displayed");
        //assert 'number addition' challenge hint is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isChallengeHintDisplayed(), "The 'Number Addition' challenge hint is not displayed");
        //assert 'number addition' challenge number 2 input field is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isNumber2InputFieldDisplayed(), "The 'Number Addition' challenge number 2 input field is not displayed");
        //assert 'number addition' challenge calculation result is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isCalculationResultDisplayed(), "The 'Number Addition' challenge calculation result is not displayed");
        //assert 'number addition' challenge start over button is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isStartOverButtonDisplayed(), "The 'Number Addition' challenge start over button is not displayed");
        //assert 'number addition' challenge clear form button is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isClearButtonDisplayed(), "The 'Number Addition' challenge clear button is not displayed");
        //assert 'number addition' challenge calculate button is displayed
        assertTrue(learnModeNumAddDivisionChallengePage.isCalculateButtonDisplayed(), "The 'Number Addition' challenge calculate button is not displayed");
    }

    //individual challenge page assert (for repeatable asserts)
    protected void isIndividualChallengePageTextMatchesExpectations(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        //assert the instructions title is as expected
        assertEquals("Instruction(s) You Follow", learnModeNumAddDivisionChallengePage.getNumberAdditionInstructionsTitle(), "The instructions title doesn't match the expected title");
        //assert input form has the correct title
        assertEquals("Form You Test", learnModeNumAddDivisionChallengePage.getInputFormTitle(), "The input form title doesn't match expected result");
    }

    //'Learn more' password restore challenge page specific web element assert
    protected void isLearnModePasswordRestoreChallengePageWebElementDisplayed(LearnModePasswordChallengePage learnModePasswordChallengePage){
        //assert 'password restore' challenge page title is displayed
        assertTrue(learnModePasswordChallengePage.isNumberAdditionChallengePageTitleDisplayed(), "The 'Password Restore' challenge page title is not displayed");
        //assert 'password restore' challenge guide icon is displayed
        assertTrue(learnModePasswordChallengePage.isNumberAdditionChallengeGuideIconDisplayed(), "The 'Password Restore' challenge guide icon is not displayed");
        //assert 'password restore' challenge instructions title is displayed
        assertTrue(learnModePasswordChallengePage.isInstructionsTitleDisplayed(), "The 'Password Restore' challenge instructions title is not displayed");
        //assert 'password restore' challenges completed counter is displayed
        assertTrue(learnModePasswordChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Password Restore' challenges completed counter is not displayed");
        //assert 'password restore' challenge list is displayed
        assertTrue(learnModePasswordChallengePage.isNumberAdditionChallengeOneDisplayed(), "The 'Password Restore' challenge list is not displayed");
        //assert 'password restore' challenge input form title is displayed
        assertTrue(learnModePasswordChallengePage.isInputFormTitleDisplayed(), "The 'Password Restore' challenge input form title is not displayed");
        //assert 'password restore' challenge input form 'entered values' are displayed
        assertTrue(learnModePasswordChallengePage.isInputFormEnteredValueDisplayed(), "The 'Password Restore' challenge input form entered value are not displayed");
        //assert 'password restore' challenge number 1 input field is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordInputFieldDisplayed(), "The 'Password Restore' challenge password input field is not displayed");
        //assert 'password restore' challenge calculation result is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordRestoreResultDisplayed(), "The 'Password Restore' challenge password restore result is not displayed");
        //assert 'password restore' challenge start over button is displayed
        assertTrue(learnModePasswordChallengePage.isStartOverButtonDisplayed(), "The 'Password Restore' challenge start over button is not displayed");
        //assert 'password restore' challenge clear form button is displayed
        assertTrue(learnModePasswordChallengePage.isClearButtonDisplayed(), "The 'Password Restore' challenge clear button is not displayed");
        //assert 'password restore' challenge calculate button is displayed
        assertTrue(learnModePasswordChallengePage.isSubmitButtonDisplayed(), "The 'Password Restore' challenge submit button is not displayed");
    }

    //pre-challenges loggers (for debug validation)
    protected void logPreChallenge1Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 1): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 1): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 1): " + learnModeNumAddDivisionChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge2Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 2): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 2): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 2): " + learnModeNumAddDivisionChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge3Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 3): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 3): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 3): " + learnModeNumAddDivisionChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge4Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 4): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 4): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 4): " + learnModeNumAddDivisionChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge5Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 5): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 5): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 5): " + learnModeNumAddDivisionChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge6Result(LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage){
        logger.info("Displayed character counter(before challenge 6): " + learnModeNumAddDivisionChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 6): " + learnModeNumAddDivisionChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 6): " + learnModeNumAddDivisionChallengePage.getCalculationResult() +"\n");
    }
    protected void logPreChallenge7Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(before challenge 7): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 7): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(before challenge 7): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }
    protected void logPreChallenge8Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(before challenge 8): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 8): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(before challenge 8): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }
    protected void logPreChallenge9Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(before challenge 9): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 9): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(before challenge 9): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }
    protected void logPreChallenge10Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(before challenge 10): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 10): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(before challenge 10): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }
    protected void logPreChallenge11Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(before challenge 11): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 11): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(before challenge 11): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }

}
