import java.util.Scanner;

class average {
    void averageOfthreeNumbers(int a, int b, int c) {
        float res = (a + b + c) / 3;
        System.out.println(res);
    }
}

public class averageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        average avg = new average();
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg.averageOfthreeNumbers(a, b, c);

    }
}