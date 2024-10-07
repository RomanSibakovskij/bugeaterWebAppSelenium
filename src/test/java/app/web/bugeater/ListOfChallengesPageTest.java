package app.web.bugeater;

import org.junit.jupiter.api.*;

public class ListOfChallengesPageTest extends TestMethods{

    // Test 001 -> number addition challenge test (as a guest)
    @Test
    @DisplayName("Number Addition Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberAdditionChallengeTest(){
        navigateToNumberAdditionPageTest();
        IndividualChallengePage individualChallengePage = new IndividualChallengePage(driver);
        //challenge 1 test
        solveNumberAdditionChallenge1Test(individualChallengePage);
        //challenge 2 test
        solveNumberAdditionChallenge2Test(individualChallengePage);
        //challenge 3 test
        solveNumberAdditionChallenge3Test(individualChallengePage);
        //challenge 4 test
        solveNumberAdditionChallenge4Test(individualChallengePage);
        //challenge 5 test
        solveNumberAdditionChallenge5Test(individualChallengePage);
        //challenge 6 test
        solveNumberAdditionChallenge6Test(individualChallengePage);
    }

    //Test 002 -> number division challenge test (as a guest)
    @Test
    @DisplayName("Number Division Challenge Test (as a guest)")
    @Tag("Learn_Mode_Challenge_Test")
    void numberDivisionChallengeTest(){
        navigateToNumberDivisionPageTest();
        IndividualChallengePage individualChallengePage = new IndividualChallengePage(driver);
        //challenge 1 test
        solveNumberDivisionChallenge1Test(individualChallengePage);
        //challenge 2 test
        solveNumberDivisionChallenge2Test(individualChallengePage);
        //challenge 3 test
        solveNumberDivisionChallenge3Test(individualChallengePage);
    }
}
