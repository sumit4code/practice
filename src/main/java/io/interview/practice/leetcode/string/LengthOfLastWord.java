package io.interview.practice.leetcode.string;

public class LengthOfLastWord {

  public int length(String string) {
    char[] chars = string.toCharArray();
    int maxLength = 0;
    for (int i = chars.length - 1; i > 0; i--) {
      if (chars[i] != ' ') {
        maxLength++;
      } else {
        if (maxLength != 0) {
          break;
        }
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
    System.out.println(lengthOfLastWord.length("Hello World"));
    System.out.println(lengthOfLastWord.length("   fly me   to   the moon  "));
    System.out.println(lengthOfLastWord.length("luffy is still joyboy"));
  }

}
