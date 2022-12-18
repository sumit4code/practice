package io.interview.practice.stack;

public interface Stack<T> {

  T pop();
  void push(T item);
  int size();
  int search(T item);
  T peek();
  boolean isEmpty();

}
