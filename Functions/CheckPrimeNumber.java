package Functions;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<=1) System.out.println("Neither Prime nor composite");
        else if (checkPrime(n)) System.out.println("It is a prime number");
        else System.out.println("Not a prime number");
    }
}
