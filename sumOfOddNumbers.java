import java.util.Scanner;

class sumOFoddNum {
    void oddCalculation(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum of Odd Numbers Are - " + sum);

    }
}

public class sumOfOddNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOFoddNum obj1 = new sumOFoddNum();
        obj1.oddCalculation(num);
    }
}