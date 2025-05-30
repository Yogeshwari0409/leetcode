class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a character array for easy swapping
        char[] chars = s.toCharArray();
        
        // Define a set of vowels for quick lookup
        String vowels = "aeiouAEIOU";
        
        // Two pointers to swap vowels from both ends
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move the right pointer to the previous vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move both pointers
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        return new String(chars);
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        String input1 = "IceCreAm";
        String result1 = sol.reverseVowels(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);

        String input2 = "leetcode";
        String result2 = sol.reverseVowels(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);
    }
}
