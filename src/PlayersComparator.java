import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayersComparator {

    public static class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    public static List<Player> comparePlayers(List<Player> players){

        return players.stream()
                .sorted(Comparator.comparingInt((Player x) -> x.score).reversed().thenComparing(x-> x.name.toLowerCase()))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();


        players.add(new Player("Alice", 120));
        players.add(new Player("Bob", 200));
        players.add(new Player("Charlie", 180));
        players.add(new Player("Diana", 150));
        players.add(new Player("ave", 300));
        players.add(new Player("Evo", 300));
        players.add(new Player("Uvu", 300));

        comparePlayers(players).forEach(x-> System.out.println("The player name is: " + x.name + "and it's score " +
                "is: " + x.score));
    }
}
