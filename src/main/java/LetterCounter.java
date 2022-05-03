import java.util.Map;
import java.util.TreeMap;

public class LetterCounter {

    private static TreeMap<Character, Integer> countLetters(String inputPhase) {
        TreeMap<Character, Integer> letters = new TreeMap<Character, Integer>();
        for (int i=0; i<inputPhase.length(); i++) {
            Character key = inputPhase.charAt(i);
            if(letters.containsKey(key)) {
                letters.put(key, letters.get(key) + 1);
            }
            else {
                letters.put(key,1);
            }
        }
        return letters;
    }

    private static void printResults(TreeMap<Character, Integer> letters) {
        System.out.println("Counted letters:");
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String args[]) {
        // to ignore letter case
        String input = args[0].toLowerCase();
        TreeMap<Character, Integer> letters = countLetters(input);
        printResults(letters);
    }
}
