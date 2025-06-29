class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorder(node.left, list);       // Left
        list.add(node.val);             // Root
        inorder(node.right, list);      // Right
    }
}