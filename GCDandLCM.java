
import java.util.Scanner;

public class GCDandLCM {
    static class gcd {
        int greatCommon(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }
    }

    static class lcm {

        int listCommon(int a, int b) {
            gcd g = new gcd();
            int inputGCD = g.greatCommon(a, b);
            return Math.abs(a * b) / inputGCD;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers - ");
        int x = sc.nextInt();
        int r = sc.nextInt();
        gcd gc = new gcd();
        lcm lc = new lcm();
        int res = gc.greatCommon(x, r);
        int res2 = lc.listCommon(x, r);
        System.out.println("GCD of two Numbers are - " + res);
        System.out.println("LCM of two Numbers are - " + res2);
    }
}
