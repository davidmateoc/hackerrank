/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/diagonal-difference
 */
package Warmup;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

    public static void main(String[] args) {
        int sum = diagonalDifference(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3)
        ));

        System.out.println(sum);
    }
}
