package app.web.bugeater;

import org.junit.jupiter.api.*;

public class ListOfChallengesPageTest extends TestMethods{

    // Test 001 -> number addition challenge test (as a guest)
    @Test
    @DisplayName("Number Addition Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberAdditionChallengeTest(){
        navigateToNumberAdditionPageTest();
        IndividualLearnModeChallengePage individualLearnModeChallengePage = new IndividualLearnModeChallengePage(driver);
        //challenge 1 test
        solveNumberAdditionChallenge1Test(individualLearnModeChallengePage);
        //challenge 2 test
        solveNumberAdditionChallenge2Test(individualLearnModeChallengePage);
        //challenge 3 test
        solveNumberAdditionChallenge3Test(individualLearnModeChallengePage);
        //challenge 4 test
        solveNumberAdditionChallenge4Test(individualLearnModeChallengePage);
        //challenge 5 test
        solveNumberAdditionChallenge5Test(individualLearnModeChallengePage);
        //challenge 6 test
        solveNumberAdditionChallenge6Test(individualLearnModeChallengePage);
    }

    //Test 002 -> number division challenge test (as a guest)
    @Test
    @DisplayName("Number Division Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberDivisionChallengeTest(){
        navigateToNumberDivisionPageTest();
        IndividualLearnModeChallengePage individualLearnModeChallengePage = new IndividualLearnModeChallengePage(driver);
        //challenge 1 test
        solveNumberDivisionChallenge1Test(individualLearnModeChallengePage);
        //challenge 2 test
        solveNumberDivisionChallenge2Test(individualLearnModeChallengePage);
        //challenge 3 test
        solveNumberDivisionChallenge3Test(individualLearnModeChallengePage);
        //challenge 4 test
        solveNumberDivisionChallenge4Test(individualLearnModeChallengePage);
        //challenge 5 test
        solveNumberDivisionChallenge5Test(individualLearnModeChallengePage);
        //challenge 6 test
        solveNumberDivisionChallenge6Test(individualLearnModeChallengePage);
    }
}
