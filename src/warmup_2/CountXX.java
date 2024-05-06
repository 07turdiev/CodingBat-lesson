package warmup_2;

public class CountXX {
    public int countXX(String str) {
        String x = "x";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

}
