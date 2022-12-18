package io.interview.practice.stack;

public class StackMain {

  public static void main(String[] args) {
    Stack<Integer> integerStack = new IntegerStack(5);

    integerStack.push(1);
    integerStack.push(2);
    integerStack.push(3);
    integerStack.push(4);
    integerStack.push(5);
    try {
      integerStack.push(6);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Stack is full now: " + (integerStack.size()==5));
    System.out.println(integerStack.pop());
    System.out.println(integerStack.pop());
    System.out.println(integerStack.pop());
    System.out.println(integerStack.pop());
    System.out.println(integerStack.pop());
    try {
    System.out.println(integerStack.pop());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Stack is empty" + integerStack.isEmpty());
    System.out.println("");
  }

}
