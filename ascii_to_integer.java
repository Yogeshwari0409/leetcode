
public class Solution {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int length = s.length();

        // 1. Skip leading whitespaces
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }

        // 2. Check for sign
        if (index < length) {
            if (s.charAt(index) == '+') {
                sign = 1;
                index++;
            } else if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            }
        }

        // 3. Convert digits to number
        while (index < length) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') break;

            int digit = c - '0';

            // 4. Check for overflow/underflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
