import java.util.Arrays;
import java.util.Comparator;

public class mang_test_2 {
    public static void main(String[] args) {
        String[] arr_1;
        String[] arr_2 = new String[] {"test 1","test 2","test 3","1","abcd","456"};
        System.out.println(Arrays.toString(arr_2));
        System.out.println(arr_2);
        Arrays.sort(arr_2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr_2));
//        System.out.println(Arrays.toString(arr_S


    }


}
