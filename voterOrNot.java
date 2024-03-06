import java.util.Scanner;

class vote {
    void votingAge(int n) {
        if (n >= 18) {
            System.out.println("Eligible for Vote ");
        } else {
            System.out.println("Not Eligible for Vote");
        }
    }
}

public class voterOrNot {
    public static void main(String[] args) {
        System.out.print("Enter two a numbers - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        vote obj1 = new vote();
        obj1.votingAge(num);
    }
}