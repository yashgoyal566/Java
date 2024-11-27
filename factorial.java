import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact = 1, i = 1;
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("factorial of " + n + " is " + fact);
        s.close();

    }

}
