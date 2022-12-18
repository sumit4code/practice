package io.interview.practice.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    usingScanner();
    try {
      usingBufferReader();
    }catch (IOException e){
      System.out.println("sumit" );
    }
  }

  private static void usingScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int data = scanner.nextInt();
    System.out.println("Enter second number");
    int number2 = scanner.nextInt();
    System.out.println("Number1 = " + data + " \nNumber2 = " + number2);

    System.out.println("Enter a string");
    String st1 = scanner.next();
    scanner.nextLine();
    System.out.println("First String " + st1);
    System.out.println("Enter a line");
    scanner.reset();
    String line = scanner.nextLine();
    System.out.println("Line " + line);
  }

  private static void usingBufferReader() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter an integer");
    int a = bufferedReader.read();
    System.out.println("Enter another integer");
    int b = bufferedReader.read();
    System.out.println("a=" + a + "b=" + b);

  }
}
