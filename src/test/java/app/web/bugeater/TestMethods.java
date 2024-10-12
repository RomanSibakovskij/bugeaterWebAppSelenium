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
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn mode section title doesn't match expectations");
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
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge six completion
        logPreChallenge7Result(learnModePasswordChallengePage);
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
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn mode section title doesn't match expectations");
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
        //assertEquals("You did it!", learnModeNumAddDivisionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModeNumAddDivisionChallengePage.clickCloseModalButton();
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge six completion
        logPreChallenge7Result(learnModePasswordChallengePage);
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
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn mode section title doesn't match expectations");
        //click 'password restore' challenge link
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
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
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
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
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
        //assert the challenge seven has correct text
        assertEquals("Enter \"ONLYCAPITAL\" as the password, which contains only uppercase letters, and then click on the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeSeven(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after sixth challenge)
        assertEquals("Entered Value: asdfghjklpoiuytrewq", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge six)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge7();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 8) (invalid password scenario - lowercase letters only)
    protected void solvePasswordRestoreChallenge8Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
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
        //assert challenge counter has registered challenge seven completion
        assertEquals("7 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge eight has correct text
        assertEquals("Enter \"onlylower\" as the password, which contains only lowercase letters, and then click on the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeEight(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after seventh challenge)
        assertEquals("Entered Value: ONLYCAPITAL", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge seven)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge8Result(learnModePasswordChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge8();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 9) (invalid password scenario - digits only)
    protected void solvePasswordRestoreChallenge9Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
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
        //assert challenge counter has registered challenge eight completion
        assertEquals("8 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge nine has correct text
        assertEquals("Enter \"001122\" as the password containing only digits and click the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeNine(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after eighth challenge)
        assertEquals("Entered Value: onlylower", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge eight)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge9Result(learnModePasswordChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge9();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 10) (invalid password scenario - special symbols only)
    protected void solvePasswordRestoreChallenge10Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
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
        //assert challenge counter has registered challenge nine completion
        assertEquals("9 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge ten has correct text
        assertEquals("Enter \"@@@@@\" as the password, which contains only special characters, and then click on the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeTen(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after ninth challenge)
        assertEquals("Entered Value: 001122", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge nine)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge10Result(learnModePasswordChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge10();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
    }
    //password restore challenge test method (challenge 11) (invalid password scenario - not-allowed symbols only)
    protected void solvePasswordRestoreChallenge11Test(LearnModePasswordChallengePage learnModePasswordChallengePage){
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
        //assert challenge counter has registered challenge ten completion
        assertEquals("10 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge eleven has correct text
        assertEquals("Enter \"Κωδικός\" as the password, which contains the not-allowed symbol, and then click on the \"Submit\" button. Expected result: \"Invalid Password\".", learnModePasswordChallengePage.getChallengeEleven(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after tenth challenge)
        assertEquals("Entered Value: @@@@@", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge ten)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge10Result(learnModePasswordChallengePage);
        //input password into input field
        learnModePasswordChallengePage.inputPasswordRestoreChallenge11();
        //click 'calculate' button
        learnModePasswordChallengePage.clickSubmitButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", learnModeNumAddDivisionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModePasswordChallengePage.clickCloseModalButton();
        //assert the completion of challenge eleven has been displayed
        assertEquals("11 instruction(s) out of 11", learnModePasswordChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered value has the expected display (after eleventh challenge)
        assertEquals("Entered Value: Κωδικός", learnModePasswordChallengePage.getEnteredValueText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge eleven)
        assertEquals("Result: Invalid Password", learnModePasswordChallengePage.getPasswordRestoreResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge11Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to update profile challenge test method
    protected void navigateToUpdateProfilePageTest(){
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
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn mode section title doesn't match expectations");
        //click 'update profile' challenge link
        listOfChallengesPage.clickLearnModeChallengeLink4();
    }
    //update profile challenge test method (challenge 1)
    protected void solveUpdateProfileChallenge1Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the five step-by-step appearing instructions, entering an appropriate value into the \"Nickname\", \"First Name\", and \"Last Name\" fields. This way you conduct a basic check of the form proper functioning. You are practically applying the Scripted Testing approach and checking the Basic Profile criteria match.", learnModeUpdateProfilePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", learnModeUpdateProfilePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        learnModeUpdateProfilePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter Nickname: \"skyline7\", First Name: \"Michael\", Last Name: \"Henderson\", and press \"Submit\". Expected Result: \"Your profile updated\".", learnModeUpdateProfilePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display
        assertEquals("Entered Values:", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (before operation)
        assertEquals("Result:", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields
        learnModeUpdateProfilePage.inputUpdateProfileChallenge1Nickname1();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge1FirstName1();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge1LastName1();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
        //assert entered value is displayed (after challenge one completion)
        assertEquals("Entered Values: Nickname: skyline7, First Name: Michael, Last Name: Henderson", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
    }
    //update profile challenge test method (challenge 2) (invalid inputs - inputs shorter than min length)
    protected void solveUpdateProfileChallenge2Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has registered challenge one completion
        assertEquals("1 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge two has correct text
        assertEquals("Enter Nickname: \"k_3\", First Name: \"J\", Last Name: \"Z\", and press \"Submit\". Expected Result: \"User input error\". The entered values are shorter than the min length.", learnModeUpdateProfilePage.getChallengeTwo(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after first challenge completion)
        assertEquals("Entered Values: Nickname: skyline7, First Name: Michael, Last Name: Henderson", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (after challenge one)
        assertEquals("Result: Your profile updated", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields (inputs shorter than min length)
        learnModeUpdateProfilePage.inputUpdateProfileChallenge2Nickname2();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge2FirstName2();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge2LastName2();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
    }
    //update profile challenge test method (challenge 3) (invalid inputs - inputs longer than max length)
    protected void solveUpdateProfileChallenge3Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has registered challenge two completion
        assertEquals("2 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge three has correct text
        assertEquals("Enter Nickname: \"longnick9_\", First Name: \"MaximilianaElizabethMontgomery\", Last Name: \"AlexanderHamiltonJeffersonSmith\", and press \"Submit\". Expected Result: \"User input error\". The entered values exceed the max length.", learnModeUpdateProfilePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after second challenge completion)
        assertEquals("Entered Values: Nickname: k_3, First Name: J, Last Name: Z", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (after challenge two)
        assertEquals("Result: User input error", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields (inputs longer than max length)
        learnModeUpdateProfilePage.inputUpdateProfileChallenge3Nickname3();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge3FirstName3();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge3LastName3();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", learnModeUpdateProfilePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //update profile challenge test method (challenge 4) (invalid inputs - empty inputs)
    protected void solveUpdateProfileChallenge4Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has registered challenge three completion
        assertEquals("3 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge four has correct text
        assertEquals("Leave Nickname, First Name, and Last Name fields empty, and press \"Submit\". Expected Result: \"User input error\".", learnModeUpdateProfilePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after third challenge completion)
        assertEquals("Entered Values: Nickname: longnick9_, First Name: MaximilianaElizabethMontgomery, Last Name: AlexanderHamiltonJeffersonSmith", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (after challenge three)
        assertEquals("Result: User input error", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields (empty inputs)
        learnModeUpdateProfilePage.inputUpdateProfileChallenge4Nickname4();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge4FirstName4();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge4LastName4();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
    }
    //update profile challenge test method (challenge 5) (invalid inputs - non-allowed character inputs)
    protected void solveUpdateProfileChallenge5Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has registered challenge four completion
        assertEquals("4 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge five has correct text
        assertEquals("Enter Nickname: \"123-AA\", First Name \"X Æ A-12\", Last Name \"X Æ A-12\", and press \"Submit\". Expected Result: \"User input error\". Nickname, First Name and Last Name contain not allowed characters.", learnModeUpdateProfilePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after fourth challenge completion)
        assertEquals("Entered Values: Nickname: Empty, First Name: Empty, Last Name: Empty", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (after challenge four)
        assertEquals("Result: User input error", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields (non-allowed character inputs)
        learnModeUpdateProfilePage.inputUpdateProfileChallenge5Nickname5();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge5FirstName5();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge5LastName5();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
    }
    //update profile challenge test method (challenge 6) (invalid inputs - non-allowed nickname character input)
    protected void solveUpdateProfileChallenge6Test(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Update Profile", learnModeUpdateProfilePage.getUpdateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //update profile page web assert
        isLearnModeUpdateProfileChallengePageWebElementDisplayed(learnModeUpdateProfilePage);
        //assert challenge counter has registered challenge five completion
        assertEquals("5 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Enter Nickname: \"@@@@@\", First Name \"Christopher\", Last Name \"Williams\", and press \"Submit\". Expected Result: \"User input error\". Nickname contains not allowed characters.", learnModeUpdateProfilePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered value has the expected display (after fifth challenge completion)
        assertEquals("Entered Values: Nickname: 123-AA, First Name: X Æ A-12, Last Name: X Æ A-12", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert update profile has the expected result (after challenge five)
        assertEquals("Result: User input error", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input update profile data into input fields (non-allowed nickname character input)
        learnModeUpdateProfilePage.inputUpdateProfileChallenge6Nickname6();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge6FirstName6();
        learnModeUpdateProfilePage.inputUpdateProfileChallenge6LastName6();
        //click 'calculate' button
        learnModeUpdateProfilePage.clickSubmitButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", learnModeUpdateProfilePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModeUpdateProfilePage.clickCloseModalButton();
        //assert the completion of challenge six has been displayed
        assertEquals("6 instruction(s) out of 6", learnModeUpdateProfilePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered value has the expected display (after sixth challenge)
        assertEquals("Entered Values: Nickname: @@@@@, First Name: Christopher, Last Name: Williams", learnModeUpdateProfilePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert password restore has the expected result (after challenge six)
        assertEquals("Result: User input error", learnModeUpdateProfilePage.getUpdateProfileResult() , "The calculation result doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to number multiplication challenge test method
    protected void navigateToNumberMultiplicationPageTest(){
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
        assertEquals("Learn Mode", listOfChallengesPage.getLearnModeSectionTitle(), "The learn mode section title doesn't match expectations");
        //click 'number multiplication' challenge link
        listOfChallengesPage.clickLearnModeChallengeLink5();
    }
    //number multiplication challenge test method (challenge 1) (valid number inputs) (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge1Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Read the first task in the Instruction list. Following the instructions, select the appropriate options in the three dropdowns. After validating a Test Case, the next instruction appears if you have chosen everything correctly. A Test Case, created by selecting the appropriate options, will be captured and used in further testing.", learnModeNumMultiplicationPage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", learnModeNumMultiplicationPage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        learnModeNumMultiplicationPage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Choose from the dropdowns Option 1: \"2\", Option 2: \"2\", Result: \"Number\". Click on the \"Validate Test Case\" button. Expected Result: \"4\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select '2' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionTwo();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select '2' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionTwo();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'result' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionNumberResult();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
    }
    //number multiplication challenge test method (challenge 2) (invalid input - menu one option as a string) (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge2Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has registered challenge one completion
        assertEquals("1 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge two has correct text
        assertEquals("Choose from the dropdowns Option 1: \"ManualQA\", Option 2: \"2\", Result: \"User input error\". Click on the \"Validate Test Case\" button. Expected Result: \"User input error\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (after first challenge completion)
        assertEquals("Result: 4", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select 'Manual QA' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionManualQA();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select '2' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionTwo();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'user error input' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionErrorInput();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
    }
    //number multiplication challenge test method (challenge 3) (invalid input - both menu options as 'Empty value') (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge3Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has registered challenge two completion
        assertEquals("2 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge three has correct text
        assertEquals("Select \"Empty value\" for Option 1 and Option 2, set Result to \"User input error\", and click \"Validate Test Case\". Expected Result: \"User input error\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (after second challenge completion)
        assertEquals("Result: User input error", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select 'Empty value' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionEmptyValue();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select 'Empty value' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionEmptyValue();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'user error input' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionErrorInput();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", learnModeNumMultiplicationPage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //number multiplication challenge test method (challenge 4) (both options as '2.5') (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge4Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has registered challenge three completion
        assertEquals("3 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge four has correct text
        assertEquals("Select \"2.5\" for Option 1 and Option 2, set Result to \"Number\", and click \"Validate Test Case\". Expected Result: \"6.25\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (after third challenge completion)
        assertEquals("Result: User input error", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select '2.5' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionTwoPointFive();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select '2.5' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionTwoPointFive();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'Number' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionNumberResult();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
    }
    //number multiplication challenge test method (challenge 5) (dropdown menu 2 as '-1') (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge5Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has registered challenge four completion
        assertEquals("4 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge five has correct text
        assertEquals("Choose from the dropdowns Option 1: \"2\", Option 2: \"-1\" (negative number), Result: \"Number\". Click on the \"Validate Test Case\" button. Expected Result: \"-2\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (after fourth challenge completion)
        assertEquals("Result: 6.25", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select '2' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionTwo();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select '-1' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionMinusOne();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'Number' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionNumberResult();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
    }
    //number multiplication challenge test method (challenge 6) (invalid test input - dropdown menu 1 as '10000000000') (ignore null entered values input since this method uses logger methods other tests use)
    protected void solveNumberMultiplicationChallenge6Test(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", learnModeNumMultiplicationPage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(learnModeNumAddDivisionChallengePage);
        //number multiplication page web element assert
        isLearnModeNumMultiplicationChallengePageWebElementDisplayed(learnModeNumMultiplicationPage);
        //assert challenge counter has registered challenge five completion
        assertEquals("5 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Choose from the dropdowns Option 1: \"10000000000\" (very big number), Option 2: \"2\", Result: \"Application error\". Click on the \"Validate Test Case\" button. Expected Result: \"Application error\" in the Form You Test.", learnModeNumAddDivisionChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert calculation has the expected result (after fifth challenge completion)
        assertEquals("Result: -2", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", learnModeNumMultiplicationPage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
        //click dropdown menu 1
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu1();
        //select '10000000000' from dropdown menu 1
        learnModeNumMultiplicationPage.selectDropdownValueMenu1OptionTenBillion();
        //click dropdown menu 2
        learnModeNumMultiplicationPage.clickTestCaseDropdownMenu2();
        //select '2' from dropdown menu 2
        learnModeNumMultiplicationPage.selectDropdownValueMenu2OptionTwo();
        //click dropdown result menu
        learnModeNumMultiplicationPage.clickTestCaseDropdownResultMenu();
        //select 'Application Error' from result dropdown menu
        learnModeNumMultiplicationPage.selectDropdownValueResultMenuOptionAppError();
        //click 'validate test case' button
        learnModeNumMultiplicationPage.clickTestCaseValidationButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", learnModeNumMultiplicationPage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        learnModeNumMultiplicationPage.clickCloseModalButton();
        //assert challenge counter has registered challenge six completion
        assertEquals("6 out of 6", learnModeNumMultiplicationPage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert calculation has the expected result (after sixth challenge completion)
        assertEquals("Result: Application error", learnModeNumMultiplicationPage.getCalculationResult() , "The calculation result doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to number multiplication test case validation challenge test method
    protected void navigateToNumberMultiplicationTCValidationPageTest(){
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
        assertEquals("Scripted Testing", listOfChallengesPage.getScriptedTestingSectionTitle(), "The scripted testing section title doesn't match expectations");
        //click 'number multiplication' challenge link
        listOfChallengesPage.clickScriptedTestingChallengeLink1();
    }
    //number multiplication test case validation challenge test method (challenge 1) (invalid tc validation - both number inputs are empty)
    protected void solveNumberMultiplicationTCValidationChallenge1Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check six Test Cases in any order, entering corresponding values into the form for multiplying two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", scriptedTestingNumMultiplicationValidationChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (before first test case validation)
        assertEquals("Entered Values: ", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert challenge counter has no challenges completed yet
        assertEquals("0 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge1Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge1Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase1Validation();
    }
    //number multiplication test case validation challenge test method (challenge 2) (invalid tc validation - number 1 as String)
    protected void solveNumberMultiplicationTCValidationChallenge2Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert challenge counter has registered first test case validation
        assertEquals("1 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: User input error", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge2Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge2Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase2Validation();
    }
    //number multiplication test case validation challenge test method (challenge 3) (valid tc validation)
    protected void solveNumberMultiplicationTCValidationChallenge3Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert challenge counter has registered second test case validation
        assertEquals("2 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (tc 2)
        assertEquals("Entered Values: First Number: abc, Second Number: 2", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: User input error", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge3Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge3Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", scriptedTestingNumMultiplicationValidationChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase3Validation();
    }
    //number multiplication test case validation challenge test method (challenge 4) (invalid tc validation - number 1 as '10000000000')
    protected void solveNumberMultiplicationTCValidationChallenge4Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert challenge counter has registered third test case validation
        assertEquals("3 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (tc 3)
        assertEquals("Entered Values: First Number: 5, Second Number: 7", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: 35", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge4Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge4Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase4Validation();
    }
    //number multiplication test case validation challenge test method (challenge 5) (valid tc validation)
    protected void solveNumberMultiplicationTCValidationChallenge5Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert challenge counter has registered fourth test case validation
        assertEquals("4 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (tc 4)
        assertEquals("Entered Values: First Number: 10000000000, Second Number: 8", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: Application error", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge5Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge5Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase5Validation();
    }
    //number multiplication test case validation challenge test method (challenge 6) (valid tc validation)
    protected void solveNumberMultiplicationTCValidationChallenge6Test(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Multiplication", scriptedTestingNumMultiplicationValidationChallengePage.getNumberMultiplicationChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number multiplication challenge page web element assert
        isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert challenge counter has registered fifth test case validation
        assertEquals("5 case(s) out of 6", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number multiplication test cases displayed in test case section list has correct text
        isScriptedTestingNumMultiplicationTestCaseAsExpected(scriptedTestingNumMultiplicationValidationChallengePage);
        //assert the test case validation has been completed (tc 5)
        assertEquals("Entered Values: First Number: 3.5, Second Number: 2.7", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: 9.45", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Multiply two numbers", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge6Number1();
        scriptedTestingNumMultiplicationValidationChallengePage.inputTCValidationMultiplicationChallenge6Number2();
        //click 'calculate' button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", scriptedTestingNumMultiplicationValidationChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        scriptedTestingNumMultiplicationValidationChallengePage.clickCloseModalButton();
        //assert the test case validation has been completed
        scriptedTestingNumMultiplicationValidationChallengePage.verifyTestCase5Validation();
        //assert the test case validation has been completed (tc 6)
        assertEquals("Entered Values: First Number: -8, Second Number: 4", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result: -32", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to number division test case validation challenge test method
    protected void navigateToNumberDivisionTCValidationPageTest(){
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
        assertEquals("Scripted Testing", listOfChallengesPage.getScriptedTestingSectionTitle(), "The scripted testing section title doesn't match expectations");
        //click 'number division' challenge link
        listOfChallengesPage.clickScriptedTestingChallengeLink2();
    }
    //number division test case validation challenge test method (challenge 1) (valid tc validation)
    protected void solveNumberDivisionTCValidationChallenge1Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", scriptedTestingNumMultiplicationValidationChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        scriptedTestingNumDivisionValidationChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert the test case validation has been completed (before first test case validation)
        assertEquals("Entered Values: ", scriptedTestingNumDivisionValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert challenge counter has no challenges completed yet
        assertEquals("0 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge1Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge1Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Values: First Number: 4, Second Number: 2", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase1Validation();
    }
    //number division test case validation challenge test method (challenge 2) (valid tc validation)
    protected void solveNumberDivisionTCValidationChallenge2Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered first test case validation completion
        assertEquals("1 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Values: First Number: 4, Second Number: 2", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after first test case validation)
        assertEquals("Result: 2", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge2Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge2Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase2Validation();
    }
    //number division test case validation challenge test method (challenge 3) (valid tc validation)
    protected void solveNumberDivisionTCValidationChallenge3Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered second test case validation completion
        assertEquals("2 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 2)
        assertEquals("Entered Values: First Number: -10, Second Number: 2", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after second test case validation)
        assertEquals("Result: -5", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge3Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge3Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase3Validation();
    }
    //number division test case validation challenge test method (challenge 4) (valid tc validation - number 1 as '10000000000')
    protected void solveNumberDivisionTCValidationChallenge4Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered third test case validation completion
        assertEquals("3 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 3)
        assertEquals("Entered Values: First Number: 5, Second Number: 2", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after third test case validation)
        assertEquals("Result: 2.5", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge4Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge4Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", scriptedTestingNumDivisionValidationChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase4Validation();
    }
    //number division test case validation challenge test method (challenge 5) (invalid tc validation - number 1 as String)
    protected void solveNumberDivisionTCValidationChallenge5Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered fourth test case validation completion
        assertEquals("4 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 4)
        assertEquals("Entered Values: First Number: 10000000000, Second Number: 8", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after fourth test case validation)
        assertEquals("Result: 1250000000", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge5Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge5Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase5Validation();
    }
    //number division test case validation challenge test method (challenge 6) (invalid tc validation - both inputs are blank)
    protected void solveNumberDivisionTCValidationChallenge6Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered fifth test case validation completion
        assertEquals("5 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 5)
        assertEquals("Entered Values: First Number: abc, Second Number: 1", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after fifth test case validation)
        assertEquals("Result: User input error", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        //logger before challenge completion
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge6Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge6Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //verify the test case has been validated
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase6Validation();
    }
    //number division test case validation challenge test method (challenge 7) (invalid tc validation - division by zero)
    protected void solveNumberDivisionTCValidationChallenge7Test(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage) {
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check seven Test Cases in any order, entering corresponding values into the form for dividing two numbers. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Number Division", scriptedTestingNumDivisionValidationChallengePage.getNumberDivisionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert(
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing number division challenge page web element assert
        isScriptedTestingNumDivisionChallengePageWebElementDisplayed(scriptedTestingNumDivisionValidationChallengePage);
        //assert challenge counter has registered sixth test case validation completion
        assertEquals("6 case(s) out of 7", scriptedTestingNumMultiplicationValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 6)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after sixth test case validation)
        assertEquals("Result: User input error", scriptedTestingNumDivisionValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert the number division test cases displayed in test case section list has correct text
        isScriptedTestingNumDivisionTestCaseAsExpected(scriptedTestingNumDivisionValidationChallengePage);
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //input numbers provided by test case into input fields
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge7Number1();
        scriptedTestingNumDivisionValidationChallengePage.inputTCValidationDivisionChallenge7Number2();
        //click 'calculate' button
        scriptedTestingNumDivisionValidationChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", scriptedTestingNumDivisionValidationChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        scriptedTestingNumDivisionValidationChallengePage.clickCloseModalButton();
        //assert the test case validation has been completed
        scriptedTestingNumDivisionValidationChallengePage.verifyTestCase7Validation();
        //assert the test case validation has been completed (tc 7)
        assertEquals("Entered Values: First Number: 10, Second Number: 0", scriptedTestingNumMultiplicationValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after seventh test case validation)
        assertEquals("Result: Division by zero is not allowed", scriptedTestingNumMultiplicationValidationChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge8Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to password test case validation challenge test method
    protected void navigateToPasswordTCValidationPageTest(){
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
        assertEquals("Scripted Testing", listOfChallengesPage.getScriptedTestingSectionTitle(), "The scripted testing section title doesn't match expectations");
        //click 'number division' challenge link
        listOfChallengesPage.clickScriptedTestingChallengeLink3();
    }
    //password test case validation challenge test method (challenge 1) (invalid tc validation - uppercase only)
    protected void solvePasswordTCValidationChallenge1Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", scriptedTestingPasswordTCValidationChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        scriptedTestingPasswordTCValidationChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert the test case validation has been completed (before first test case validation)
        assertEquals("Entered Value: ", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered value after completion don't match expected result");
        //assert password validation has the expected result (before operation)
        assertEquals("Result:", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge1();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Value: PASSWORD", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase1Validation();
    }
    //password test case validation challenge test method (challenge 2) (invalid tc validation - numbers only)
    protected void solvePasswordTCValidationChallenge2Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered first test case validation
        assertEquals("1 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 1)
        assertEquals("Entered Value: PASSWORD", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after first test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge2();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase2Validation();
    }
    //password test case validation challenge test method (challenge 3) (invalid tc validation - special symbols only)
    protected void solvePasswordTCValidationChallenge3Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered second test case validation
        assertEquals("2 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 2)
        assertEquals("Entered Value: 123456", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after second test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge3();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase3Validation();
    }
    //password test case validation challenge test method (challenge 4) (invalid tc validation - existing password)
    protected void solvePasswordTCValidationChallenge4Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingNumMultiplicationValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered third test case validation
        assertEquals("3 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 3)
        assertEquals("Entered Value: !@#$%", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after third test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge4();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase4Validation();
    }
    //password test case validation challenge test method (challenge 5) (invalid tc validation - empty input)
    protected void solvePasswordTCValidationChallenge5Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered fourth test case validation
        assertEquals("4 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 4)
        assertEquals("Entered Value: Password1@23", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after fourth test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge5();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase5Validation();
    }
    //password test case validation challenge test method (challenge 6) (invalid tc validation - too short)
    protected void solvePasswordTCValidationChallenge6Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered fifth test case validation
        assertEquals("5 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 5)
        assertEquals("Entered Value: Empty", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after fifth test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(learnModeNumAddDivisionChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge6();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", scriptedTestingPasswordTCValidationChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase6Validation();
    }
    //password test case validation challenge test method (challenge 7) (invalid tc validation - too long)
    protected void solvePasswordTCValidationChallenge7Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered sixth test case validation
        assertEquals("6 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 6)
        assertEquals("Entered Value: abc", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after sixth test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge7();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase7Validation();
    }
    //password test case validation challenge test method (challenge 8) (valid tc validation)
    protected void solvePasswordTCValidationChallenge8Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered seventh test case validation
        assertEquals("7 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 7)
        assertEquals("Entered Value: qwertyuiopasdfghjklzxcvbnm", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after seventh test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge8Result(learnModePasswordChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge8();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase8Validation();
    }
    //password test case validation challenge test method (challenge 9) (invalid tc validation - non-allowed symbols)
    protected void solvePasswordTCValidationChallenge9Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered eighth test case validation
        assertEquals("8 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 8)
        assertEquals("Entered Value: P@ssword_1", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after eighth test case validation)
        assertEquals("Result: Valid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge9Result(learnModePasswordChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge9();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase9Validation();
    }
    //password test case validation challenge test method (challenge 10) (invalid tc validation - lowercase only)
    protected void solvePasswordTCValidationChallenge10Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered ninth test case validation
        assertEquals("9 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 9)
        assertEquals("Entered Value: Слово", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after ninth test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge10Result(learnModePasswordChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge10();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //verify the test case has been validated
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase10Validation();
    }
    //password test case validation challenge test method (challenge 11) (invalid tc validation - doesn't meet requirements)
    protected void solvePasswordTCValidationChallenge11Test(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Execute all eleven Test Cases in any order. You are testing the password input form, which must comply with the requirements described in the tooltip (\"?\" icon). You will gain practical experience in testing password input, which will definitely come in handy on a real project.", scriptedTestingPasswordTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Password Validation", scriptedTestingPasswordTCValidationChallengePage.getPasswordChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing password validation challenge page web element assert
        isScriptedTestingPassValidationChallengePageWebElementDisplayed(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge counter has registered tenth test case validation
        assertEquals("10 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 10)
        assertEquals("Entered Value: password", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after tenth test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //assert the password validation test cases displayed in test case section list has correct text
        isScriptedTestingPasswordValidationTestCaseAsExpected(scriptedTestingPasswordTCValidationChallengePage);
        //assert challenge hint has the expected text
        assertEquals("From 5 to 15 characters, at least one small Latin letter, one capital Latin letter, one symbol, and one number. Not matching the previous password.", scriptedTestingPasswordTCValidationChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger before challenge completion
        logPreChallenge11Result(learnModePasswordChallengePage);
        //input password provided by test case into input field
        scriptedTestingPasswordTCValidationChallengePage.inputPasswordTCValidationChallenge11();
        //click 'submit' button
        scriptedTestingPasswordTCValidationChallengePage.clickSubmitButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", scriptedTestingPasswordTCValidationChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        scriptedTestingPasswordTCValidationChallengePage.clickCloseModalButton();
        //assert the test case validation has been completed
        scriptedTestingPasswordTCValidationChallengePage.verifyTestCase11Validation();
        //assert challenge counter has registered eleventh test case validation
        assertEquals("11 case(s) out of 11", scriptedTestingPasswordTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the test case validation has been completed (tc 11)
        assertEquals("Entered Value: P@ssw_rd", scriptedTestingPasswordTCValidationChallengePage.getEnteredValueText(), "The entered values after completion don't match expected result");
        //assert calculation has the expected result (after eleventh test case validation)
        assertEquals("Result: Invalid Password", scriptedTestingPasswordTCValidationChallengePage.getPasswordValidationResult() , "The calculation result doesn't match expected result");
        //logger after challenge completion
        logPreChallenge12Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");
    }

    //navigate to change profile test case validation challenge test method
    protected void navigateToCreateProfileTCValidationPageTest(){
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
        assertEquals("Scripted Testing", listOfChallengesPage.getScriptedTestingSectionTitle(), "The scripted testing section title doesn't match expectations");
        //click 'number division' challenge link
        listOfChallengesPage.clickScriptedTestingChallengeLink4();
    }
    //create profile test case validation challenge test method (challenge 1) (valid tc validation)
    protected void solveCreateProfileTCValidationChallenge1Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", scriptedTestingCreateProfileTCValidationChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the test case validation has been completed (before first test case validation)
        assertEquals("Entered Values:", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (before operation)
        assertEquals("Result:", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge1Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge1LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '2000' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select2000();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert the test case validation has been completed (after first test case validation)
        assertEquals("Entered Values: Nickname: tech_go1, Last Name: Anderson, Birth Year: 2000", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase1Validation();
    }
    //create profile test case validation challenge test method (challenge 2) (invalid tc validation - nickname too short)
    protected void solveCreateProfileTCValidationChallenge2Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has registered first test case validation
        assertEquals("1 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the first create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: tech_go1, Last Name: Anderson, Birth Year: 2000", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after first test case)
        assertEquals("Result: Your profile created", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge2Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge2LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '2001' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select2001();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase2Validation();
    }
    //create profile test case validation challenge test method (challenge 3) (invalid tc validation - nickname too long)
    protected void solveCreateProfileTCValidationChallenge3Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has registered second test case validation
        assertEquals("2 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the second create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: c_99, Last Name: Harrison, Birth Year: 2001", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after second test case)
        assertEquals("Result: User input error", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge3Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge3LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '2004' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select2004();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", scriptedTestingCreateProfileTCValidationChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase3Validation();
    }
    //create profile test case validation challenge test method (challenge 4) (invalid tc validation - empty nickname/last name input)
    protected void solveCreateProfileTCValidationChallenge4Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has registered third test case validation
        assertEquals("3 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the third create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: superlongnickname_2024, Last Name: Nguyen, Birth Year: 2004", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after third test case)
        assertEquals("Result: User input error", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge4Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge4LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '2005' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select2005();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase4Validation();
    }
    //create profile test case validation challenge test method (challenge 5) (invalid tc validation - nickname contains special symbols only)
    protected void solveCreateProfileTCValidationChallenge5Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has registered fourth test case validation
        assertEquals("4 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the fourth create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: Empty, Last Name: Empty, Birth Year: 2005", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after fourth test case)
        assertEquals("Result: User input error", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge5Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge5LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '2007' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select2007();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase5Validation();
    }
    //create profile test case validation challenge test method (challenge 6) (invalid tc validation - birth year outside of requirements)
    protected void solveCreateProfileTCValidationChallenge6Test(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingCreateProfileTCValidationChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Check these Test Cases in any order, entering corresponding values into the form for creating a profile. In this case, you perform Scripted Testing of the form's functionality, training your basic testing skills.", scriptedTestingCreateProfileTCValidationChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert the page title is as expected
        assertEquals("Create Profile", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method (for scripted testing page elements)
        isIndividualScriptedTestingChallengePageTextMatchesExpectations(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing page repeated web element assert
        isScriptedTestingChallengePageWebElementDisplayed(scriptedTestingNumMultiplicationValidationChallengePage);
        //scripted testing create profile challenge page web element assert
        isScriptedTestingCreateProfileChallengePageWebElementDisplayed(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert challenge counter has registered fifth test case validation
        assertEquals("5 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the change profile test cases displayed in test case section list has correct text
        isScriptedTestingCreateProfileTestCaseAsExpected(scriptedTestingCreateProfileTCValidationChallengePage);
        //assert the fifth create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: @@@@@, Last Name: O'Reilly, Birth Year: 2007", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after fifth test case)
        assertEquals("Result: User input error", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(learnModeNumAddDivisionChallengePage);
        //input nickname provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge6Nickname();
        //input last name provided by test case into input field
        scriptedTestingCreateProfileTCValidationChallengePage.inputCreateProfileTCValidationChallenge6LastName();
        //click birth year dropdown menu
        scriptedTestingCreateProfileTCValidationChallengePage.clickBirthYearDropdownMenu();
        //select '1998' from birth year option
        scriptedTestingCreateProfileTCValidationChallengePage.select1998();
        //click 'submit' button
        scriptedTestingCreateProfileTCValidationChallengePage.clickSubmitButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", scriptedTestingCreateProfileTCValidationChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        scriptedTestingCreateProfileTCValidationChallengePage.clickCloseModalButton();
        //assert the test case validation has been completed
        scriptedTestingCreateProfileTCValidationChallengePage.verifyTestCase6Validation();
        //assert challenge counter has registered sixth test case validation
        assertEquals("6 case(s) out of 6", scriptedTestingCreateProfileTCValidationChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the sixth create profile test case validation has been completed
        assertEquals("Entered Values: Nickname: galaxy_42, Last Name: Newman, Birth Year: 1998", scriptedTestingCreateProfileTCValidationChallengePage.getEnteredValuesText(), "The entered values after completion don't match expected result");
        //assert password validation has the expected result (after sixth test case)
        assertEquals("Result: User input error", scriptedTestingCreateProfileTCValidationChallengePage.getCreateProfileResult() , "The calculation result doesn't match expected result");
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //logger after challenge completion
        logPreChallenge7Result(learnModePasswordChallengePage);
        //click navbar dropdown menu
        listOfChallengesPage.clickNavbarDropdownMenu();
        //return to 'List of Challenges'
        listOfChallengesPage.clickReturnToListOfChallengesLink();
        //assert the user has returned back to 'List of Challenges'
        assertEquals("List of Challenges", listOfChallengesPage.getListOfChallengesPageTitle(), "The 'List of Challenges' page title doesn't match expectations");

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
        //assert 'list of challenges' learn mode section title is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLearnModeTitleDisplayed(), "The 'learn mode' section title is not displayed");
        //assert 'list of challenges' learn mode challenge menu link list is displayed
        assertTrue(listOfChallengesPage.isListOfChallengesLearnModeChallengeLinkDisplayed(), "The 'learn mode' section challenge link is not displayed");
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

    //'Learn mode' number addition/division challenge page specific web element assert
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
        assertEquals("Instruction(s) You Follow", learnModeNumAddDivisionChallengePage.getLearnModeIndividualPageInstructionsChallengeTitle(), "The instructions title doesn't match the expected title");
        //assert input form has the correct title
        assertEquals("Form You Test", learnModeNumAddDivisionChallengePage.getInputFormTitle(), "The input form title doesn't match expected result");
    }

    //individual scripted testing challenge page assert (for repeatable asserts)
    protected void isIndividualScriptedTestingChallengePageTextMatchesExpectations(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        //assert the instructions title is as expected
        assertEquals("Test Case(s) You Validated", scriptedTestingNumMultiplicationValidationChallengePage.getScriptedTestingIndividualPageInstructionsChallengeTitle(), "The instructions title doesn't match the expected title");
        //assert input form has the correct title
        assertEquals("Form You Test", scriptedTestingNumMultiplicationValidationChallengePage.getInputFormTitle(), "The input form title doesn't match expected result");
    }

    //'Learn mode' password restore challenge page specific web element assert
    protected void isLearnModePasswordRestoreChallengePageWebElementDisplayed(LearnModePasswordChallengePage learnModePasswordChallengePage){
        //assert 'password restore' challenge page title is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordRestorePageTitleDisplayed(), "The 'Password Restore' challenge page title is not displayed");
        //assert 'password restore' challenge guide icon is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordRestoreChallengeGuideIconDisplayed(), "The 'Password Restore' challenge guide icon is not displayed");
        //assert 'password restore' challenge instructions title is displayed
        assertTrue(learnModePasswordChallengePage.isInstructionsTitleDisplayed(), "The 'Password Restore' challenge instructions title is not displayed");
        //assert 'password restore' challenges completed counter is displayed
        assertTrue(learnModePasswordChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Password Restore' challenges completed counter is not displayed");
        //assert 'password restore' challenge list is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordRestoreChallengeOneDisplayed(), "The 'Password Restore' challenge list is not displayed");
        //assert 'password restore' challenge input form title is displayed
        assertTrue(learnModePasswordChallengePage.isInputFormTitleDisplayed(), "The 'Password Restore' challenge input form title is not displayed");
        //assert 'password restore' challenge input form 'entered value' are displayed
        assertTrue(learnModePasswordChallengePage.isInputFormEnteredValueDisplayed(), "The 'Password Restore' challenge input form entered value are not displayed");
        //assert 'password restore' challenge input field is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordInputFieldDisplayed(), "The 'Password Restore' challenge password input field is not displayed");
        //assert 'password restore' challenge password update result is displayed
        assertTrue(learnModePasswordChallengePage.isPasswordRestoreResultDisplayed(), "The 'Password Restore' challenge password restore result is not displayed");
        //assert 'password restore' challenge start over button is displayed
        assertTrue(learnModePasswordChallengePage.isStartOverButtonDisplayed(), "The 'Password Restore' challenge start over button is not displayed");
        //assert 'password restore' challenge clear form button is displayed
        assertTrue(learnModePasswordChallengePage.isClearButtonDisplayed(), "The 'Password Restore' challenge clear button is not displayed");
        //assert 'password restore' challenge calculate button is displayed
        assertTrue(learnModePasswordChallengePage.isSubmitButtonDisplayed(), "The 'Password Restore' challenge submit button is not displayed");
    }
    //'Learn mode' update profile challenge page specific web element assert
    protected void isLearnModeUpdateProfileChallengePageWebElementDisplayed(LearnModeUpdateProfilePage learnModeUpdateProfilePage){
        //assert 'update profile' challenge page title is displayed
        assertTrue(learnModeUpdateProfilePage.isUpdateProfileChallengePageTitleDisplayed(), "The 'Update Profile' challenge page title is not displayed");
        //assert 'update profile' challenge guide icon is displayed
        assertTrue(learnModeUpdateProfilePage.isUpdateProfileChallengeGuideIconDisplayed(), "The 'Update Profile' challenge guide icon is not displayed");
        //assert 'update profile' challenge instructions title is displayed
        assertTrue(learnModeUpdateProfilePage.isInstructionsTitleDisplayed(), "The 'Update Profile' challenge instructions title is not displayed");
        //assert 'update profile' challenges completed counter is displayed
        assertTrue(learnModeUpdateProfilePage.isChallengesCompletedCounterDisplayed(), "The 'Update Profile' challenges completed counter is not displayed");
        //assert 'update profile' challenge list is displayed
        assertTrue(learnModeUpdateProfilePage.isUpdateProfileChallengeOneDisplayed(), "The 'Update Profile' challenge list is not displayed");
        //assert 'update profile' challenge input form title is displayed
        assertTrue(learnModeUpdateProfilePage.isInputFormTitleDisplayed(), "The 'Update Profile' challenge input form title is not displayed");
        //assert 'update profile' challenge input form 'entered values' are displayed
        assertTrue(learnModeUpdateProfilePage.isInputFormEnteredValuesDisplayed(), "The 'Update Profile' challenge input form entered values are not displayed");
        //assert 'update profile' challenge nickname input field is displayed
        assertTrue(learnModeUpdateProfilePage.isNicknameInputFieldDisplayed(), "The 'Update Profile' challenge nickname input field is not displayed");
        //assert 'update profile' challenge first name input field is displayed
        assertTrue(learnModeUpdateProfilePage.isFirstNameInputFieldDisplayed(), "The 'Update Profile' challenge first name input field is not displayed");
        //assert 'update profile' challenge last name input field is displayed
        assertTrue(learnModeUpdateProfilePage.isLastNameInputFieldDisplayed(), "The 'Update Profile' challenge last name input field is not displayed");
        //assert 'update profile' challenge update profile result is displayed
        assertTrue(learnModeUpdateProfilePage.isUpdateProfileResultDisplayed(), "The 'Update Profile' challenge password restore result is not displayed");
        //assert 'update profile' challenge start over button is displayed
        assertTrue(learnModeUpdateProfilePage.isStartOverButtonDisplayed(), "The 'Update Profile' challenge start over button is not displayed");
        //assert 'update profile' challenge clear form button is displayed
        assertTrue(learnModeUpdateProfilePage.isClearButtonDisplayed(), "The 'Update Profile' challenge clear button is not displayed");
        //assert 'update profile' challenge calculate button is displayed
        assertTrue(learnModeUpdateProfilePage.isSubmitButtonDisplayed(), "The 'Update Profile' challenge submit button is not displayed");
    }
    //'Learn mode' number multiplication challenge page specific web element assert
    protected void isLearnModeNumMultiplicationChallengePageWebElementDisplayed(LearnModeNumMultiplicationPage learnModeNumMultiplicationPage){
        //assert 'number multiplication' challenge page title is displayed
        assertTrue(learnModeNumMultiplicationPage.isNumberMultiplicationPageTitleDisplayed(), "The 'Number Addition' challenge page title is not displayed");
        //assert 'number multiplication' challenge guide icon is displayed
        assertTrue(learnModeNumMultiplicationPage.isNumberMultiplicationGuideIconDisplayed(), "The 'Number Addition' challenge guide icon is not displayed");
        //assert 'number multiplication' test case section title is displayed
        assertTrue(learnModeNumMultiplicationPage.isTestCaseSectionTitleDisplayed(), "The 'Number Addition' test case section title is not displayed");
        //assert 'number multiplication' test case dropdown value 1 menu is displayed
        assertTrue(learnModeNumMultiplicationPage.isTestCaseDropdownValue1MenuDisplayed(), "The 'Number Addition' test case dropdown value1 menu is not displayed");
        //assert 'number multiplication' test case dropdown value 2 menu is displayed
        assertTrue(learnModeNumMultiplicationPage.isTestCaseDropdownValue2MenuDisplayed(), "The 'Number Addition' test case dropdown value2 menu is not displayed");
        //assert 'number multiplication' test case dropdown result menu is displayed
        assertTrue(learnModeNumMultiplicationPage.isTestCaseDropdownResultMenuDisplayed(), "The 'Number Addition' test case dropdown result menu is not displayed");
        //assert 'number multiplication' test case section title is displayed
        assertTrue(learnModeNumMultiplicationPage.isTestCaseValidationButtonDisplayed(), "The 'Number Addition' test case validation button is not displayed");
        //assert 'number multiplication' challenge video guide link is displayed
        assertTrue(learnModeNumMultiplicationPage.isVideoGuideLinkDisplayed(), "The 'Number Addition' challenge video guide link is not displayed");
        //assert 'number multiplication' challenge instructions title is displayed
        assertTrue(learnModeNumMultiplicationPage.isInstructionsTitleDisplayed(), "The 'Number Addition' challenge instructions title is not displayed");
        //assert 'number multiplication' challenges completed counter is displayed
        assertTrue(learnModeNumMultiplicationPage.isChallengesCompletedCounterDisplayed(), "The 'Number Multiplication' challenges completed counter is not displayed");
        //assert 'number multiplication' challenge list is displayed
        assertTrue(learnModeNumMultiplicationPage.isNumberMultiplicationChallengeOneDisplayed(), "The 'Number Multiplication' challenge list is not displayed");
        //assert 'number multiplication' challenge input form title is displayed
        assertTrue(learnModeNumMultiplicationPage.isInputFormTitleDisplayed(), "The 'Number Multiplication' challenge input form title is not displayed");
        //assert 'number multiplication' challenge input form 'entered values' are displayed
        //assertTrue(learnModeNumMultiplicationPage.isInputFormEnteredValuesDisplayed(), "The 'Number Multiplication' challenge input form entered values are not displayed");
        //assert 'number multiplication' challenge number 1 input field is displayed
        assertTrue(learnModeNumMultiplicationPage.isNumber1InputFieldDisplayed(), "The 'Number Multiplication' challenge number 1 input field is not displayed");
        //assert 'number multiplication' challenge hint is displayed
        assertTrue(learnModeNumMultiplicationPage.isChallengeHintDisplayed(), "The 'Number Multiplication' challenge hint is not displayed");
        //assert 'number multiplication' challenge number 2 input field is displayed
        assertTrue(learnModeNumMultiplicationPage.isNumber2InputFieldDisplayed(), "The 'Number Multiplication' challenge number 2 input field is not displayed");
        //assert 'number multiplication' challenge calculation result is displayed
        assertTrue(learnModeNumMultiplicationPage.isCalculationResultDisplayed(), "The 'Number Multiplication' challenge calculation result is not displayed");
        //assert 'number multiplication' challenge start over button is displayed
        assertTrue(learnModeNumMultiplicationPage.isStartOverButtonDisplayed(), "The 'Number Multiplication' challenge start over button is not displayed");
        //assert 'number multiplication' challenge calculate button is displayed
        assertTrue(learnModeNumMultiplicationPage.isCalculateButtonDisplayed(), "The 'Number Multiplication' challenge calculate button is not displayed");
    }
    //'Scripted testing' challenge page specific general web element assert  (number multiplication / division)
    protected void isScriptedTestingChallengePageWebElementDisplayed(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        //assert scripted testing page challenge page title is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationPageTitleDisplayed(), "The 'Scripted Testing' challenge page title is not displayed");
        //assert scripted testing page challenge guide icon is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationGuideIconDisplayed(), "The 'Scripted Testing' challenge guide icon is not displayed");
        //assert scripted testing page test case section title is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isTestCaseSectionTitleDisplayed(), "The 'Scripted Testing' test case section title is not displayed");
        //assert scripted testing page challenges completed counter is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Scripted Testing' challenges completed counter is not displayed");
        //assert scripted testing page challenge input form title is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isInputFormTitleDisplayed(), "The 'Scripted Testing' challenge input form title is not displayed");
        //assert scripted testing page challenge input form 'entered values' are displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isInputFormEnteredValuesDisplayed(), "Scripted Testing' challenge input form entered values are not displayed");
        //assert scripted testing page challenge calculation result is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isCalculationResultDisplayed(), "The 'Scripted Testing' challenge calculation result is not displayed");
        //assert scripted testing page challenge start over button is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isStartOverButtonDisplayed(), "The 'Scripted Testing' challenge start over button is not displayed");
        //assert scripted testing page challenge clear form button is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isClearFormButtonDisplayed(), "The 'Scripted Testing' challenge clear form button is not displayed");
        //assert scripted testing page challenge calculate button is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isCalculateButtonDisplayed(), "The 'Scripted Testing' challenge calculate button is not displayed");
    }
    //'Scripted testing' number multiplication challenge page specific web element assert
    protected void isScriptedTestingNumMultiplicationChallengePageWebElementDisplayed(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        //assert 'number multiplication' challenge video guide link is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isVideoGuideLinkDisplayed(), "The 'Number Addition' challenge video guide link is not displayed");
        //assert 'number multiplication' test case list is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseOneDisplayed(), "The 'Number Multiplication' test case one is not displayed");
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseTwoDisplayed(), "The 'Number Multiplication' test case two is not displayed");
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseThreeDisplayed(), "The 'Number Multiplication' test case three is not displayed");
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseFourDisplayed(), "The 'Number Multiplication' test case four is not displayed");
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseFiveDisplayed(), "The 'Number Multiplication' test case five is not displayed");
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumberMultiplicationTestCaseSixDisplayed(), "The 'Number Multiplication' test case six is not displayed");
        //assert scripted testing (number multiplication / division) challenge input form 'entered values' are displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Number Multiplication / Division' challenge input form entered values are not displayed");
        //assert scripted testing (number multiplication / division) challenge number 1 input field is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumber1InputFieldDisplayed(), "The 'Number Multiplication / Division' challenge number 1 input field is not displayed");
        //assert scripted testing page challenge hint is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isChallengeHintDisplayed(), "The 'Number Multiplication / Division' challenge hint is not displayed");
        //assert scripted testing (number multiplication / division) challenge number 2 input field is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumber2InputFieldDisplayed(), "The 'Number Multiplication / Division' challenge number 2 input field is not displayed");
    }
    //'Scripted Testing' number multiplication test cases list assert
    protected void isScriptedTestingNumMultiplicationTestCaseAsExpected(ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage){
        //assert the number multiplication test cases displayed in test case section list has correct text
        assertEquals("Leave both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseOne(), "The test case one challenge description doesn't match expected result");
        assertEquals("Input \"abc\" and \"2\" into the input fields where at least one value is not a number, then click on the \"Calculate\" button. Expected Result: \"User input error\".", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseTwo(), "The test case two challenge description doesn't match expected result");
        assertEquals("Enter \"5\" and \"7\" into the input fields, then click on the \"Calculate\" button. Expected Result: correct multiplication of the numbers.", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseThree(), "The test case three challenge description doesn't match expected result");
        assertEquals("Input \"10000000000\" and \"8\" into the input fields where at least one number exceeds the maximum length limit for inputted values, then click on the \"Calculate\" button. Expected Result: \"Application error\".", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseFour(), "The test case four challenge description doesn't match expected result");
        assertEquals("Input \"3.5\" and \"2.7\" into the input fields where at least one number is a decimal fraction, then click on the \"Calculate\" button. Expected Result: correct multiplication of the numbers.", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseFive(), "The test case five challenge description doesn't match expected result");
        assertEquals("Input \"-8\" and \"4\" into the input fields where at least one number is negative, then click on the \"Calculate\" button. Expected Result: correct multiplication of the numbers.", scriptedTestingNumMultiplicationValidationChallengePage.getTestCaseSix(), "The test case six challenge description doesn't match expected result");
    }
    //'Scripted testing' number division challenge page specific web element assert
    protected void isScriptedTestingNumDivisionChallengePageWebElementDisplayed(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage){
        //assert 'number division' test case list is displayed
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseOneDisplayed(), "The 'Number Multiplication' test case one is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseTwoDisplayed(), "The 'Number Multiplication' test case two is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseThreeDisplayed(), "The 'Number Multiplication' test case three is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseFourDisplayed(), "The 'Number Multiplication' test case four is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseFiveDisplayed(), "The 'Number Multiplication' test case five is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseSixDisplayed(), "The 'Number Multiplication' test case six is not displayed");
        assertTrue(scriptedTestingNumDivisionValidationChallengePage.isNumberDivisionTestCaseSevenDisplayed(), "The 'Number Multiplication' test case seven is not displayed");
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //assert scripted testing (number multiplication / division) challenge input form 'entered values' are displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Number Multiplication / Division' challenge input form entered values are not displayed");
        //assert scripted testing (number multiplication / division) challenge number 1 input field is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumber1InputFieldDisplayed(), "The 'Number Multiplication / Division' challenge number 1 input field is not displayed");
        //assert scripted testing (number multiplication / division) challenge number 2 input field is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isNumber2InputFieldDisplayed(), "The 'Number Multiplication / Division' challenge number 2 input field is not displayed");
        //assert scripted testing page challenge hint is displayed
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isChallengeHintDisplayed(), "The 'Number Multiplication / Division' challenge hint is not displayed");

    }
    //'Scripted Testing' number division test cases list assert
    protected void isScriptedTestingNumDivisionTestCaseAsExpected(ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage){
        //assert the number division test cases displayed in test case section list has correct text
        assertEquals("Enter \"4\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: correct division of the numbers.", scriptedTestingNumDivisionValidationChallengePage.getTestCaseOne(), "The test case one challenge description doesn't match expected result");
        assertEquals("Input \"-10\" and \"2\" into the input fields where one or both numbers are negative, then click on the \"Calculate\" button. Expected Result: correct division of the numbers.", scriptedTestingNumDivisionValidationChallengePage.getTestCaseTwo(), "The test case two challenge description doesn't match expected result");
        assertEquals("Enter \"5\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: correct division of the numbers with a decimal fraction.", scriptedTestingNumDivisionValidationChallengePage.getTestCaseThree(), "The test case three challenge description doesn't match expected result");
        assertEquals("Input \"10000000000\" in the First Number input field and \"8\" in the Second Number input field, where one or both numbers are very big, then click on the \"Calculate\" button. Expected Result: correct division of the numbers.", scriptedTestingNumDivisionValidationChallengePage.getTestCaseFour(), "The test case four challenge description doesn't match expected result");
        assertEquals("Enter \"abc\" in the First Number input field and \"1\" in the Second Number input field, where one or both values are not a number, then click on the \"Calculate\" button. Expected Result: \"User input error\".", scriptedTestingNumDivisionValidationChallengePage.getTestCaseFive(), "The test case five challenge description doesn't match expected result");
        assertEquals("Leave one or both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", scriptedTestingNumDivisionValidationChallengePage.getTestCaseSix(), "The test case six challenge description doesn't match expected result");
        assertEquals("Input \"10\" into the first input field and \"0\" into the second input field, then click on the \"Calculate\" button. Expected Result: \"Division by zero is not allowed\".", scriptedTestingNumDivisionValidationChallengePage.getTestCaseSeven(), "The test case seven challenge description doesn't match expected result");
    }
    //'Scripted testing' password validation challenge page web element assert
    protected void isScriptedTestingPassValidationChallengePageWebElementDisplayed(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        //assert 'password validation' test case list is displayed
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseOneDisplayed(), "The 'Password Validation' test case one is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseTwoDisplayed(), "The 'Password Validation' test case two is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseThreeDisplayed(), "The 'Password Validation' test case three is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseFourDisplayed(), "The 'Password Validation' test case four is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseFiveDisplayed(), "The 'Password Validation' test case five is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseSixDisplayed(), "The 'Password Validation' test case six is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseSevenDisplayed(), "The 'Password Validation' test case seven is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseEightDisplayed(), "The 'Password Validation' test case eight is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseNineDisplayed(), "The 'Password Validation' test case nine is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseTenDisplayed(), "The 'Password Validation' test case ten is not displayed");
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationTestCaseElevenDisplayed(), "The 'Password Validation' test case eleven is not displayed");

        //assert scripted testing password validation challenge input form 'entered value' is displayed
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationEnteredValueDisplayed(), "The 'Password Validation' challenge input form entered values are not displayed");
        //assert scripted testing password validation challenge password input field is displayed
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordValidationInputFieldDisplayed(), "The 'Password Validation' challenge number 1 input field is not displayed");
        //assert scripted testing password validation challenge submit button is displayed
        assertTrue(scriptedTestingPasswordTCValidationChallengePage.isPasswordSubmitButtonDisplayed(), "The 'Password Validation' challenge calculate button is not displayed");
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //assert scripted testing page challenge hint is displayed (above caller used due to it being a similar page element)
        assertTrue(scriptedTestingNumMultiplicationValidationChallengePage.isChallengeHintDisplayed(), "The 'Password Validation' challenge hint is not displayed");
    }
    //'Scripted testing' password validation test case web element assert
    protected void isScriptedTestingPasswordValidationTestCaseAsExpected(ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage){
        //assert the number multiplication test cases displayed in test case section list has correct text
        assertEquals("Enter \"PASSWORD\" as the password containing only uppercase letters and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseOne(), "The test case one challenge description doesn't match expected result");
        assertEquals("Enter \"123456\" as the password containing only digits and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseTwo(), "The test case two challenge description doesn't match expected result");
        assertEquals("Enter \"!@#$%\" as the password containing only special characters and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseThree(), "The test case three challenge description doesn't match expected result");
        assertEquals("Enter the previously saved password \"Password1@23\" and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseFour(), "The test case four challenge description doesn't match expected result");
        assertEquals("Leave the password field empty and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseFive(), "The test case five challenge description doesn't match expected result");
        assertEquals("Enter \"abc\" as the password, which is less than 5 characters long, and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseSix(), "The test case six challenge description doesn't match expected result");
        assertEquals("Enter \"qwertyuiopasdfghjklzxcvbnm\" as the password, which exceeds 15 characters, and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseSeven(), "The test case seven challenge description doesn't match expected result");
        assertEquals("Enter \"P@ssword_1\" as the password, which meets all the requirements, and click the \"Submit\" button. Expected Result: \"Valid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseEight(), "The test case eight challenge description doesn't match expected result");
        assertEquals("Enter \"Слово\" as the password, which contains the not-allowed symbol, and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseNine(), "The test case nine challenge description doesn't match expected result");
        assertEquals("Enter \"password\" as the password containing only lowercase letters and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseTen(), "The test case ten challenge description doesn't match expected result");
        assertEquals("Enter \"P@ssw_rd\" as the password, which does not meet all the requirements, and click the \"Submit\" button. Expected Result: \"Invalid Password\".", scriptedTestingPasswordTCValidationChallengePage.getTestCaseEleven(), "The test case eleven challenge description doesn't match expected result");
    }
    //'Scripted testing' create profile challenge page specific web element assert
    protected void isScriptedTestingCreateProfileChallengePageWebElementDisplayed(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingChangeProfileTCValidationChallengePage){
        //assert 'number multiplication' test case list is displayed
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseOneDisplayed(), "The 'Create Profile' test case one is not displayed");
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseTwoDisplayed(), "The 'Create Profile' test case two is not displayed");
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseThreeDisplayed(), "The 'Create Profile' test case three is not displayed");
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseFourDisplayed(), "The 'Create Profile' test case four is not displayed");
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseFiveDisplayed(), "The 'Create Profile' test case five is not displayed");
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isChangeProfileTestCaseSixDisplayed(), "The 'Create Profile' test case six is not displayed");
        //assert scripted testing (change profile) challenge input form 'entered values' are displayed
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Create Profile' challenge input form entered values are not displayed");
        //assert scripted testing (change profile) challenge birth year dropdown menu is displayed
        assertTrue(scriptedTestingChangeProfileTCValidationChallengePage.isBirthYearDropdownMenuDisplayed(), "The 'Create Profile' challenge birth year dropdown menu is not displayed");
    }
    //'Scripted Testing' create profile test cases list assert
    protected void isScriptedTestingCreateProfileTestCaseAsExpected(ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingChangeProfileTCValidationChallengePage){
        //assert the number division test cases displayed in test case section list has correct text
        assertEquals("Enter Nickname: \"tech_go1\", Last Name: \"Anderson\", Birth Year: \"2000\", and press \"Submit\". Expected Result: \"Your profile created\". All entered values meet the requirements.", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseOne(), "The test case one challenge description doesn't match expected result");
        assertEquals("Enter Nickname: \"c_99\", Last Name: \"Harrison\", Birth Year: \"2001\", and press \"Submit\". Expected Result: \"User input error\". One or several of the entered values don't meet the min length requirement.", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseTwo(), "The test case two challenge description doesn't match expected result");
        assertEquals("Enter Nickname \"superlongnickname_2024\", Last Name: \"Nguyen\", Birth Year: \"2004\", and press \"Submit\". Expected Result: \"User input error\". One or several of the entered values don't meet the max length requirement.", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseThree(), "The test case three challenge description doesn't match expected result");
        assertEquals("Leave Nickname and/or Last Name fields empty, then enter any Birth Year and press \"Submit\". Expected Result: \"User input error\".", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseFour(), "The test case four challenge description doesn't match expected result");
        assertEquals("Enter Nickname: \"@@@@@\" Last Name: \"O'Reilly\", choose a valid Birth Year, and press \"Submit\". Expected Result: \"User input error\". Nickname field contains not allowed characters.", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseFive(), "The test case five challenge description doesn't match expected result");
        assertEquals("Enter Nickname: \"galaxy_42\", Last Name: \"Newman\", Birth Year: \"1998\", and press \"Submit\". Expected Result: \"User input error\". Birth Year is not within specified period 2000-2005.", scriptedTestingChangeProfileTCValidationChallengePage.getTestCaseSix(), "The test case six challenge description doesn't match expected result");
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
    protected void logPreChallenge12Result(LearnModePasswordChallengePage learnModePasswordChallengePage){
        logger.info("Displayed character counter(after challenge 12): " + learnModePasswordChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(after challenge 12): " + learnModePasswordChallengePage.getEnteredValueText());
        logger.info("Displayed result(after challenge 12): " + learnModePasswordChallengePage.getPasswordRestoreResult() +"\n");
    }

}
