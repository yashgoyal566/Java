import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n, rev = 0, rem;
        ;
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse of " + n + " is: " + rev);
        s.close();

    }

}
