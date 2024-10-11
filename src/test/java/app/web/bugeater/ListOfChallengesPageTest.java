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
    }
}
