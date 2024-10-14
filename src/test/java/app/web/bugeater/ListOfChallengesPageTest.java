package app.web.bugeater;

import org.junit.jupiter.api.*;

public class ListOfChallengesPageTest extends TestMethods{

    // Test 001 -> number addition challenge test (as a guest)
    @Test
    @DisplayName("Number Addition Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberAdditionChallengeTest(){
        navigateToNumberAdditionPageTest();
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //challenge 1 test
        solveNumberAdditionChallenge1Test(learnModeNumAddDivisionChallengePage);
        //challenge 2 test
        solveNumberAdditionChallenge2Test(learnModeNumAddDivisionChallengePage);
        //challenge 3 test
        solveNumberAdditionChallenge3Test(learnModeNumAddDivisionChallengePage);
        //challenge 4 test (invalid user input error scenario)
        solveNumberAdditionChallenge4Test(learnModeNumAddDivisionChallengePage);
        //challenge 5 test (invalid user input error scenario)
        solveNumberAdditionChallenge5Test(learnModeNumAddDivisionChallengePage);
        //challenge 6 test (application error scenario)
        solveNumberAdditionChallenge6Test(learnModeNumAddDivisionChallengePage);
    }

    //Test 002 -> number division challenge test (as a guest)
    @Test
    @DisplayName("Number Division Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberDivisionChallengeTest(){
        navigateToNumberDivisionPageTest();
        LearnModeNumAddDivisionChallengePage learnModeNumAddDivisionChallengePage = new LearnModeNumAddDivisionChallengePage(driver);
        //challenge 1 test
        solveNumberDivisionChallenge1Test(learnModeNumAddDivisionChallengePage);
        //challenge 2 test
        solveNumberDivisionChallenge2Test(learnModeNumAddDivisionChallengePage);
        //challenge 3 test
        solveNumberDivisionChallenge3Test(learnModeNumAddDivisionChallengePage);
        //challenge 4 test (invalid user input error scenario)
        solveNumberDivisionChallenge4Test(learnModeNumAddDivisionChallengePage);
        //challenge 5 test (invalid user input error scenario)
        solveNumberDivisionChallenge5Test(learnModeNumAddDivisionChallengePage);
        //challenge 6 test (division by zero scenario)
        solveNumberDivisionChallenge6Test(learnModeNumAddDivisionChallengePage);
    }

    // Test 003 -> password restore challenge test (as a guest)
    @Test
    @DisplayName("Password Restore Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void passwordRestoreChallengeTest(){
        navigateToPasswordRestorePageTest();
        LearnModePasswordChallengePage learnModePasswordChallengePage = new LearnModePasswordChallengePage(driver);
        //challenge 1 test
        solvePasswordRestoreChallenge1Test(learnModePasswordChallengePage);
        //challenge 2 test (invalid password input - doesn't meet password requirements)
        solvePasswordRestoreChallenge2Test(learnModePasswordChallengePage);
        //challenge 3 test (invalid password input - pre-existing in database)
        solvePasswordRestoreChallenge3Test(learnModePasswordChallengePage);
        //challenge 4 test (no password input)
        solvePasswordRestoreChallenge4Test(learnModePasswordChallengePage);
        //challenge 5 test (invalid password input - too short)
        solvePasswordRestoreChallenge5Test(learnModePasswordChallengePage);
        //challenge 6 test (invalid password input - too long)
        solvePasswordRestoreChallenge6Test(learnModePasswordChallengePage);
        //challenge 7 test (invalid password input - uppercase only)
        solvePasswordRestoreChallenge7Test(learnModePasswordChallengePage);
        //challenge 8 test (invalid password input - lowercase only)
        solvePasswordRestoreChallenge8Test(learnModePasswordChallengePage);
        //challenge 9 test (invalid password input - digits only)
        solvePasswordRestoreChallenge9Test(learnModePasswordChallengePage);
        //challenge 10 test (invalid password input - special symbols only)
        solvePasswordRestoreChallenge10Test(learnModePasswordChallengePage);
        //challenge 11 test (invalid password input - not-allowed symbols only)
        solvePasswordRestoreChallenge11Test(learnModePasswordChallengePage);
    }

    // Test 004 -> update profile challenge test (as a guest)
    @Test
    @DisplayName("Update Profile Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void updateProfileChallengeTest(){
        navigateToUpdateProfilePageTest();
        LearnModeUpdateProfilePage learnModeUpdateProfilePage = new LearnModeUpdateProfilePage(driver);
        //challenge 1 test
        solveUpdateProfileChallenge1Test(learnModeUpdateProfilePage);
        //challenge 2 test (inputs shorter than the limit scenario)
        solveUpdateProfileChallenge2Test(learnModeUpdateProfilePage);
        //challenge 3 test (inputs longer than the limit scenario)
        solveUpdateProfileChallenge3Test(learnModeUpdateProfilePage);
        //challenge 4 test (empty inputs scenario)
        solveUpdateProfileChallenge4Test(learnModeUpdateProfilePage);
        //challenge 5 test (non-allowed characters input scenario)
        solveUpdateProfileChallenge5Test(learnModeUpdateProfilePage);
        //challenge 6 test (non-allowed (nickname only) characters input scenario)
        solveUpdateProfileChallenge6Test(learnModeUpdateProfilePage);
    }

    // Test 005 -> number multiplication challenge test (as a guest)
    @Test
    @DisplayName("Number Multiplication Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberMultiplicationChallengeTest(){
        navigateToNumberMultiplicationPageTest();
        LearnModeNumMultiplicationPage learnModeNumMultiplicationPage = new LearnModeNumMultiplicationPage(driver);
        //challenge 1 test
        solveNumberMultiplicationChallenge1Test(learnModeNumMultiplicationPage);
        //challenge 2 test (invalid option choice - test case menu one option as a string)
        solveNumberMultiplicationChallenge2Test(learnModeNumMultiplicationPage);
        //challenge 3 test (invalid option choice - both test case menu options as 'Empty value')
        solveNumberMultiplicationChallenge3Test(learnModeNumMultiplicationPage);
        //challenge 4 test (both test case menu options as '2.5')
        solveNumberMultiplicationChallenge4Test(learnModeNumMultiplicationPage);
        //challenge 5 test (test case 2 menu option as '-1')
        solveNumberMultiplicationChallenge5Test(learnModeNumMultiplicationPage);
        //challenge 6 test (test case 1 menu option as '10000000000')
        solveNumberMultiplicationChallenge6Test(learnModeNumMultiplicationPage);
    }

    //Test 006 -> scripted testing number multiplication test case validation test (as a guest)
    @Test
    @DisplayName("Number Multiplication Test Case Validation Challenge Test (as a guest)")
    @Tag("Scripted_Testing_Challenge_Test")
    void scriptedTestingNumberMultiplicationTCValidationChallengeTest(){
        navigateToNumberMultiplicationTCValidationPageTest();
        ScriptedTestingNumMultiplicationValidationChallengePage scriptedTestingNumMultiplicationValidationChallengePage = new ScriptedTestingNumMultiplicationValidationChallengePage(driver);
        //test case validation challenge 1 test (invalid tc validation - both inputs are empty)
        solveNumberMultiplicationTCValidationChallenge1Test(scriptedTestingNumMultiplicationValidationChallengePage);
        //test case validation challenge 2 test (invalid tc validation - number 1 as String)
        solveNumberMultiplicationTCValidationChallenge2Test(scriptedTestingNumMultiplicationValidationChallengePage);
        //test case validation challenge 3 test (valid tc validation)
        solveNumberMultiplicationTCValidationChallenge3Test(scriptedTestingNumMultiplicationValidationChallengePage);
        //test case validation challenge 4 test (invalid tc validation - number 1 as '10000000000')
        solveNumberMultiplicationTCValidationChallenge4Test(scriptedTestingNumMultiplicationValidationChallengePage);
        //test case validation challenge 5 test (valid tc validation)
        solveNumberMultiplicationTCValidationChallenge5Test(scriptedTestingNumMultiplicationValidationChallengePage);
        //test case validation challenge 6 test (valid tc validation)
        solveNumberMultiplicationTCValidationChallenge6Test(scriptedTestingNumMultiplicationValidationChallengePage);
    }

    //Test 007 -> scripted testing number division test case validation test (as a guest)
    @Test
    @DisplayName("Number Division Test Case Validation Challenge Test (as a guest)")
    @Tag("Scripted_Testing_Challenge_Test")
    void scriptedTestingNumberDivisionTCValidationChallengeTest(){
        navigateToNumberDivisionTCValidationPageTest();
        ScriptedTestingNumDivisionValidationChallengePage scriptedTestingNumDivisionValidationChallengePage = new ScriptedTestingNumDivisionValidationChallengePage(driver);
        //test case validation challenge 1 test (valid tc validation)
        solveNumberDivisionTCValidationChallenge1Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 2 test (valid tc validation)
        solveNumberDivisionTCValidationChallenge2Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 3 test (valid tc validation)
        solveNumberDivisionTCValidationChallenge3Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 4 test (valid tc validation - number 1 as '10000000000')
        solveNumberDivisionTCValidationChallenge4Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 5 test (invalid tc validation - number 1 as String)
        solveNumberDivisionTCValidationChallenge5Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 6 test (invalid tc validation - both inputs are blank)
        solveNumberDivisionTCValidationChallenge6Test(scriptedTestingNumDivisionValidationChallengePage);
        //test case validation challenge 7 test (invalid tc validation - division by zero)
        solveNumberDivisionTCValidationChallenge7Test(scriptedTestingNumDivisionValidationChallengePage);
    }

    //Test 008 -> scripted testing password test case validation test (as a guest)
    @Test
    @DisplayName("Password Test Case Validation Challenge Test (as a guest)")
    @Tag("Scripted_Testing_Challenge_Test")
    void scriptedTestingPasswordTCValidationChallengeTest(){
        navigateToPasswordTCValidationPageTest();
        ScriptedTestingPasswordTCValidationChallengePage scriptedTestingPasswordTCValidationChallengePage = new ScriptedTestingPasswordTCValidationChallengePage(driver);
        //test case validation challenge 1 test (invalid tc validation - uppercase only)
        solvePasswordTCValidationChallenge1Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 2 test (invalid tc validation - numbers only)
        solvePasswordTCValidationChallenge2Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 3 test (invalid tc validation - special symbols only)
        solvePasswordTCValidationChallenge3Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 4 test (invalid tc validation - existing password)
        solvePasswordTCValidationChallenge4Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 5 test (invalid tc validation - empty input)
        solvePasswordTCValidationChallenge5Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 6 test (invalid tc validation - too short password)
        solvePasswordTCValidationChallenge6Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 7 test (invalid tc validation - too long password)
        solvePasswordTCValidationChallenge7Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 8 test (valid tc validation)
        solvePasswordTCValidationChallenge8Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 9 test (invalid tc validation - non-allowed symbols)
        solvePasswordTCValidationChallenge9Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 10 test (invalid tc validation - lowercase only)
        solvePasswordTCValidationChallenge10Test(scriptedTestingPasswordTCValidationChallengePage);
        //test case validation challenge 11 test (invalid tc validation - password doesn't meet requirements)
        solvePasswordTCValidationChallenge11Test(scriptedTestingPasswordTCValidationChallengePage);
    }

    //Test 009 -> scripted testing create profile test case validation test (as a guest)
    @Test
    @DisplayName("Create Profile Test Case Validation Challenge Test (as a guest)")
    @Tag("Scripted_Testing_Challenge_Test")
    void scriptedTestingCreateProfileTCValidationChallengeTest(){
        navigateToCreateProfileTCValidationPageTest();
        ScriptedTestingCreateProfileTCValidationChallengePage scriptedTestingChangeProfileTCValidationChallengePage = new ScriptedTestingCreateProfileTCValidationChallengePage(driver);
        //test case validation challenge 1 test (valid tc validation)
        solveCreateProfileTCValidationChallenge1Test(scriptedTestingChangeProfileTCValidationChallengePage);
        //test case validation challenge 2 test (invalid tc validation - nickname too short)
        solveCreateProfileTCValidationChallenge2Test(scriptedTestingChangeProfileTCValidationChallengePage);
        //test case validation challenge 3 test (invalid tc validation - nickname too long)
        solveCreateProfileTCValidationChallenge3Test(scriptedTestingChangeProfileTCValidationChallengePage);
        //test case validation challenge 4 test (invalid tc validation - empty nickname/last name input)
        solveCreateProfileTCValidationChallenge4Test(scriptedTestingChangeProfileTCValidationChallengePage);
        //test case validation challenge 5 test (invalid tc validation - nickname contains special symbols only)
        solveCreateProfileTCValidationChallenge5Test(scriptedTestingChangeProfileTCValidationChallengePage);
        //test case validation challenge 6 test (invalid tc validation - birth year outside of test case requirements)
        solveCreateProfileTCValidationChallenge6Test(scriptedTestingChangeProfileTCValidationChallengePage);
    }

    //Test 010 -> scripted testing currency converter test case validation test (as a guest)
    @Test
    @DisplayName("Currency Converter Test Case Validation Challenge Test (as a guest)")
    @Tag("Scripted_Testing_Challenge_Test")
    void scriptedTestingCurrencyConverterTCValidationChallengeTest(){
        navigateToCurrencyConverterTCValidationPageTest();
        ScriptedTestingCurrencyConverterValidationChallengePage scriptedTestingCurrencyConverterValidationChallengePage = new ScriptedTestingCurrencyConverterValidationChallengePage(driver);
        //test case validation challenge 1 test (valid tc validation - from USD to EUR)
        solveCurrencyConverterTCValidationChallenge1Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 2 test (valid tc validation - from USD to EUR)
        solveCurrencyConverterTCValidationChallenge2Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 3 test (valid tc validation - from GBP to GBP)
        solveCurrencyConverterTCValidationChallenge3Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 4 test (valid tc validation - from USD to EUR (too large input))
        solveCurrencyConverterTCValidationChallenge4Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 5 test (valid tc validation - from USD to EUR (0 as value input))
        solveCurrencyConverterTCValidationChallenge5Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 6 test (invalid tc validation - from USD to EUR (empty input))
        solveCurrencyConverterTCValidationChallenge6Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 7 test (invalid tc validation - from USD to EUR (-500 as value input))
        solveCurrencyConverterTCValidationChallenge7Test(scriptedTestingCurrencyConverterValidationChallengePage);
        //test case validation challenge 8 test (invalid tc validation - from USD to EUR ("abc" as value input))
        solveCurrencyConverterTCValidationChallenge8Test(scriptedTestingCurrencyConverterValidationChallengePage);
    }

    //Test 011 -> test case generator number summation test case validation test (as a guest)
    @Test
    @DisplayName("Number Summation Test Case Validation Challenge Test (as a guest)")
    @Tag("Test_Case_Generator_Challenge_Test")
    void tcgNumberSummationTCBuildAndFoundChallengeTest(){
        navigateToNumberSummationTCBuildPageTest();
        TCGNumSummationTCValidationChallengePage tcgNumSummationTCValidationChallengePage = new TCGNumSummationTCValidationChallengePage(driver);
        //number summation test case build challenge 1 (valid tc validation)
        solveNumberSummationTCBuildAndFoundChallenge1Test(tcgNumSummationTCValidationChallengePage);
        //number summation test case build challenge 2 (valid tc validation)
        solveNumberSummationTCBuildAndFoundChallenge2Test(tcgNumSummationTCValidationChallengePage);
        //number summation test case build challenge 3 (valid tc validation)
        solveNumberSummationTCBuildAndFoundChallenge3Test(tcgNumSummationTCValidationChallengePage);
        //number summation test case build challenge 4 (invalid tc validation - both inputs as strings)
        solveNumberSummationTCBuildAndFoundChallenge4Test(tcgNumSummationTCValidationChallengePage);
        //number summation test case build challenge 5 (invalid tc validation - number 2 as 'Empty value')
        solveNumberSummationTCBuildAndFoundChallenge5Test(tcgNumSummationTCValidationChallengePage);
        //number summation test case build challenge 6 (invalid tc validation - number 1 as '10000000000')
        solveNumberSummationTCBuildAndFoundChallenge6Test(tcgNumSummationTCValidationChallengePage);
    }

    //Test 012 -> exploratory testing calculator test case validation challenge test (as a guest)
    @Test
    @DisplayName("Calculator Test Case Validation Challenge Test (as a guest)")
    @Tag("Exploratory_Testing_Challenge_Test")
    void exploratoryTestingCalculatorTCValidationChallengeTest(){
        navigateToExploratoryTestingCalculatorTCValidationPageTest();
        ExploratoryTestingCalculatorChallengePage exploratoryTestingCalculatorChallengePage = new ExploratoryTestingCalculatorChallengePage(driver);
        //calculator test case validation challenge 1 (invalid tc validation - both inputs are blank)
        solveCalculatorTCValidationChallenge1Test(exploratoryTestingCalculatorChallengePage);
        //calculator test case validation challenge 2 (invalid tc validation - number 1 is a string)
        solveCalculatorTCValidationChallenge2Test(exploratoryTestingCalculatorChallengePage);
        //calculator test case validation challenge 3 (valid tc validation)
        solveCalculatorTCValidationChallenge3Test(exploratoryTestingCalculatorChallengePage);
        //calculator test case validation challenge 4 (invalid tc validation - number 1 exceeds max input limit)
        solveCalculatorTCValidationChallenge4Test(exploratoryTestingCalculatorChallengePage);
        //calculator test case validation challenge 5 (valid tc validation)
        solveCalculatorTCValidationChallenge5Test(exploratoryTestingCalculatorChallengePage);
        //calculator test case validation challenge 6 (valid tc validation)
        solveCalculatorTCValidationChallenge6Test(exploratoryTestingCalculatorChallengePage);
    }

    //Test 013 -> exploratory testing restore password test case validation challenge test (as a guest)
    @Test
    @DisplayName("Restore Password Test Case Validation Challenge Test (as a guest)")
    @Tag("Exploratory_Testing_Challenge_Test")
    void exploratoryTestingRestorePasswordTCValidationChallengeTest(){
        navigateToExploratoryTestingRestorePasswordTCValidationPageTest();
        ExploratoryTestingRestorePasswordChallengePage exploratoryTestingRestorePasswordChallengePage = new ExploratoryTestingRestorePasswordChallengePage(driver);
        //restore password test case validation challenge 1
        solveRestorePasswordTCValidationChallenge1Test(exploratoryTestingRestorePasswordChallengePage);
    }
}
