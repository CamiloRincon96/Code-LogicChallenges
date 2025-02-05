import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SortedBooks {

    public static Integer fewerBooksSorted(List<String> books) {

        List<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);


        if (books.equals(sortedBooks))
        {return 0;}


        long mismatchedCount = IntStream.range(0, books.size())
                .filter(i -> !books.get(i).equals(sortedBooks.get(i)))
                .count();



        return (int) (mismatchedCount%2 == 0  ? mismatchedCount: mismatchedCount - 1);

    }

    public static Integer fewerBooksSorted2ndSolution(List<String> books) {

        List<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        Arrays.sort(new String[]{"jejej", "Equisdé"});
        int count = 0;


        if (books.equals(sortedBooks))
        {return 0;}


        for (int i = 0; i < sortedBooks.size() ; i++) {
            if (!sortedBooks.get(i).equals(books.get(i))) {
                count++;}
        }


        return (count%2 == 0  ? count: count - 1);

    }


    public static void main(String[] args) {
   

        // Caso 1: Lista ya ordenada (debería devolver 0)
        List<String> case1 = List.of("A", "B", "C", "D");
        System.out.println("Case 1 (Already sorted): " + fewerBooksSorted2ndSolution(case1)); // Output: 0

        // Caso 2: Lista desordenada
        List<String> case2 = List.of("D", "B", "A", "C");
        System.out.println("Case 2 (Unsorted list): " + fewerBooksSorted2ndSolution(case2)); // Output: 2

        // Caso 3: Lista parcialmente ordenada
        List<String> case3 = List.of("A", "C", "B", "D");
        System.out.println("Case 3 (Partially sorted list): " + fewerBooksSorted2ndSolution(case3)); // Output: 2

        // Caso 4: Lista vacía (debería devolver 0)
        List<String> case4 = new ArrayList<>();
        System.out.println("Case 4 (Empty list): " + fewerBooksSorted2ndSolution(case4)); // Output: 0

        // Caso 5: Lista con elementos iguales (debería devolver 0)
        List<String> case5 = List.of("A", "A", "A");
        System.out.println("Case 5 (All elements equal): " + fewerBooksSorted2ndSolution(case5)); // Output: 0

        // Caso 6: Lista con un solo elemento (debería devolver 0)
        List<String> case6 = List.of("A");
        System.out.println("Case 6 (Single element): " + fewerBooksSorted2ndSolution(case6)); // Output: 0

        // Caso 7: Lista con elementos repetidos desordenados
        List<String> case7 = List.of("B", "A", "A", "C");
        System.out.println("Case 7 (Unsorted with duplicates): " + fewerBooksSorted2ndSolution(case7)); // Output: 2
    }
}


