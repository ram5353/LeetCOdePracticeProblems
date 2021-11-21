package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KthSmallestInBST {

    public static void main(String[] args) {

    }

    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> values = preorderTraversal(root);
        values.sort(Integer::compareTo);
        System.out.println(values.toString());
        return values.get(k);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

}
