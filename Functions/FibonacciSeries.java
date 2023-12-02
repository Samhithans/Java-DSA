package Functions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        if (n == 1)
            System.out.print("0");
        if (n > 1) {
            System.out.print("0 1 ");
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;

            }
        }
    }
}
