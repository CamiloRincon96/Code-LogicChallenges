package algorithmsCourse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintFrecuency {

    static public void printFrecuency(String phrase) {


        Map<String, Integer> dictionary = Arrays.stream(phrase.split(""))
                .filter(x-> Character.isLetter(x.charAt(0)))
                .collect(Collectors.toMap(
                        x -> x.toLowerCase(),
                        x-> 1,
                        Integer::sum
                        ));


        dictionary.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .forEach(x-> System.out.println("The letter '" + x.getKey()+ "' has this " +
                                "occurrences: " + x.getValue()));

    }




    public static void main(String[] args) {

        printFrecuency("Hello WOrld!!! This is a TEseEEeet");
    }
}
