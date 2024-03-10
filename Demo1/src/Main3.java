public class Main3 {
    public static void main(String[] args) {
        int [] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        ListNode head = listNode1;
        swapPairs(head);



    }

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int finalMax=0;
        int nowMax=0;
        for(int i : nums){
            nowMax=Math.max(nowMax+i,i);
            finalMax=Math.max(finalMax,nowMax);
        }
        return finalMax;
    }

    /**
     *
     *
     *     两两交换链表中的节点
     *
     *
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head) {
        ListNode pre = null;
        pre.next= head;


        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode result = head.next;

        ListNode cur = head;

        int length = getLength(head);
        int cs = length/2;

        for(int i =1;i<=cs;i++){
            ListNode temp = cur.next.next;
            swapTwo(cur,cur.next);
            cur = temp;
        }
        return result ;

    }
    public static void swapTwo(ListNode left, ListNode right){
        ListNode temp = right.next;
        right.next=left;
        left.next=temp;
    }



    public static int getLength(ListNode head){
        int length =0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }


}
