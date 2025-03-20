package testingil.webinar.tddai.s03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator_FirstTryTests {
    private Calculator_SecondTry calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator_SecondTry();
    }

    @Test
    public void testSingleDigitDisplay() {
        calculator.press("5");
        assertEquals("5", calculator.getDisplay());
    }
//
//    @Test
//    public void testAddition() {
//        calculator.press("2");
//        calculator.press("+");
//        calculator.press("3");
//        calculator.press("=");
//        assertEquals("5", calculator.getDisplay());
//    }
//
//    @Test
//    public void testDivision() {
//        calculator.press("6");
//        calculator.press("/");
//        calculator.press("2");
//        calculator.press("=");
//        assertEquals("3", calculator.getDisplay());
//    }
//
//    @Test
//    public void testDivideByZero() {
//        calculator.press("8");
//        calculator.press("/");
//        calculator.press("0");
//        calculator.press("=");
//        assertEquals("E", calculator.getDisplay());
//    }
//
//    @Test
//    public void testDisplayExceedsFiveCharacters() {
//        calculator.press("1");
//        calculator.press("+");
//        calculator.press("2");
//        calculator.press("+");
//        calculator.press("3");
//        calculator.press("=");
//        assertEquals("E", calculator.getDisplay());
//    }
//
//    @Test
//    public void testConsecutiveOperators() {
//        calculator.press("4");
//        calculator.press("+");
//        calculator.press("+");
//        calculator.press("5");
//        calculator.press("=");
//        assertEquals("E", calculator.getDisplay());
//    }
//
//    @Test
//    public void testImmediateEquals() {
//        calculator.press("=");
//        assertEquals("E", calculator.getDisplay());
//    }
//
//    @Test
//    public void testOperatorWithoutSecondOperand() {
//        calculator.press("4");
//        calculator.press("+");
//        calculator.press("=");
//        assertEquals("E", calculator.getDisplay());
//    }
}



