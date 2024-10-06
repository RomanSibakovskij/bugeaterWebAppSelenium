package app.web.bugeater;

import org.junit.jupiter.api.*;

public class ListOfChallengesPageTest extends TestMethods{

    // Test 001 -> number addition challenge test (as a guest)
    @Test
    @DisplayName("Number Addition Challenge Test (as a guest)")
    @Tag("Challenge_Test")
    void numberAdditionChallengeTest(){
        navigateToNumberAdditionPageTest();
        NumberAdditionChallengePage numberAdditionChallengePage = new NumberAdditionChallengePage(driver);
        solveNumberAdditionChallenge1Test(numberAdditionChallengePage);
    }
}
