package io.interview.practice.random;

public class Factorial {

  private long factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return (long) n * factorial(n - 1);
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    System.out.println(factorial.factorial(5) == 120L);
  }

}
