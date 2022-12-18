package io.interview.practice.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * With complexity O(n^2)
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    if( nums == null || nums.length==0 ){
      throw new IllegalArgumentException("not a valid input");
    }
    int length = nums.length;
    for(int i=0; i< length-1;i++){
      int remaining = target - nums[i];
      for(int j=i+1; j< length; j++){
        if(remaining == nums[j]){
          int[] result = new int[2];
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return null;
  }

  /**
   * With complexity O(n)
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSumUsingHashMap(int [] nums, int target){
    if( nums == null || nums.length==0 ) {
      throw new IllegalArgumentException("not a valid input");
    }
    Map<Integer, Integer> dataMap = new HashMap<>();
    for(int i=0; i< nums.length; i++){
      int remaining = target - nums[i];
      if(dataMap.containsKey(remaining)){
        return new int[]{dataMap.get(remaining), i};
      }else{
        dataMap.put(nums[i], i);
      }
    }
    return null;
  }

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] inputArray = {3,3};
    System.out.println(Arrays.toString(twoSum.twoSum(inputArray, 6)));
    System.out.println(Arrays.toString(twoSum.twoSumUsingHashMap(inputArray, 6)));
  }

}
