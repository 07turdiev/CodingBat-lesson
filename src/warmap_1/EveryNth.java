package warmap_1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String f = "";
        for (int i = 0; i < str.length(); i += n) {
             f += str.substring(i, i +1);


        }
        return f;
    }

}
