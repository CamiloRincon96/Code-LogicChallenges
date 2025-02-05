package ProjectEuler;

public class EvenFibonacciNumbers {


    public static long evenFibonacciNumbers(long num) {

        long previous = 1;
        long current = 2;
        long evenSum = 2;


        for (int i = 1; i < num; i++) {
            if(i == (previous + current)){
                if(i%2 == 0){
                    evenSum += i;
                }
                previous = current;
                current = i;
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers(4000000));
    }
}
