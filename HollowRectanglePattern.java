public class HollowRectanglePattern {
    public static void main(String[] args) {
        int m=4,n=5;;
        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                if (j == 1 || j == m || i==1 || i==n)
                    System.out.print('*');
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
