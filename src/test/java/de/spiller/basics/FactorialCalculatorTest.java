package de.spiller.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

class FactorialCalculatorTest {

    @Test
    @DisplayName("this should be a meaningful description")
    void factorial() {

        FactorialCalculator calculator = new FactorialCalculator();

        assertThat(calculator.factorial(0L)).isEqualTo(1L);

        assertAll("all remaining tests",
                () -> assertThat(calculator.factorial(1)).isEqualTo(1L),
                () -> assertThat(calculator.factorial(2)).isEqualTo(2L),
                () -> assertThat(calculator.factorial(3)).isEqualTo(6L),
                () -> assertThat(calculator.factorial(6)).isEqualTo(720L)
        );
    }
}