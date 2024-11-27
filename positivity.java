import java.util.Scanner;

public class positivity {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any numbers:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n > 0) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("number is zero");
        }
        s.close();
    }

}
