package de.spiller.basics;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FactorialCalculatorTest {

  @Test
  public void factorial() throws Exception {
    FactorialCalculator calculator = new FactorialCalculator();
    assertThat(calculator.factorial(0L), is(1L));
    assertThat(calculator.factorial(1), is(1L));
    assertThat(calculator.factorial(2), is(2L));
    assertThat(calculator.factorial(3), is(6L));
    assertThat(calculator.factorial(6), is(720L));
  }
}
