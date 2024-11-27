import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        int n, sum = 0, rem;

        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println("sum is: " + sum);
        s.close();

    }

}
