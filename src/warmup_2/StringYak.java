package warmup_2;

public class StringYak {
    public String stringYak(String str) {
        String aa = "yak";
        String bb = "";
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals(aa)) {
                i += 3;
            } else {
                bb += str.charAt(i);
                i++;
            }
        }
        return bb;
    }
}
