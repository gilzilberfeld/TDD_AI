package testingil.webinar.tddai.s04;

// prompt: Generate the code for the Calculator class, based on the first test
// testSingleDigitDisplay in testingil.webinar.tddai.s04.Calculator_Tests
public class Calculator {
    private String display;

    public Calculator() {
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