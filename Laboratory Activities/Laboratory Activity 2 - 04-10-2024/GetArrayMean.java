import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] num = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        float mean = (float) sum / n;
        System.out.printf("Mean of array is: %.2f%n", mean);
        
        scanner.close();
    }
}
