package testingil.webinar.tddai.s06;

// prompt: refactor the testingil.webinar.tddai.s06.Calculator
// class to have switch-case structure

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
        switch (key) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (display.equals("0")) {
                    display = key;
                } else {
                    display += key;
                }
                break;
            case "+":
                firstOperand = Integer.parseInt(display);
                operator = key;
                isSecondOperand = true;
                display = "";
                break;
            case "=":
                if (isSecondOperand) {
                    secondOperand = Integer.parseInt(display);
                    switch (operator) {
                        case "+":
                            display = String.valueOf(firstOperand + secondOperand);
                            break;
                        // Add more cases for other operators if needed
                    }
                }
                break;
            // Add more cases for other keys if needed
        }
    }

    public String getDisplay() {
        return display;
    }
}