package Array_2;

public class CountEvens {
    public static void main(String[] args) {
        CountEvens aa = new CountEvens();
        int[] a = {2, 1, 2, 3, 4};
        System.out.println(aa.countEvens(a));
    }

    public int countEvens(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0) {
                a++;
            }
        }
        return a;
    }
}
