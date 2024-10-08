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
        //challenge 4 test
        solveNumberAdditionChallenge4Test(learnModeNumAddDivisionChallengePage);
        //challenge 5 test
        solveNumberAdditionChallenge5Test(learnModeNumAddDivisionChallengePage);
        //challenge 6 test
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
        //challenge 4 test
        solveNumberDivisionChallenge4Test(learnModeNumAddDivisionChallengePage);
        //challenge 5 test
        solveNumberDivisionChallenge5Test(learnModeNumAddDivisionChallengePage);
        //challenge 6 test
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
        //challenge 2 test
        solvePasswordRestoreChallenge2Test(learnModePasswordChallengePage);
        //challenge 3 test
        solvePasswordRestoreChallenge3Test(learnModePasswordChallengePage);
    }
}
