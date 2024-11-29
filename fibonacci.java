import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        System.out.println("Enter the no. of terms:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;

        }
        s.close();

    }

}
