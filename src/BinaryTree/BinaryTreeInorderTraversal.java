package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        Solution11 obj = new Solution11();
        for (int i=0;i<=10;i++) {
            obj.insert(i*10);
        }
    }
}

class Inorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}

