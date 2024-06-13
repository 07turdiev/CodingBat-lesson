package Array_2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }


        int sum = 0;
        boolean minIgnored = false;
        boolean maxIgnored = false;

        for (int num : nums) {
            if (num == min && !minIgnored) {
                minIgnored = true;
                continue;
            }
            if (num == max && !maxIgnored) {
                maxIgnored = true;
                continue;
            }
            sum += num;
        }

        return sum / (nums.length - 2);
    }
}
