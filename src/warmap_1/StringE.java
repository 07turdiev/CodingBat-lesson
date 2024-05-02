package warmap_1;

public class StringE {
    public boolean stringE(String str) {
        char b ='e';
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == b){
                d++;
            }
        }
        if (d == 1 || d== 3 || d == 2) {
            return true;

        }else {
            return false;
        }
    }
}
