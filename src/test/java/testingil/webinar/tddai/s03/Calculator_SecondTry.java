package testingil.webinar.tddai.s03;

// prompt: Generate the code for the Calculator class, based on the first test
// testSingleDigitDisplay in testingil.webinar.tddai.s03.CalculatorTests
public class Calculator_SecondTry {
    private String display;

    public Calculator_SecondTry() {
        display = "0";
    }

    public void press(String key) {
        // This looks weird, but the test passes
        if (key.matches("\\d")) {
            display = key;
        }
    }

    public String getDisplay() {
        return display;
    }
}