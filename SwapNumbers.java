import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        System.out.println("Insert 1st number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Insert 2nd number");
        int b = sc.nextInt();
        System.out.println("Numbers before swapping"+" a: "+a + "," + " b:" + b );
        swapTwoNumbers(a,b);
    }

    private static void swapTwoNumbers(int a, int b) {
        a = a-b;
        b=a+b;
        a=b-a;
        System.out.println("Numbers after swapping"+" a: "+a + "," + " b:" + b );

    }
}
