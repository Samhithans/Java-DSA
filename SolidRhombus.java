public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < (2 * n) - 1; j++) {
                if (j <= n - i)
                    System.out.print(" ");
            }
            for (int z = 1; z <= n; z++)
                System.out.print("*");
            System.out.println();
        }
    }
}
