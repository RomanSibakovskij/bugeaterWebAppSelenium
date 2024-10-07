package app.web.bugeater;

import org.junit.jupiter.api.*;

public class ListOfChallengesPageTest extends TestMethods{

    // Test 001 -> number addition challenge test (as a guest)
    @Test
    @DisplayName("Number Addition Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberAdditionChallengeTest(){
        navigateToNumberAdditionPageTest();
        NumberAdditionChallengePage numberAdditionChallengePage = new NumberAdditionChallengePage(driver);
        //challenge 1 test
        solveNumberAdditionChallenge1Test(numberAdditionChallengePage);
        //challenge 2 test
        solveNumberAdditionChallenge2Test(numberAdditionChallengePage);
        //challenge 3 test
        solveNumberAdditionChallenge3Test(numberAdditionChallengePage);
        //challenge 4 test
        solveNumberAdditionChallenge4Test(numberAdditionChallengePage);
        //challenge 5 test
        solveNumberAdditionChallenge5Test(numberAdditionChallengePage);
        //challenge 6 test
        solveNumberAdditionChallenge6Test(numberAdditionChallengePage);
    }

    //Test 002 -> number division challenge test (as a guest)
    @Test
    @DisplayName("Number Division Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberDivisionChallengeTest(){
        navigateToNumberDivisionPageTest();
    }
}
