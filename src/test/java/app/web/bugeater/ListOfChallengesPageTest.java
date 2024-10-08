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
}
