/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0, n = traversal.length();

        while (i < n) {
            int depth = 0;

            // Count dashes to determine depth
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            // Extract node value
            int numStart = i;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                i++;
            }
            int value = Integer.parseInt(traversal.substring(numStart, i));

            // Create new node
            TreeNode node = new TreeNode(value);

            // Root node case
            if (stack.isEmpty()) {
                stack.push(node);
                continue;
            }

            // Ensure stack has correct depth
            while (stack.size() > depth) {
                stack.pop();
            }

            // Attach as left or right child
            TreeNode parent = stack.peek();
            if (parent.left == null) {
                parent.left = node;
            } else {
                parent.right = node;
            }

            // Push current node onto stack
            stack.push(node);
        }

        // The root is at the bottom of the stack
        while (stack.size() > 1) {
            stack.pop();
        }

        return stack.peek();
    }
}
