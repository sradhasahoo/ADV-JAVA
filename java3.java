//3
import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            }

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}