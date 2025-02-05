import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstRepeatingCharacter {


    public static void firstRepeatingCharacter(String phrase) {
        String[] array = phrase.split("");
        Map<String, Integer> dictionary = new HashMap<>();

        Optional<String> firstCoincidence = Arrays.stream(array)
                .peek(x -> dictionary.put(x,dictionary.getOrDefault(x,0) + 1))
                .filter(x-> dictionary.get(x) == 2)
                .findFirst();

        System.out.println(firstCoincidence.orElse("Not found"));
    }

    public static void main(String[] args) {
        firstRepeatingCharacter("sdfaghjklkjhgfdsa");
    }
}
