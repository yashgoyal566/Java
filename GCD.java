import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {

        int num1, num2, gcd = 0;
        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        System.out.println("G.C.D of " + num1 + " and " + num2 + " is " + gcd);
        s.close();
    }
}