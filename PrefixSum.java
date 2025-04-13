import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int[] prefixSum = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        prefixSum[0] = array[0];
        for (int i = 1; i < size; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        System.out.print("Prefix Sum: [");
        for (int i = 0; i < size; i++) {
            System.out.print(prefixSum[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
