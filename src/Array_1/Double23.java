package Array_1;

public class Double23 {
    public boolean double23(int[] nums) {
        if (nums.length == 1 || nums.length == 0){
            return false;
        }
        return nums[0] == nums[1];
    }
}
