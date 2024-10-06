package app.web.bugeater;

import org.openqa.selenium.*;
import java.util.Random;

public class TestDataGenerator extends BasePage{

    private static final int MIN = 1;
    private static final int MAX = 2500;

    // Generator instance
    private Random random;

    // Input numbers
    private int num1;
    private int num2;

    public TestDataGenerator(WebDriver driver) {
        super(driver);
    }

    // Generate random numbers
    public int generateRandomNumber1() {num1 = random.nextInt((MAX - MIN) + 1) + MIN; return num1;}
    public int generateRandomNumber2() {num2 = random.nextInt((MAX - MIN) + 1) + MIN; return num2;}

    // Getters
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }

}
