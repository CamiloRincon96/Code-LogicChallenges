package ProjectEuler;

public class LargestPrimeFactor {


    public static long largestPrimeFactor(long num) {

        long largest = 1L;

        for (long i = 1L; i <= Math.sqrt(num) ; i+=2L) {
            if(num % i == 0) {
                largest = i;
            }

        }

        return largest;
    }

    public static void main(String[] args) {

        System.out.println(largestPrimeFactor(600851475143L));//terminar
    }
}
