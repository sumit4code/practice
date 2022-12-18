package io.interview.practice.random;

public class ReverseInteger {

  public int reverseInteger(int num) {
    if (num <= 9) {
      return num;
    }
    int result = 0;
    while (num != 0) {
      int reminder = num % 10;
      result = result * 10 + reminder;
      num = num / 10;
    }
    return result;
  }

  public static void main(String[] args) {
    ReverseInteger reverseInteger = new ReverseInteger();
    System.out.println(reverseInteger.reverseInteger(0));
    System.out.println(reverseInteger.reverseInteger(12));
    System.out.println(reverseInteger.reverseInteger(123));
    System.out.println(reverseInteger.reverseInteger(1234));
  }
}
