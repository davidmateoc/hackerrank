import java.util.Scanner;

public class BinaryNumbers {

    private static void printMaximumConsecutiveOnesInBinaryBase(int n) {
        String nString = Integer.toString(n, 2);
        int max = 0;
        String[] nArr = nString.split("0");
        for(String s: nArr) {
            if(s.length() > max) {
                max = s.length();
            }
        }
        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMaximumConsecutiveOnesInBinaryBase(n);
        scanner.close();
    }
}
