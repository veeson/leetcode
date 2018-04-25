package String;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                list.push(c);
                continue;
            }
            if (list.peek() != null && map.get(list.poll()) != c) {
                return false;
            }
        }
        return list.isEmpty();




        /*if (s.length() % 2 != 0) {
            return false;
        }
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                list.push(c);
                continue;
            }

            Character ch = list.poll();
            if (ch == null){
                return false;
            }
            if (c == ')' && ch != '(') {
                return false;
            }

            if (c == ']' && ch != '[') {
                return false;
            }

            if (c == '}' && ch != '{') {
                return false;
            }
        }
        return list.isEmpty();*/
    }

    public static boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        char[] stack = new char[length];
        int index = -1;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack[++index] = c;
                continue;
            }

            if (index == -1) {
                return false;
            }
            char ch = stack[index--];

            if (c == ')' && ch != '(') {
                return false;
            }

            if (c == ']' && ch != '[') {
                return false;
            }

            if (c == '}' && ch != '{') {
                return false;
            }
        }
        return index == -1;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
