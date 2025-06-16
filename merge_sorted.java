class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Loop through both lists until one is empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node
                list1 = list1.next;    // Move list1 forward
            } else {
                current.next = list2;  // Attach list2 node
                list2 = list2.next;    // Move list2 forward
            }
            current = current.next;    // Move current forward
        }

        // At least one of the lists is now null, so attach the remaining list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;  // The merged list starts after the dummy node
    }
}