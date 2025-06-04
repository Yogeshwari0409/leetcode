class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(s).reverse().toString();

        // Compare original and reversed
        return s.equals(reversed);
    }
}