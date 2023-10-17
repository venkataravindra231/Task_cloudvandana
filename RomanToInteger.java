public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with your Roman numeral
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i < romanNumeral.length() - 1 && romanValue(romanNumeral.charAt(i)) < romanValue(romanNumeral.charAt(i + 1))) {
                result -= romanValue(romanNumeral.charAt(i));
            } else {
                result += romanValue(romanNumeral.charAt(i));
            }
        }

        System.out.println("Integer value: " + result);
    }

    public static int romanValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
