import java.util.Scanner;

class greater {
    void greaterNumber(int n, int x) {
        if(n>x){
            System.out.println(n+" is Greater");
        }
        else {
            System.out.println(x+" is Greater");
        }
    }
}

public class greaterNumberis {
    public static void main(String[] args) {
        System.out.print("Enter two a numbers - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        greater obj1 = new greater();
        obj1.greaterNumber(num,num2);
    }
}