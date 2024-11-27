import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d\n", n, i, n * i);

        }
        s.close();
    }

}
