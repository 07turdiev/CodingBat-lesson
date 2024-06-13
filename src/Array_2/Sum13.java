package Array_2;

public class Sum13 {
    public int sum13(int[] nums) {
        int a = 0;
        if (nums.length == 0){
            return 0;
        }else {
            for(int i = 1; i < nums.length; i++){
                if (nums[i] == 13){
                    break;
                }{
                    a += nums[i];
                }
            }
        }
        return a;
    }
}
