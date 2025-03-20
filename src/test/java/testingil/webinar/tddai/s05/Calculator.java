package testingil.webinar.tddai.s05;

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