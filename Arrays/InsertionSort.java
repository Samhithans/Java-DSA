package Arrays;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i=1;i<n;i++){
            int j=i-1;
            int current = a[i];
            while(j>=0 && a[j]>current){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        Print(a);
    }

    private static void Print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
            
    }
}
