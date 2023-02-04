import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> character = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (!character.containsKey(text.charAt(i))) {
                    character.put(text.charAt(i), 1);
                } else {
                    character.put(text.charAt(i), character.get(text.charAt(i)) + 1);
                }
            }
        }System.out.println(character);
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : character.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : character.entrySet()) {
            if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
                minEntry = entry;
            }
        }
        System.out.println( "Реже всего встречается : " + minEntry + " " +"\nЧаще всего встречается : " +  maxEntry);

    }
}