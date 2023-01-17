

public class Solution {
    public static void main(String[] args) {
        int[] case1 = {1, 3, 5, 6};//target 2 expected 1 and target 7 expected 4.
        int[] case2 = {1, 3, 5};//target 4 expected 2.
        int[] case3 = {-1,3,5,6};//target 0 expected 1
//                     0  1  2
        System.out.println(searchInsert(case3, 0));

    }

    public static int searchInsert(int[] nums, int target) {
        //if (target == 0) return 0;
        int position = 0;
        boolean contain = false;
        int doesNotContain = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                contain = true;
            }
        }

        if (!contain) {
            for (int i = 0; i < nums.length; i++) {
                if (target < nums[i]) {
                    doesNotContain = i;
                    break;
                }

                if (target > nums[i] && i == nums.length - 1) {
                    doesNotContain = i + 1;
                    break;
                }
            }
        }


        return contain ? position : doesNotContain;
    }
}
