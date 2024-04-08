import java.util.Arrays;
import java.util.Scanner;

public class LargestofThreeNumbers {


    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println("Enter three numbers\n******************");
        System.out.println("Enter first number ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        array[0]=a;
        System.out.println("Enter second number ");
        int b = s.nextInt();
        array[1]=b;
        System.out.println("Enter third number ");
        int c = s.nextInt();
        array[2]=c;

        int max = array[0] ;
        for (int n:array){
            if (n>max){
                max=n;
            }
        }

        System.out.println("Largest of 3 numbers is : " + max);


    }
}
