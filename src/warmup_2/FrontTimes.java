package warmup_2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3); // Boshlang'ich qismni olish
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }
}
