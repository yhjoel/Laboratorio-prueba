import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos: ");
        n = sc.nextInt();
        
        System.out.print("Serie de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
