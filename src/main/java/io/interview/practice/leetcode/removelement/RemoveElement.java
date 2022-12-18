package io.interview.practice.leetcode.removelement;

import java.util.Stack;

public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    if( nums == null || nums.length <=0 || nums.length >100 || val <=0 || val >= 100) {
      throw new IllegalArgumentException("not correct input");
    }
    int counter = 0;
    Stack<Integer> integerStack = new Stack<>();
    for (int num : nums) {
      if (num != val) {
        integerStack.push(num);
      }else {
        ++counter;
      }
    }
    int size = counter;
    for(int i=nums.length-1; i>=0 && !integerStack.isEmpty(); i--){
      if(size>0){
        nums[i]=0;
        --size;
      }else{
        nums[i]=integerStack.pop();
      }
    }
    return nums.length-counter;
  }

  public static void main(String[] args) {
    RemoveElement removeElement =new RemoveElement();
    System.out.println(removeElement.removeElement(new int[]{3,2,2,3}, 3));
    System.out.println(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
  }

}
