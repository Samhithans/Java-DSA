package Functions;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        printTable(n);
    }

    private static void printTable(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
