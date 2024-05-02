package warmap_1;

public class EndUp {
    public String endUp(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            a++;
        }
        if (a >= 3) {
            int length = str.length();
            String lastThreeChars = str.substring(length - 3).toUpperCase();
            String modifiedStr = str.substring(0, length - 3) + lastThreeChars;
            return modifiedStr;
        }else {
            return str.toUpperCase();
        }
    }
}