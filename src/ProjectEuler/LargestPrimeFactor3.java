package ProjectEuler;

public class LargestPrimeFactor3 {

    public static void largestPrimeFactor(int num) {

        int factor = num;

        while (num % 2 == 0) {
            factor = num/2;
        }

        for (int i = 1; i <= Math.sqrt(num); i++) {
            
        }
    }

    public static void main(String[] args) {

    }
}
