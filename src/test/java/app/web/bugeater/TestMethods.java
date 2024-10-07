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
    protected void solveNumberAdditionChallenge1Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the six step-by-step appearing instructions, entering values into the form. This way, you conduct a basic check of the form's proper functioning. You are practically applying the Scripted Testing.", individualLearnModeChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", individualLearnModeChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        individualLearnModeChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"1\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"3\".", individualLearnModeChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values:", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputAdditionChallenge1Number1();
        individualLearnModeChallengePage.inputAdditionChallenge1Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert entered values are displayed
        assertEquals("Entered Values: First Number: 1, Second Number: 2", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
    }

    //number addition challenge test method (challenge 2) (valid number inputs)
    protected void solveNumberAdditionChallenge2Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert the challenge two has correct text
        assertEquals("Input \"-2\" and \"4\" into the input fields where one number is negative, then click on the \"Calculate\" button. Expected Result: \"2\".", individualLearnModeChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
       //assert calculation has the expected result (before challenge two completion)
        assertEquals("Result: 3", individualLearnModeChallengePage.getCalculationResult(), "The calculation result before calculation doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after first challenge completion
        assertEquals("1 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputAdditionChallenge2Number1();
        individualLearnModeChallengePage.inputAdditionChallenge2Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 3) (valid number inputs)
    protected void solveNumberAdditionChallenge3Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert the challenge three has correct text
        assertEquals("Enter \"1.5\" and \"2.5\" into the input fields; both are decimal fractions, then click on the \"Calculate\" button. Expected Result: \"4.0\".", individualLearnModeChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge three completion)
        assertEquals("Entered Values: First Number: -2, Second Number: 4", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge three completion)
        assertEquals("Result: 2", individualLearnModeChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after second challenge completion
        assertEquals("2 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputAdditionChallenge3Number1();
        individualLearnModeChallengePage.inputAdditionChallenge3Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", numberAdditionChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //number addition challenge test method (challenge 4)
    protected void solveNumberAdditionChallenge4Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert the challenge three has correct text
        assertEquals("Enter \"abc\" in the First Number input field and \"1\" in the Second Number input field, then click on the \"Calculate\" button. Expected Result: \"User input error\".", individualLearnModeChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge four completion)
        assertEquals("Entered Values: First Number: 1.5, Second Number: 2.5", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge four completion)
        assertEquals("Result: 4.0", individualLearnModeChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after third challenge completion
        assertEquals("3 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(individualLearnModeChallengePage);
        //input numbers into input field (number 1 is a string)
        individualLearnModeChallengePage.inputAdditionChallenge4Number1();
        individualLearnModeChallengePage.inputAdditionChallenge4Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 5) (both test inputs are blank)
    protected void solveNumberAdditionChallenge5Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert the challenge three has correct text
        assertEquals("Leave both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", individualLearnModeChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge five completion)
        assertEquals("Entered Values: First Number: abc, Second Number: 1", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge five completion)
        assertEquals("Result: User input error", individualLearnModeChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after fourth challenge completion
        assertEquals("4 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(individualLearnModeChallengePage);
        //input numbers into input field (both inputs are blank)
        individualLearnModeChallengePage.inputAdditionChallenge5Number1();
        individualLearnModeChallengePage.inputChallenge5Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number addition challenge test method (challenge 6) (one input is 10000000000 (out of limit bounds))
    protected void solveNumberAdditionChallenge6Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Addition", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert the challenge three has correct text
        assertEquals("Input \"10000000000\" into the first input field, which is too large, and set the second value to \"1\", then click on the \"Calculate\" button. Expected Result: \"Application Error\".", individualLearnModeChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge six completion)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge six completion)
        assertEquals("Result: User input error", individualLearnModeChallengePage.getCalculationResult(), "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert challenges counter gets updated after fifth challenge completion
        assertEquals("5 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(individualLearnModeChallengePage);
        //input numbers into input field (both inputs are blank)
        individualLearnModeChallengePage.inputAdditionChallenge6Number1();
        individualLearnModeChallengePage.inputAdditionChallenge6Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", numberAdditionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        individualLearnModeChallengePage.clickCloseModalButton();
        //assert all challenges are completed
        assertEquals("6 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered has the expected display (after challenge six completion)
        assertEquals("Entered Values: First Number: 10000000000, Second Number: 1", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (after challenge six completion)
        assertEquals("Result: Application Error", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
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
    protected void solveNumberDivisionChallenge1Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the six step-by-step appearing instructions, entering values into the form. This way, you conduct a basic check of the form's proper functioning. You are practically applying the Scripted Testing.", individualLearnModeChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", individualLearnModeChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        individualLearnModeChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"4\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"2\".", individualLearnModeChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values:", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge1Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputDivisionChallenge1Number1();
        individualLearnModeChallengePage.inputDivisionChallenge1Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert entered values are displayed
        assertEquals("Entered Values: First Number: 4, Second Number: 2", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
    }
    //number division challenge test method (challenge 2) (one number is negative)
    protected void solveNumberDivisionChallenge2Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenges counter gets updated after first challenge completion
        assertEquals("1 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge two has correct text
        assertEquals("Input \"-10\" and \"2\" into the input fields where one number is negative, then click on the \"Calculate\" button. Expected Result: \"-5\".", individualLearnModeChallengePage.getChallengeTwo(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values: First Number: 4, Second Number: 2", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge two completion)
        assertEquals("Result: 2", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge2Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputDivisionChallenge2Number1();
        individualLearnModeChallengePage.inputDivisionChallenge2Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 3) (valid number inputs)
    protected void solveNumberDivisionChallenge3Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenges counter gets updated after second challenge completion
        assertEquals("2 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge three has correct text
        assertEquals("Enter \"5\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"2.5\" (decimal fraction).", individualLearnModeChallengePage.getChallengeThree(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge three completion)
        assertEquals("Entered Values: First Number: -10, Second Number: 2", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge three completion)
        assertEquals("Result: -5", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge3Result(individualLearnModeChallengePage);
        //input numbers into input field
        individualLearnModeChallengePage.inputDivisionChallenge3Number1();
        individualLearnModeChallengePage.inputDivisionChallenge3Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert 'halfway there' message is displayed
        //assertEquals("Halfway there!", numberAdditionChallengePage.getHalfwayThereMessage(), "The 'halfway there' message isn't displayed"); //NoSuchElementException with valid selector
    }
    //number division challenge test method (challenge 4) (number 1 is a string)
    protected void solveNumberDivisionChallenge4Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenges counter gets updated after third challenge completion
        assertEquals("3 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge four has correct text
        assertEquals("Enter \"abc\" in the First Number input field and \"1\" in the Second Number input field, then click on the \"Calculate\" button. Expected Result: \"User input error\".", individualLearnModeChallengePage.getChallengeFour(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge four completion)
        assertEquals("Entered Values: First Number: 5, Second Number: 2", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge four completion)
        assertEquals("Result: 2.5", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge4Result(individualLearnModeChallengePage);
        //input numbers into input field (number 1 is a string)
        individualLearnModeChallengePage.inputDivisionChallenge4Number1();
        individualLearnModeChallengePage.inputDivisionChallenge4Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 5) (both inputs are blank)
    protected void solveNumberDivisionChallenge5Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenges counter gets updated after fourth challenge completion
        assertEquals("4 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge five has correct text
        assertEquals("Leave both input fields blank and then click on the \"Calculate\" button. Expected Result: \"User input error\".", individualLearnModeChallengePage.getChallengeFive(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge five completion)
        assertEquals("Entered Values: First Number: abc, Second Number: 1", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge five completion)
        assertEquals("Result: User input error", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge5Result(individualLearnModeChallengePage);
        //input numbers into input field (both inputs are blank)
        individualLearnModeChallengePage.inputDivisionChallenge5Number1();
        individualLearnModeChallengePage.inputDivisionChallenge5Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
    }
    //number division challenge test method (challenge 6) (invalid division by zero)
    protected void solveNumberDivisionChallenge6Test(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the page title is as expected
        assertEquals("Number Division", individualLearnModeChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //repeatable assert method
        isIndividualChallengePageTextMatchesExpectations(individualLearnModeChallengePage);
        //assert challenges counter gets updated after fifth challenge completion
        assertEquals("5 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge six has correct text
        assertEquals("Input \"10\" into the first input field and \"0\" into the second input field, then click on the \"Calculate\" button. Expected Result: \"Application Error\".", individualLearnModeChallengePage.getChallengeSix(), "The challenge description doesn't match expected result");
        //assert input form entered has the expected display (before challenge six completion)
        assertEquals("Entered Values: First Number: Empty, Second Number: Empty", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (before challenge six completion)
        assertEquals("Result: User input error", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Divide two numbers", individualLearnModeChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //logger before challenge completion
        logPreChallenge6Result(individualLearnModeChallengePage);
        //input numbers into input field (number 2 is 0)
        individualLearnModeChallengePage.inputDivisionChallenge6Number1();
        individualLearnModeChallengePage.inputDivisionChallenge6Number2();
        //click 'calculate' button
        individualLearnModeChallengePage.clickCalculateButton();
        //assert challenge completion modal has the expected title (NoSuchElementException despite valid selector)
        //assertEquals("You did it!", numberAdditionChallengePage.getChallengeCompletionModalTitle(), "The challenge completion modal title displayed doesn't match expected title");
        //click close modal button
        individualLearnModeChallengePage.clickCloseModalButton();
        //assert all challenges are completed
        assertEquals("6 instruction(s) out of 6", individualLearnModeChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert input form entered has the expected display (after challenge six completion)
        assertEquals("Entered Values: First Number: 10, Second Number: 0", individualLearnModeChallengePage.getEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (after challenge six completion)
        assertEquals("Result: Application Error", individualLearnModeChallengePage.getCalculationResult() , "The calculation result doesn't match expected result");
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

    //Individual challenge page specific web element assert
    protected void isIndividualChallengePageWebElementDisplayed(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        //assert 'number addition' challenge page title is displayed
        assertTrue(individualLearnModeChallengePage.isNumberAdditionChallengePageTitleDisplayed(), "The 'Number Addition' challenge page title is not displayed");
        //assert 'number addition' challenge guide icon is displayed
        assertTrue(individualLearnModeChallengePage.isNumberAdditionChallengeGuideIconDisplayed(), "The 'Number Addition' challenge guide icon is not displayed");
        //assert 'number addition' challenge video guide link is displayed
        assertTrue(individualLearnModeChallengePage.isVideoGuideLinkDisplayed(), "The 'Number Addition' challenge video guide link is not displayed");
        //assert 'number addition' challenge instructions title is displayed
        assertTrue(individualLearnModeChallengePage.isInstructionsTitleDisplayed(), "The 'Number Addition' challenge instructions title is not displayed");
        //assert 'number addition' challenges completed counter is displayed
        assertTrue(individualLearnModeChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Number Addition' challenges completed counter is not displayed");
        //assert 'number addition' challenge list is displayed
        assertTrue(individualLearnModeChallengePage.isNumberAdditionChallengeOneDisplayed(), "The 'Number Addition' challenge list is not displayed");
        //assert 'number addition' challenge input form title is displayed
        assertTrue(individualLearnModeChallengePage.isInputFormTitleDisplayed(), "The 'Number Addition' challenge input form title is not displayed");
        //assert 'number addition' challenge input form 'entered values' are displayed
        assertTrue(individualLearnModeChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Number Addition' challenge input form entered values are not displayed");
        //assert 'number addition' challenge number 1 input field is displayed
        assertTrue(individualLearnModeChallengePage.isNumber1InputFieldDisplayed(), "The 'Number Addition' challenge number 1 input field is not displayed");
        //assert 'number addition' challenge hint is displayed
        assertTrue(individualLearnModeChallengePage.isChallengeHintDisplayed(), "The 'Number Addition' challenge hint is not displayed");
        //assert 'number addition' challenge number 2 input field is displayed
        assertTrue(individualLearnModeChallengePage.isNumber2InputFieldDisplayed(), "The 'Number Addition' challenge number 2 input field is not displayed");
        //assert 'number addition' challenge calculation result is displayed
        assertTrue(individualLearnModeChallengePage.isCalculationResultDisplayed(), "The 'Number Addition' challenge calculation result is not displayed");
        //assert 'number addition' challenge start over button is displayed
        assertTrue(individualLearnModeChallengePage.isStartOverButtonDisplayed(), "The 'Number Addition' challenge start over button is not displayed");
        //assert 'number addition' challenge clear form button is displayed
        assertTrue(individualLearnModeChallengePage.isClearButtonDisplayed(), "The 'Number Addition' challenge clear button is not displayed");
        //assert 'number addition' challenge calculate button is displayed
        assertTrue(individualLearnModeChallengePage.isCalculateButtonDisplayed(), "The 'Number Addition' challenge calculate button is not displayed");
    }

    //individual challenge page assert (for repeatable asserts)
    protected void isIndividualChallengePageTextMatchesExpectations(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        //assert the instructions title is as expected
        assertEquals("Instruction(s) You Follow", individualLearnModeChallengePage.getNumberAdditionInstructionsTitle(), "The instructions title doesn't match the expected title");
        //assert input form has the correct title
        assertEquals("Form You Test", individualLearnModeChallengePage.getInputFormTitle(), "The input form title doesn't match expected result");
    }

    //pre-challenges loggers (for debug validation)
    protected void logPreChallenge1Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 1): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 1): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 1): " + individualLearnModeChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge2Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 2): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 2): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 2): " + individualLearnModeChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge3Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 3): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 3): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 3): " + individualLearnModeChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge4Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 4): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 4): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 4): " + individualLearnModeChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge5Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 5): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 5): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 5): " + individualLearnModeChallengePage.getCalculationResult()+"\n");
    }
    protected void logPreChallenge6Result(IndividualLearnModeChallengePage individualLearnModeChallengePage){
        logger.info("Displayed character counter(before challenge 6): " + individualLearnModeChallengePage.getChallengesCounterText());
        logger.info("Displayed entered values(before challenge 6): " + individualLearnModeChallengePage.getEnteredValuesText());
        logger.info("Displayed result(before challenge 6): " + individualLearnModeChallengePage.getCalculationResult() +"\n");
    }

}
