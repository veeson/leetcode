package String;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        result.append(1);
        for (int i = 1; i < n; i++) {
            int sum = 1;
            char number = result.charAt(0);
            for (int j = 0; j < result.length(); j++) {
                if (j == result.length() - 1) {
                    sb.append(sum).append(number);
                    break;
                } else if ((result.charAt(j) == result.charAt(j + 1))) {
                    sum++;
                } else {
                    sb.append(sum).append(number);
                    number = result.charAt(j + 1);
                    sum = 1;
                }
            }
            result.setLength(0);
            result.append(sb);
            sb.setLength(0);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(8));
    }
}
