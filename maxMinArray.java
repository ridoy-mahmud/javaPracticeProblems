import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size - ");
        int size, i, j;
        size = sc.nextInt();
        int[] numbers = new int[size];
        for (i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // To Define the max Values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println();
        System.out.println("The max value is - " + max);
        System.out.println("The min value is - " + min);
    }
}
