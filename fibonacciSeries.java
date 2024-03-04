import java.util.Scanner;

class fibo {
    int fibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum - 1;
    }
}

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number - ");
        int x = sc.nextInt();
        fibo fb = new fibo();
        int res = fb.fibonacci(x);
        System.out.println("The Sum of the Fibonacci Series is - " + res);
    }
}
