import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter the marks of three subjects:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int Average = (a + b + c) / 3;
        if (Average >= 90) {
            System.out.println("A+ Grade");
        }
        if (Average >= 75) {
            System.out.println("A Grade");
        }
        if (Average >= 50) {
            System.out.println("B Grade");
        } else {
            System.out.println("Fail");
        }
        s.close();

    }

}
