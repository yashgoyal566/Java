import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        String res = (n % 3 == 0 && n % 5 == 0) ? "Divisible by both 3 and 5" : "Not divisible by both 3 and 5";
        System.out.println(res);
        s.close();

    }
}