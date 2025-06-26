import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // No duplicates
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test Case 1: " + containsDuplicate(nums1)); // Output: true

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + containsDuplicate(nums2)); // Output: false

        // Test Case 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test Case 3: " + containsDuplicate(nums3)); // Output: true
    }
}
