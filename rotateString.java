public class rotateString {
    public boolean rotateString(String s, String goal) {
        // Step 1: Check if lengths are different
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: Try all possible rotations
        for (int i = 0; i < s.length(); i++) {
            // Rotate string by moving leftmost character to right
            s = s.substring(1) + s.charAt(0);

            // Check if rotated string matches the goal
            if (s.equals(goal)) {
                return true;
            }
        }

        // Step 3: No rotation matched
        return false;
    }

    public static void main(String[] args) {
        rotateString obj = new rotateString();

        System.out.println(obj.rotateString("abcde", "cdeab")); // true
        System.out.println(obj.rotateString("abcde", "abced")); // false
    }
}
