import java.util.Scanner;

class powerUp {
    void power(int x, int r) {
        int res = (int) Math.pow(x, r);
        System.out.println("The Answer is = " + res);
    }
}

public class powerUpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        powerUp pw = new powerUp();
        System.out.print("Enter the Base - ");
        int x = sc.nextInt();
        System.out.print("Enter the Power - ");
        int r = sc.nextInt();
        pw.power(x, r);
    }
}