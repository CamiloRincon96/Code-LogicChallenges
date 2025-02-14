package ProjectEuler;

public class SumSquareDifference {



    public static long sumSquareDifference(long n) {

        long sumOfSquare = 0;
        long squareOfSum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquare += Math.pow(i,2);
            squareOfSum += i;
        }

        return (long) (Math.pow(squareOfSum,2) - sumOfSquare );
    }


    public static void main(String[] args) {

        System.out.println(sumSquareDifference(100L));


    }
}
