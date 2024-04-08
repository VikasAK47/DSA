public class LargOfthreeNumTersnary {


    public static void main(String[] args) {
        int a = -1;
        int b = -11;
        int c = 0;

        int max  = largestOfThreeNumbers(a,b,c);
        System.out.println("Largest of 3 numbers is :" + max);

    }

    private static int largestOfThreeNumbers(int a, int b, int c) {
//        return c>(a>b?a:b)?c:(a>b?a:b);
        return Math.max(c, (Math.max(a, b)));

    }


}
