package testingil.webinar.tddai.s03;

// prompt: Generate the code for the Calculator class, based on the first test testSingleDigitDisplay in testingil.webinar.tddai.s03.CalculatorTests
public class Calculator {
    private String display;

    public Calculator() {
        display = "0";
    }

    public void press(String key) {
        if (key.matches("\\d")) {
            display = key;
        }
    }

    public String getDisplay() {
        return display;
    }
}