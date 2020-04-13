/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/a-very-big-sum
 */
public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long i : ar) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long sum = aVeryBigSum(new long[]{1, 2, 3});
        System.out.println(sum);
    }
}
