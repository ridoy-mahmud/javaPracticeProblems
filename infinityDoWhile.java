
import java.util.Scanner;

public class infinityDoWhile {
    public static void main(String[] args) {
        System.out.print("Enter two a numbers - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double i = 100099;
        do {
            System.out.println(i);
            i++;
        } while (i > num);

    }
}