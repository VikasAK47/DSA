import java.util.Arrays;
public class SortAnArray {

    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " " );
        }
        System.out.print( " \n" );

        Arrays.sort(arr);

        System.out.println("The Sorted array is: ");

        for (int num2 : arr){
            System.out.print(num2 + " ");
        }
    }

}
