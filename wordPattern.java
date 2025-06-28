public import java.util.*;

public class wordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // If the number of pattern letters and words differ, return false
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // If c is already mapped, check if it maps to the current word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // Different mapping found
                }
            } else {
                charToWord.put(c, word); // Map c to word
            }

            // Similarly, if word is already mapped, check if it maps to c
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // Different mapping found
                }
            } else {
                wordToChar.put(word, c); // Map word to c
            }
        }

        return true; // All mappings are bijection
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern1, s1)); // true

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern2, s2)); // false

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3, s3)); // false
    }
}
 wordPattern {
    
}
