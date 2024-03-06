import java.util.Scanner;

class circleCircum {
    double circle(int r) {
        return Math.PI * 2 * r;
    }
}

public class circleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        circleCircum cir = new circleCircum();
        double res = cir.circle(num);
        System.out.println(res);

    }
}
