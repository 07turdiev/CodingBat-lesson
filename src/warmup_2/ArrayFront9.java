package warmup_2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4){
                return true;
            }
        }
        return false;
    }
}
