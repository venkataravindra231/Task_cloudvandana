public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        System.out.println(isPangram(input));
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
