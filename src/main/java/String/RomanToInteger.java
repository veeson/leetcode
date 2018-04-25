package String;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        int cur = 0, prev = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    cur = 1000;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'I':
                    cur = 1;
                    break;
            }

            sum += (prev >= cur) ? prev : -prev;
            prev = cur;
            sum += (i == s.length() - 1) ? cur : 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }
}
