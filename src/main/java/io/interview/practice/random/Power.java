package io.interview.practice.random;

import java.util.Scanner;

public class Power {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int number= scanner.nextInt();
    System.out.println("Enter power");
    int power = scanner.nextInt();
    double result = Power.pow(number, power);
    System.out.println(result);
  }

  public static double pow(int number, int number2) {
    if (number2 == 1) {
      return number;
    } else {
      return number * pow(number, number2 - 1);
    }
  }

}
