package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchBST {

    public static void main(String[] args) {

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode present = queue.remove();
            System.out.print(present.val + " ");
            if (present.val == val) {
                result = present;
                return result;
            }
            if (present.left != null) {
                queue.add(present.left);
            }
            if (present.right != null) {
                queue.add(present.right);
            }
        }
        return result;
    }

    //Best Solution
    public static TreeNode searchBinarySearchTree(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBinarySearchTree(root.right, val);
        }
        return searchBinarySearchTree(root.left, val);
    }
}
