package Warmup;
/*
Complete the function solveMeFirst to compute the sum of two integers.

Function prototype:

int solveMeFirst(int a, int b);

where,

a is the first integer input.
b is the second integer input
Return values

sum of the above two integers
Sample Input

a = 2
b = 3
Sample Output

5
Explanation

The sum of the two integers  and  is computed as: .
 */

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