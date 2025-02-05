import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseAnArray {



    public static String[] arrayReverter(String[] arr) {

        String[] newArr = new String[arr.length];

        for(int i = 0, j = arr.length; i < arr.length; i++,j--) {
            newArr[j-1] = arr[i];
        }

        return newArr;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayReverter(new String[]{"1", "2", "3", "4"})));
    }
}
