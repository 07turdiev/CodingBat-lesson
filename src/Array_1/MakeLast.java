package Array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] sonlar = new int[nums.length * 2];
        int a = 0;
        for (int i = 0; i < sonlar.length - 1; i++) {
            sonlar[i] = a;
        }
        sonlar[sonlar.length - 1] = nums[nums.length  - 1];
        return sonlar;
    }
}
