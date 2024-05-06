package warmup_2;

public class StringBits {
    public String stringBits(String str) {
        String a ="";
        for (int i = 0; i < str.length(); i+=2) {
            a += str.substring(i, i+1);
        }
        return a;
    }
}
