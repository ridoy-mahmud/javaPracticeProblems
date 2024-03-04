import java.util.Scanner;

class fibo {
    void fibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        System.out.print("1 ");
        for (int i = 1; i <= n; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number - ");
        int x = sc.nextInt();
        fibo fb = new fibo();
        fb.fibonacci(x);
    }
}
