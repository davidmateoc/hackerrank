/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/mini-max-sum
 */
import java.util.Scanner;

public class MinMaxSum {
    static int max(int[] arr) {
        int maximum = arr[0];
        for(int i : arr) {
            if(maximum < i) {
                maximum = i;
            }
        }
        return maximum;
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for(int i : arr) {
            if(minimum > i) {
                minimum = i;
            }
        }
        return minimum;
    }

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        for(int i : arr){
            sum += i;
        }
        long minSum = sum - max(arr);
        long maxSum = sum - min(arr);

        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
