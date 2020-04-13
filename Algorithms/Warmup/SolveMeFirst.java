/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/solve-me-first
 */
package Warmup;

import java.util.Scanner;

public class SolveMeFirst {

    private static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        a = in.nextInt();
        b = in.nextInt();

        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
