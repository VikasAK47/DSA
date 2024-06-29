import java.util.Arrays;

public class DescendingSorting {

    public static void main(String[] args) {
        Integer array[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
        int n = array.length;
        for (int i=0;i<n/2;i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
