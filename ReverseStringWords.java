public class ReverseStringWords {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the string by one or more spaces using regex "\\s+"
        String[] words = s.split("\\s+");

        // Use StringBuilder for efficient concatenation
        StringBuilder reversed = new StringBuilder();

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);

            // Add a space between words, but not after the last word
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(reverseWords(s2)); // Output: "world hello"
        System.out.println(reverseWords(s3)); // Output: "example good a"
    }
}
 ReverseStringWords {
    
}
