package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {

    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public static boolean validate(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        }
        if (max != null && root.val >= max || min != null && root.val <= min ) {
            return false;
        } else {
            return validate(root, root.val, min) && validate(root, max, root.val);
        }
    }

}
