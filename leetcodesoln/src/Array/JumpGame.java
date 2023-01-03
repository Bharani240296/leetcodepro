package Array;

public class JumpGame {
    public static boolean CanJump(int[] nums) {
        int i = 0, max = 0;
        for (; i < nums.length && i <= max; i++) {
            max = Math.max(max, i + nums[i]);
        }
        return i == nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(CanJump(nums));
    }
}
// output--> TRUE;