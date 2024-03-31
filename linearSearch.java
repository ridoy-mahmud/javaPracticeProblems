import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        System.out.print("Enter the Size of the Array -");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter the Array Elements -");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.print("Enter the Array Element you wanna find out - ");
        int x = sc.nextInt();
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == x) {
                System.out.println("The index is - " + j);
            }
        }
    }
}
