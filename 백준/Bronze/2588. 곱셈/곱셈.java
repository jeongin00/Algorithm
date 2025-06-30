import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a1 = A * (B%10);
        int a2 = A * (B/10%10);
        int a3 = A * (B/100%10);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(A*B);
    }
}
