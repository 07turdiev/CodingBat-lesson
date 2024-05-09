package Array_1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int maxElement = Math.max(nums[0], nums[2]);
        int[] result = new int[]{maxElement, maxElement, maxElement};
        return result;
    }
}

