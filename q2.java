import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        for (int i = 1; i >= 0; i--) {
            for (int j = i; j >=0; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
