package Array_1;

public class Sum2 {
    public int sum2(int[] nums) {
        int a = 0;
        if (nums.length > 1){
            a += (nums[0] + nums[1]);
        }if (nums.length == 1){
            a = nums[0];
        }
        return a;
    }
}
