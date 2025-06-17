public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';  // Convert char to int
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);  // Append binary digit (0 or 1)
            carry = sum / 2;         // Update carry
        }

        return result.reverse().toString();  // Reverse and return
    }

    public static void main(String[] args) {
        // Example test cases
        String a1 = "11";
        String b1 = "1";
        System.out.println("Sum of " + a1 + " + " + b1 + " = " + addBinary(a1, b1));  // Output: 100

        String a2 = "1010";
        String b2 = "1011";
        System.out.println("Sum of " + a2 + " + " + b2 + " = " + addBinary(a2, b2));  // Output: 10101
    }
}