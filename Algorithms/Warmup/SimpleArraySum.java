/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {
    private static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i : ar) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = simpleArraySum(new int[]{3, 4, 5, 2, 2});
        System.out.println(sum);
    }
}
