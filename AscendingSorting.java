import java.util.Arrays;

public class AscendingSorting {
    public static void main(String[] args) {
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
        System.out.println(Arrays.toString(array));

        for (int i=0 ; i<array.length;i++){
            for (int j = i+1 ; j<array.length;j++){

                int temp = array[i];
                if (array[i]>array[j]){
                    array[i] = array[j];
                    array[j]  = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
