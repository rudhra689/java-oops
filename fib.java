import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int f3;
        int f1 = 0;
        int f2 = 1;
        int i = 2;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println(f1);
        System.out.println(f2);

        while(i < num) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
            i = i + 1;
        }
        sc.close();
    }
}