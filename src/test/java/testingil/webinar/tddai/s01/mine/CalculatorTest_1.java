package testingil.webinar.tddai.s01.mine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testingil.webinar.tddai.s01.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest_1 {

    // my changes:
    // fix failing test
    // common setup
    // names
    // assertThat instead of assertEquals
    // remove bad test
    // add tests

    private Calculator display;

    @BeforeEach
    public void setUp() {
        display = new Calculator();
    }

    @Test
    void onStart_display_zero() {
        assertThat(display.getDisplay()).isEqualTo("0");
    }

    @Test
    void on_pressing_key_display_it() {
        display.press("5");
        assertThat(display.getDisplay()).isEqualTo( "5");
    }

    @Test
    void on_pressing_multiple_keys_display_all() {
        display.press("1");
        display.press("2");
        display.press("3");
        assertThat(display.getDisplay()).isEqualTo( "123");
    }

    @Test
    void on_screen_size_overflow_display_error() {
        display.press("1");
        display.press("2");
        display.press("3");
        display.press("4");
        display.press("5");
        display.press("6");
        assertThat(display.getDisplay()).isEqualTo( "E");
    }

    @Test
    void on_addition_and_equal_display_result() {
        display.press("2");
        display.press("+");
        display.press("3");
        display.press("=");
        assertThat(display.getDisplay()).isEqualTo("5");
    }

    @Test
    void on_division_by_zero_display_error() {
        display.press("6");
        display.press("/");
        display.press("0");
        display.press("=");
        assertThat(display.getDisplay()).isEqualTo( "E");
    }

    // bad test that's passing -> remove
//    @Test
//    void resetsDisplayAfterOperation() {
//        display.press("2");
//        display.press("+");
//        display.press("3");
//        display.press("=");
//        display.press("4");
//        assertThat("4").isEqualTo( display.getDisplay());
//    }

    // other tests I would like
    // but were not generated
    @Test
    void on_pressing_a_digit_and_operation_display_doesnt_change() {
        display.press("4");
        display.press("+");
        assertThat(display.getDisplay()).isEqualTo( "4");
    }

    @Test
    void on_pressing_operation_after_zero_display_one_zero() {
        display.press("0");
        display.press("+");
        assertThat(display.getDisplay()).isEqualTo( "0");
    }

    @Test
    void on_presssing_digit_after_operation_display_shows_digit() {
        display.press("1");
        display.press("+");
        display.press("3");
        assertThat(display.getDisplay()).isEqualTo( "3");
    }
    @Test
    void on_pressing_operation_after_digit_display_shows_last_digit() {
        display.press("1");
        display.press("+");
        display.press("2");
        display.press("+");
        assertThat(display.getDisplay()).isEqualTo( "2");
    }

}