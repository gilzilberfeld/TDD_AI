package testingil.webinar.tddai.s01.generated1;

import org.junit.jupiter.api.Test;
import testingil.webinar.tddai.s01.Calculator;

import static org.junit.jupiter.api.Assertions.*;

// Prompt: "generate tests for the class, but make sure they pass"
class CalculatorTest_2 {

    @Test
    void displaysZeroInitially() {
        Calculator display = new Calculator();
        assertEquals("0", display.getDisplay());
    }

    @Test
    void displaysSingleDigit() {
        Calculator display = new Calculator();
        display.press("5");
        assertEquals("5", display.getDisplay());
    }

    @Test
    void displaysMultipleDigits() {
        Calculator display = new Calculator();
        display.press("1");
        display.press("2");
        display.press("3");
        assertEquals("123", display.getDisplay());
    }

    @Test
    void displaysErrorOnOverflow() {
        Calculator display = new Calculator();
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
        Calculator display = new Calculator();
        display.press("2");
        display.press("+");
        display.press("3");
        display.press("=");
        assertEquals("5", display.getDisplay());
    }

    @Test
    void displaysErrorOnDivisionByZero() {
        Calculator display = new Calculator();
        display.press("6");
        display.press("/");
        display.press("0");
        display.press("=");
        assertEquals("Division By Zero Error", display.getDisplay());
    }

    @Test
    void resetsDisplayAfterOperation() {
        Calculator display = new Calculator();
        display.press("2");
        display.press("+");
        display.press("3");
        display.press("=");
        display.press("4");
        assertEquals("4", display.getDisplay());
    }

    @Test
    void performsSubtraction() {
        Calculator display = new Calculator();
        display.press("5");
        display.press("-");
        display.press("3");
        display.press("=");
        assertEquals("2", display.getDisplay());
    }

    @Test
    void performsMultiplication() {
        Calculator display = new Calculator();
        display.press("4");
        display.press("*");
        display.press("3");
        display.press("=");
        assertEquals("12", display.getDisplay());
    }

    @Test
    void clearsDisplay() {
        Calculator display = new Calculator();
        display.press("5");
        display.press("C");
        assertEquals("0", display.getDisplay());
    }
}