import java.util.Scanner;

public class IntroToConditionalStatements {

    private static void printWeird(int N) {
        if((N%2 == 1) || ((N%2 == 0) && (N > 5) && (N < 21))) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printWeird(N);
        scanner.close();
    }
}
