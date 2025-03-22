package testingil.webinar.tddai.s06;

// 1st prompt: Generate the code in the testingil.webinar.tddai.s06.Calculator to
//          pass the two tests in testingil.webinar.tddai.s06.Calculator_Tests


// 2nd Prompt: Generate the code in the testingil.webinar.tddai.s06.Calculator to
//              pass the two tests in testingil.webinar.tddai.s06.Calculator_Tests.
//              Do not generate code that is required to pass the tests.
//              Same result
public class Calculator {
    private String display;
    private int firstOperand;
    private int secondOperand;
    private String operator;
    private boolean isSecondOperand;

    public Calculator() {
        display = "0";
        firstOperand = 0;
        secondOperand = 0;
        operator = "";
        isSecondOperand = false;
    }

    public void press(String key) {
        if (key.matches("\\d")) {
            // This bit is suspiciously similar to other examples
            if (display.equals("0")) {
                display = key;
            } else {
                display += key;
            }
        } else if (key.equals("+")) {
            firstOperand = Integer.parseInt(display);
            operator = key;
            isSecondOperand = true;
            display = "";
        } else if (key.equals("=")) {
            if (isSecondOperand) {
                secondOperand = Integer.parseInt(display);
                if (operator.equals("+")) {
                    display = String.valueOf(firstOperand + secondOperand);
                }
            }
        }
    }

    public String getDisplay() {
        return display;
    }
}