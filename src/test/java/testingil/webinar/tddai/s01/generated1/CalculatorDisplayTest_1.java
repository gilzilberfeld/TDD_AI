package testingil.webinar.tddai.s01.generated1;

import org.junit.jupiter.api.Test;
import testingil.webinar.tddai.s01.CalculatorDisplay;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDisplayTest_1 {

    // generated right-click on class -> generate test, no prompt
    @Test
    void displaysZeroInitially() {
        CalculatorDisplay display = new CalculatorDisplay();
        assertEquals("0", display.getDisplay());
    }

    @Test
    void displaysSingleDigit() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("5");
        assertEquals("5", display.getDisplay());
    }

    @Test
    void displaysMultipleDigits() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("1");
        display.press("2");
        display.press("3");
        assertEquals("123", display.getDisplay());
    }

    @Test
    void displaysErrorOnOverflow() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("1");
        display.press("2");
        display.press("3");
        display.press("4");
        display.press("5");
        display.press("6");
        assertEquals("E", display.getDisplay());
    }

    @Test
    void performsAddition() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("2");
        display.press("+");
        display.press("3");
        display.press("=");
        assertEquals("5", display.getDisplay());
    }

    @Test
    void displaysErrorOnDivisionByZero() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("6");
        display.press("/");
        display.press("0");
        display.press("=");
        assertEquals("Division By Zero Error", display.getDisplay());
    }

    @Test
    void resetsDisplayAfterOperation() {
        CalculatorDisplay display = new CalculatorDisplay();
        display.press("2");
        display.press("+");
        display.press("3");
        display.press("=");
        display.press("4");
        assertEquals("4", display.getDisplay());
    }
}