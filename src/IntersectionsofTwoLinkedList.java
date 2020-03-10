import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionsofTwoLinkedList {


    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        a.next = new ListNode(1);
        a.next = new ListNode(8);
        a.next = new ListNode(4);
        a.next = new ListNode(5);

        b.next = new ListNode(0);
        b.next = new ListNode(1);
        b.next = new ListNode(8);
        b.next = new ListNode(4);
        b.next = new ListNode(5);
        Solution s = new Solution();
        System.out.println(s.getIntersectionNode(a,b));
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA, pb;
        while (pa != null) {
            for (pb = headB; pb != null; pb = pb.next) {
                if (pa == pb) {
                    return pa;
                }
            }
            pa = pa.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> hashset = new HashSet<>();
        ListNode pa = headA;
        ListNode pb;
        while (pa != null) {
            hashset.add(pa);
            pa = pa.next;
        }
        if (hashset.isEmpty()) {
            return null;
        }
        for (pb=headB;pb!=null; pb = pb.next ) {
              if (hashset.contains(pb)) {
                  return pb;
              }
        }
        return null;
    }
}
