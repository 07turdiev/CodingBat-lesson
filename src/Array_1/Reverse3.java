package Array_1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] a = new int[3];
        a[0] = nums[2];
        a[1] = nums[1];
        a[2] = nums[0];
        return a;
    }
}
