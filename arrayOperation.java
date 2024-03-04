import java.util.Scanner;

class innerloop {
    void loopFun(int n) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[50];
        System.out.println("Enter the Numbers - ");
        for (int i = 0; i <= n; i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j <= n; j++) {
            System.out.print(marks[j] + " ");
            sum = sum + marks[j];
        }
        System.out.println();
        System.out.println("The Sum of the Array elements are - " + sum);
        System.out.print("Copy Array Check - ");
        int[] marks2 = marks.clone();
        for (int k = 0; k <= n; k++) {
            System.out.print(" " + marks2[k]);
        }
    }
}

public class arrayOperation {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        innerloop lo = new innerloop();
        lo.loopFun(num);
    }
}
