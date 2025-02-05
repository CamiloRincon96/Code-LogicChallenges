import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        return Map.entry(maxOcurrence, maxValue%2 == 0);

    }



    public static void main(String[] args) {
        //Find the character that is repeating the maximum number
        // of times and determine if its occurrence is odd or
        // even (using Stream API) for input: “aabbbccccddddd”

        System.out.println();

        Map.Entry<String, Boolean> entry = maxRepeatedLetterIsOdd("aabbbbbbbbbbbbbbbbbbccccddddd");

        System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println(entry.getValue());
    }
}
