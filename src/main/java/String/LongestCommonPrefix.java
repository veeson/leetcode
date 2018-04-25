package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        int index = 0;
        while (true) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (index == min || strs[i].charAt(index) != strs[i + 1].charAt(index)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(index++));
        }
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"caaad"}));
    }
}
