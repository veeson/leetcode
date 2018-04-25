package String;

/**
 * Created by Wilson on 2018/3/6.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (i != length - 1 && s.charAt(i + 1) != ' ') {
                    sum = 0;
                }
            } else {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord(" dd"));
        System.out.println(lengthOfLastWord(" dd "));
        System.out.println(lengthOfLastWord(" dd tttt"));
        System.out.println(lengthOfLastWord("dd "));
        System.out.println(lengthOfLastWord("dd rffff"));
        System.out.println(lengthOfLastWord("dd rffff   "));
    }
}
