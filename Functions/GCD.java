package Functions;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        System.out.println("GCD is "+ b);
    }
}
