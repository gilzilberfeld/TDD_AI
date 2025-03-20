package testingil.webinar.tddai.s03;


// Prompt: Generate the code for the Calculator class, based on the tests in
// testingil.webinar.tddai.s03.Calculator_FirstTryTests

public class Calculator_FirstTry {
    private StringBuilder display;
    private int firstOperand;
    private int secondOperand;
    private String operator;
    private boolean isSecondOperand;

    public Calculator_FirstTry() {
        display = new StringBuilder("0");
        firstOperand = 0;
        secondOperand = 0;
        operator = "";
        isSecondOperand = false;
    }

    public void press(String key) {
        if (key.matches("\\d")) {
            if (display.length() == 1 && display.charAt(0) == '0') {
                display.setLength(0);
            }
            if (display.length() < 5) {
                display.append(key);
            } else {
                display.setLength(0);
                display.append("E");
            }
        } else if (key.equals("+") || key.equals("/")) {
            firstOperand = Integer.parseInt(display.toString());
            operator = key;
            isSecondOperand = true;
            display.setLength(0);
        } else if (key.equals("=")) {
            if (isSecondOperand) {
                secondOperand = Integer.parseInt(display.toString());
                if (operator.equals("+")) {
                    display.setLength(0);
                    display.append(firstOperand + secondOperand);
                } else if (operator.equals("/")) {
                    if (secondOperand == 0) {
                        display.setLength(0);
                        display.append("E");
                    } else {
                        display.setLength(0);
                        display.append(firstOperand / secondOperand);
                    }
                }
                if (display.length() > 5) {
                    display.setLength(0);
                    display.append("E");
                }
            } else {
                display.setLength(0);
                display.append("E");
            }
        }
    }

    public String getDisplay() {
        return display.toString();
    }
}