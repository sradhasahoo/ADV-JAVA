//4
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}