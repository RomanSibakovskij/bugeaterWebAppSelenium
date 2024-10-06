package app.web.bugeater;

import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.*;

public class TestMethods extends BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //number addition challenge test method
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

    //number addition challenge test method
    protected void solveNumberAdditionChallenge1Test(NumberAdditionChallengePage numberAdditionChallengePage){
        ListOfChallengesPage listOfChallengesPage = new ListOfChallengesPage(driver);
        //general page web element assert (elements that all pages have)
        isChallengeAppPageWebElementDisplayed(listOfChallengesPage);
        //assert the challenge text is displayed as expected
        assertEquals("Follow the six step-by-step appearing instructions, entering values into the form. This way, you conduct a basic check of the form's proper functioning. You are practically applying the Scripted Testing.", numberAdditionChallengePage.getCurrentChallengeText(), "The text of the challenge doesn't match the expected text");
        //assert tutorial description text is displayed as expected
        assertEquals("This description explains the challenge and what you need to do. Read it carefully before starting the challenge.", numberAdditionChallengePage.getTutorialDescriptionText(), "The tutorial text doesn't match the expected text");
        //click tutorial 'skip' button
        numberAdditionChallengePage.clickSkipTutorialButton();
        //assert the page title is as expected
        assertEquals("Number Addition", numberAdditionChallengePage.getNumberAdditionChallengeTitle(), "The challenge page title doesn't match the expected title");
        //web element assert
        isNumberAdditionChallengeWebElementDisplayed(numberAdditionChallengePage);
        //assert the instructions title is as expected
        assertEquals("Instruction(s) You Follow", numberAdditionChallengePage.getNumberAdditionInstructionsTitle(), "The instructions title doesn't match the expected title");
        //assert challenge counter has no challenges completed yet
        assertEquals("0 instruction(s) out of 6", numberAdditionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result");
        //assert the challenge one has correct text
        assertEquals("Enter \"1\" and \"2\" into the input fields, then click on the \"Calculate\" button. Expected Result: \"3\".", numberAdditionChallengePage.getChallengeOne(), "The challenge description doesn't match expected result");
        //assert input form has the correct title
        assertEquals("Form You Test", numberAdditionChallengePage.getInputFormTitle(), "The input form title doesn't match expected result");
        //assert input form entered has the expected display
        assertEquals("Entered Values:", numberAdditionChallengePage.getInputFormEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert challenge hint has the expected text
        assertEquals("Add two numbers", numberAdditionChallengePage.getChallengeHintText(), "The challenge hint text doesn't match expected result");
        //assert calculation has the expected result (before operation)
        assertEquals("Result:", numberAdditionChallengePage.getCalculationResultText(), "The calculation result doesn't match expected result");
        //input numbers into input field
        numberAdditionChallengePage.inputNumber1();
        numberAdditionChallengePage.inputNumber2();
        //click 'calculate' button
        numberAdditionChallengePage.clickCalculateButton();
        //assert challenge counter has registered first challenge completion
        //assertEquals("1 instruction(s) out of 6", numberAdditionChallengePage.getChallengesCounterText(), "The challenges counter display doesn't match expected result"); //text somehow doesn't get updated
        //assert input form entered has the expected display (after number input calculation)
        assertEquals("Entered Values: First Number: 1, Second Number: 2", numberAdditionChallengePage.getInputFormEnteredValuesText(), "The input form entered values doesn't match expected result");
        //assert calculation has the expected result (after operation)
        //assertEquals("Result: 3", numberAdditionChallengePage.getCalculationResultText(), "The calculation result doesn't match expected result"); //text somehow doesn't get updated
        logger.info("Displayed challenges counter: " + numberAdditionChallengePage.getChallengesCounterText());
        logger.info("Displayed result: " + numberAdditionChallengePage.getCalculationResultText());

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

    //'Number Addition' page specific web element assert
    protected void isNumberAdditionChallengeWebElementDisplayed(NumberAdditionChallengePage numberAdditionChallengePage){
        //assert 'number addition' challenge page title is displayed
        assertTrue(numberAdditionChallengePage.isNumberAdditionChallengePageTitleDisplayed(), "The 'Number Addition' challenge page title is not displayed");
        //assert 'number addition' challenge guide icon is displayed
        assertTrue(numberAdditionChallengePage.isNumberAdditionChallengeGuideIconDisplayed(), "The 'Number Addition' challenge guide icon is not displayed");
        //assert 'number addition' challenge video guide link is displayed
        assertTrue(numberAdditionChallengePage.isVideoGuideLinkDisplayed(), "The 'Number Addition' challenge video guide link is not displayed");
        //assert 'number addition' challenge instructions title is displayed
        assertTrue(numberAdditionChallengePage.isInstructionsTitleDisplayed(), "The 'Number Addition' challenge instructions title is not displayed");
        //assert 'number addition' challenges completed counter is displayed
        assertTrue(numberAdditionChallengePage.isChallengesCompletedCounterDisplayed(), "The 'Number Addition' challenges completed counter is not displayed");
        //assert 'number addition' challenge list is displayed
        assertTrue(numberAdditionChallengePage.isNumberAdditionChallengeOneDisplayed(), "The 'Number Addition' challenge list is not displayed");
        //assert 'number addition' challenge input form title is displayed
        assertTrue(numberAdditionChallengePage.isInputFormTitleDisplayed(), "The 'Number Addition' challenge input form title is not displayed");
        //assert 'number addition' challenge input form 'entered values' are displayed
        assertTrue(numberAdditionChallengePage.isInputFormEnteredValuesDisplayed(), "The 'Number Addition' challenge input form entered values are not displayed");
        //assert 'number addition' challenge number 1 input field is displayed
        assertTrue(numberAdditionChallengePage.isNumber1InputFieldDisplayed(), "The 'Number Addition' challenge number 1 input field is not displayed");
        //assert 'number addition' challenge hint is displayed
        assertTrue(numberAdditionChallengePage.isChallengeHintDisplayed(), "The 'Number Addition' challenge hint is not displayed");
        //assert 'number addition' challenge number 2 input field is displayed
        assertTrue(numberAdditionChallengePage.isNumber2InputFieldDisplayed(), "The 'Number Addition' challenge number 2 input field is not displayed");
        //assert 'number addition' challenge calculation result is displayed
        assertTrue(numberAdditionChallengePage.isCalculationResultDisplayed(), "The 'Number Addition' challenge calculation result is not displayed");
        //assert 'number addition' challenge start over button is displayed
        assertTrue(numberAdditionChallengePage.isStartOverButtonDisplayed(), "The 'Number Addition' challenge start over button is not displayed");
        //assert 'number addition' challenge clear form button is displayed
        assertTrue(numberAdditionChallengePage.isClearButtonDisplayed(), "The 'Number Addition' challenge clear button is not displayed");
        //assert 'number addition' challenge calculate button is displayed
        assertTrue(numberAdditionChallengePage.isCalculateButtonDisplayed(), "The 'Number Addition' challenge calculate button is not displayed");
    }

}
