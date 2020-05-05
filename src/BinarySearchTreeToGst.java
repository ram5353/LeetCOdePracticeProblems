//import com.sun.source.tree.Tree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class BinarySearchTreeToGst {
//
//
//}
//
//class Solution9 {
//    public TreeNode bstToGst(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode presentNode = queue.remove();
//            System.out.println(presentNode.val);
//            list.add(presentNode.val);
//            if (presentNode.left != null) {
//                queue.add(presentNode.left);
//            }
//            if (presentNode.right != null) {
//                queue.add(presentNode.right);
//            }
//        }
//    }
//
//}
//
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//}
