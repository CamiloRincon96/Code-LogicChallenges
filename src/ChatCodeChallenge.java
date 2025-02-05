import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChatCodeChallenge {

    static public Map.Entry<String, Boolean> maxRepeatedLetterIsOdd(String phrase) {
        String[] array = phrase.split("");
        Map<String, Integer> dictionary = new HashMap<>();
        Integer maxValue = 0;
        String maxOcurrence = "";


        Arrays.stream(array).forEach( x-> dictionary.put(x, dictionary.getOrDefault(x,0) + 1 ));

        for (Map.Entry<String, Integer> entry: dictionary.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxOcurrence = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return Map.entry(maxOcurrence, maxValue%2 != 0);

    }

    public static void maxCharacterRepeatedAndIsOdd(String phrase) {

        Optional<Map.Entry<String, Integer>> dictionary = Arrays.stream(phrase.split(""))
                .collect(Collectors.toMap(
                        x-> x.toLowerCase(),
                        x -> 1,
                        Integer::sum

                ))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue());

        boolean isOdd = dictionary.get().getValue() != 0;

        dictionary.ifPresent(x-> System.out.println("The most common character is: '" + x.getKey() +
                "' and is a number odd of times repeated? R//" + isOdd));



    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> listStudents = new ArrayList<>();

        for (int i = 1; i < grades.size(); i++) {

            if (grades.get(i) < 38) {
                listStudents.add(grades.get(i));
            } else if (grades.get(i) >= 38) {
                if (grades.get(i) % 5 == 3) {
                    listStudents.add(grades.get(i) + 2);
                } else if (grades.get(i) % 5 == 4) {
                    listStudents.add(grades.get(i)  + 1);
                } else {
                    listStudents.add(grades.get(i));
                }
            }

        }

        return listStudents;
    }



    public static void main(String[] args) {


        System.out.println(1%5);
    }
}
