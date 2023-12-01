package Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        checkOddOrEven(n);
    }

    private static void checkOddOrEven(int n) {
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
