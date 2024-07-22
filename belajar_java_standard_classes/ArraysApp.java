package belajar_java_standard_classes;

import java.util.Arrays;

public class ArraysApp {
  public static void main(String[] args) {
    int[] nums = { 90, 84, 85, 93, 77, 89, 80 };

    Arrays.sort(nums);

    for (int num : nums) {
      System.out.println(num + " adalah index ke-" + Arrays.binarySearch(nums, num));
    }

    int[] nums3 = Arrays.copyOf(nums, 3);
    System.out.println(Arrays.toString(nums3));
  }
}
