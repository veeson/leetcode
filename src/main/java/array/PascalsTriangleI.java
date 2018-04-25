package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleI {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows == 0) {
            return result;
        }
        List<Integer> temp = new ArrayList<>(1);
        temp.add(1);
        result.add(temp);
        for (int i = 1; i < numRows; i++) {
            temp = new ArrayList<>(i + 1);
            temp.add(1);
            for (int j = 0; j < result.get(i - 1).size() - 1; j++) {
                temp.add(result.get(i - 1).get(j) + result.get(i - 1).get(j + 1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(10);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
