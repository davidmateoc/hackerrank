import java.util.Scanner;

public class Operators {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double meal_tip = meal_cost*(tip_percent/100.0);
        double meal_tax = meal_cost*(tax_percent/100.0);
        double total = meal_cost + meal_tip + meal_tax;
        if(total - (int) total < 0.5) {
            System.out.println((int) total);
        } else {
            System.out.println((int)total + 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
