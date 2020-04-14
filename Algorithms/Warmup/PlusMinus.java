/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/diagonal-difference
 */
public class PlusMinus {
    static void plusMinus(int[] arr) {
        float denominator = arr.length;
        float positive = 0;
        float negative = 0;
        float zeros = 0;
        for(int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println(positive/denominator);
        System.out.println(negative/denominator);
        System.out.println(zeros/denominator);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, 3, 2, 0, 0};
        plusMinus(arr);
    }
}
