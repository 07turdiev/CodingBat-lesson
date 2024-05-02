package warmap_1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int c = a % 10;
        int d = b % 10;
        if (c == d) {
            return true;
        } else {
            return false;
        }
    }
}