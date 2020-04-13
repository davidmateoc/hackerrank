/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/compare-the-triplets
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)){
                bobScore++;
            }
        }
        return new ArrayList<>(Arrays.asList(aliceScore, bobScore));
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> b = new ArrayList<>(Arrays.asList(3, 6, 10));
        List<Integer> winner = compareTriplets(a, b);
        System.out.println(winner);
    }
}
