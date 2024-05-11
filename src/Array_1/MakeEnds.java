package Array_1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[0];
        a[1] = nums[nums.length - 1];
        return a;
    }
}
