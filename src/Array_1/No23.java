package Array_1;

public class No23 {
    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3){
                return false;
            }
        }
        return true;
    }
}
