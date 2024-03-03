
import java.util.Scanner;

public class FindNumberOfPostiverOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int postitive = 0, negative = 0, zeros = 0, i;
        char choice;
        do {
            System.out.print("Enter the number ");
            int num = sc.nextInt();

            if (num >= 1) {
                postitive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Do you Want to Continue(Choose between Y/y) - ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Positive numbers: " + postitive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zeros);
    }

}
