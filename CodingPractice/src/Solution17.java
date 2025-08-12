public class Solution17 {
    private static Solution17 singleton = new Solution17();

    private Solution17() {}

    public static Solution17 getInstance() {
        return  singleton;
    }
}
