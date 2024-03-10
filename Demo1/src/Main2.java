import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {


        /**
         * 合并链表
         *
         */
        // 生成1->4->5的链表
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        head1.next = node1;
        node1.next = node2;

        // 生成1->2->3->6的链表
        ListNode head2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(6);
        head2.next = node3;
        node3.next = node4;
        node4.next = node5;

        mergeTwoLists(head1, head2);


    }
//
//    /**
//     * 判断是不是回文数
//     *
//     * @return
//     */
//    public static boolean isHuiWen() {
//        HashSet<ListNode> set = new HashSet<>();
//
//
//    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }


        ListNode first = list1;
        ListNode second = list2;
        ListNode resultNode = new ListNode(-1);
        ListNode newNode = resultNode;

        while (first != null && second != null) {
            if (first.val < second.val) {
                newNode.next = first;
                first = first.next;
            } else {
                newNode.next = second;
                second = second.next;
            }

            newNode = newNode.next;

        }

        if (first == null) {
            newNode.next = second;
        }
        if (second == null) {
            newNode.next = first;
        }
        return resultNode.next;

    }


}
