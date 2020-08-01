package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Solution11 obj = new Solution11();
        for (int i=0;i<=10;i++) {
            obj.insert(i*10);
        }
        System.out.println(obj.preorderTraversal(obj.root));
        obj.preOrder(obj.root);
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution11 {
    TreeNode root;
    Solution11() {
        this.root = null;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

    public void insert(int value) {
        TreeNode newnode = new TreeNode();
        newnode.val = value;
        if (root == null) {
            root = newnode;
            System.out.println("Successfully inserted");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode presentnode = queue.remove();
            if (presentnode.left == null) {
                presentnode.left = newnode;
                return;
            } else if (presentnode.right == null) {
                presentnode.right = newnode;
                return;
            } else {
                queue.add(presentnode.left);
                queue.add(presentnode.right);
            }
        }
    }

    void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

}
