package de.spiller.basics;

public class FactorialCalculator {

  public long factorial(long input) {
    if (input <= 1) {
      return 1;
    }
    return input * factorial(input - 1);
  }

}
