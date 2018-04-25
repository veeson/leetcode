package String;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);
            if (c == needle.charAt(index)) {
                if (index + 1 == needle.length()) {
                    return i - index;
                } else {
                    index++;
                }
            } else {
                i = i - index;
                index = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        System.out.println(strStr(haystack, needle));
    }
}
