public class unique_character {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];  // For 'a' to 'z'

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s1)); // Output: 0
        System.out.println(firstUniqChar(s2)); // Output: 2
        System.out.println(firstUniqChar(s3)); // Output: -1
    }
}