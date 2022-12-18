package io.interview.practice.stack;

public class IntegerStack implements Stack<Integer> {

  private Integer[] array;
  private int maxSize;
  private int position;

  public IntegerStack(int maxSize) {
    this.maxSize = maxSize;
    this.array = new Integer[this.maxSize];
    this.position = -1;
  }

  @Override
  public Integer pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack underflow");
    }
    int element = this.array[position];
    this.array[position] = null;
    --this.position;
    return element;
  }

  @Override
  public void push(Integer item) {
    if (this.position + 1 == maxSize) {
      throw new RuntimeException("Stackoverflow");
    }
    ++this.position;
    this.array[position] = item;
  }

  @Override
  public int size() {
    return position+1;
  }

  @Override
  public int search(Integer item) {
    int size = this.size();
    for (int i = 0; i <= size; i++) {
      if (array[i].equals(item)) {
        return i;
      }
    }
    throw new RuntimeException("Item does not exist");
  }

  @Override
  public Integer peek() {
    if (position != -1) {
      return array[position];
    }
    throw new RuntimeException("Stack underflow");
  }

  @Override
  public boolean isEmpty() {
    return position == -1;
  }
}
