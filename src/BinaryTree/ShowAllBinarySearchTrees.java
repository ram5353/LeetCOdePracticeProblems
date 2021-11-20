package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ShowAllBinarySearchTrees {

    public static void main(String[] args) {
        System.out.println(generateTrees(3));
    }

    public static List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }

    public static List<TreeNode> helper(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (start == end) {
            list.add(new TreeNode(start));
        }
        if (start < end) {
            for (int i = start; i <= end; i++) {
                List<TreeNode> leftTreeNodes = helper(start, i - 1);
                List<TreeNode> rightTreeNodes = helper(i+1, end);
                for (TreeNode left: leftTreeNodes) {
                    for (TreeNode right: rightTreeNodes) {
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        list.add(root);
                    }
                }
            }
        }
        return list;
    }
}
