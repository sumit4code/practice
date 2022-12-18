package io.interview.practice.random;

import java.util.Scanner;

public class FibonacciSeries {

  private int fibonacciNumber(int num) {
    if (num == 1 || num == 0) {
      return num;
    } else {
      return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
    }
  }

  public static void main(String[] args) {
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter position");
    int number = scanner.nextInt();
    System.out.println(fibonacciSeries.fibonacciNumber(number));
  }
}
