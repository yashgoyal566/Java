import java.util.Scanner;

public class check_division {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5");
        }
        s.close();

    }

}
