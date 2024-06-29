import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9,7,5,61,8,8};

       int max = arr[0];
       for (int i:arr){
           if (i>max){
               max = i;
           }
       }
        System.out.println("Largest Number is : " + max);


        int max1 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest Number is : " + max1);

    }
}
