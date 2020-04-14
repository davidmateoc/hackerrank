/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/staircase
 */
import java.util.Scanner;

public class Staircase {
    static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            String spaces = "";
            String pounds = "";

            for(int j = 0; j < n - i; j++) {
                spaces += ' ';
            }

            for(int j = 0; j < i; j++) {
                pounds += '#';
            }
            System.out.println(spaces + pounds);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
