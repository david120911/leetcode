package leetcode;

public class TwoSum {

    public static Integer[] twoSum(Integer[] array, Integer target) {
        Integer[] returnInts = new Integer[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == target) {
                    returnInts[0] = i;
                    returnInts[1] = j;
                    return returnInts;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        /**
         Given an array of integers nums and an integer target,
         return indices of the two numbers such that they add up to target.

         You may assume that each input would have exactly
         one solution, and you may not use the same element twice.

         You can return the answer in any order.



         Example 1:

         Input: nums = [2,7,11,15], target = 9
         Output: [0,1]
         Output: Because nums[0] + nums[1] == 9, we return [0, 1].
         Example 2:

         Input: nums = [3,2,4], target = 6
         Output: [1,2]
         Example 3:

         Input: nums = [3,3], target = 6
         Output: [0,1]

         */

        Integer[] nums2 = new Integer[4];
        nums2[0] = 2;
        nums2[1] = 7;
        nums2[2] = 11;
        nums2[3] = 15;
        Integer target2 = 9;
        Integer[] returnInts2 = twoSum(nums2, target2);
        print(returnInts2);

        Integer[] nums = new Integer[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        Integer target = 6;
        Integer[] returnInts = twoSum(nums, target);
        print(returnInts);


        Integer[] nums1 = new Integer[2];
        nums1[0] = 3;
        nums1[1] = 3;
        Integer target1 = 6;
        Integer[] returnInts1 = twoSum(nums1, target1);
        print(returnInts1);






    }

    public static void print(Integer[] printInts) {
        for (int i = 0; i < printInts.length; i++) {
            System.out.print(printInts[i] + " ");
        }
        System.out.println(" ");
    }

}
