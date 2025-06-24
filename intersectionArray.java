import java.util.*;

public class intersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Use a set to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another set to store the intersection
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert result set to int array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Intersection: " + Arrays.toString(intersection(nums1, nums2)));

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Intersection: " + Arrays.toString(intersection(nums3, nums4)));
    }
}