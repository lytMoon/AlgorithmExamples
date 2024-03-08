import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] num = {2, 3, 1, 4, 6, 5, 4, 7};

        int[] num1 = {2, 7, 11, 15};
//        System.out.println(test(num));
//        System.out.println(findDuplicate(num));
//        System.out.println(Arrays.toString(twoSum(num1, 9)));


        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode tail = new ListNode(4);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;


//        reverseList(head);


    }


    /**
     * 寻找数组重复的数字。
     */

    public static int test(int[] num) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    result = num[i];
                    break;
                }
            }
        }
        return result;
    }


    public static int findDuplicate(int[] nums) {
        int result = 0;
        if (nums == null) {
            return 0;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {

                if (nums[i - 1] == i) {
                    break;
                }
                if (nums[i - 1] != i) {
                    if (nums[i - 1] == nums[nums[i - 1] - 1]) {
                        result = nums[i - 1];
                        break;
                    } else {
                        int temp = nums[nums[i - 1] - 1];
                        nums[nums[i - 1] - 1] = nums[i - 1];
                        nums[i - 1] = temp;
                    }
                }


            }

        }
        return result;
    }

    /**
     * 两数和
     * 使用hashmap一边存，一边查（可以反着），空间换时间
     */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int[] result = {hashMap.get(target - nums[i]), i};
                return result;
            } else {
                hashMap.put(nums[i], i);
            }

        }
        return nums;
    }


    /**
     * 相交链表  利用hashset查找时间复杂度 0（1）
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;
        ListNode result = null;

        Set<ListNode> hashSet = new HashSet<ListNode>();
        while (listA != null) {

            hashSet.add(listA);
            listA = listA.next;
        }

        while (headB != null) {
            if (hashSet.contains(headB)) {
                return headB;
            }

            headB = headB.next;
        }

        return null;
    }

    /**
     * 使用双指针法
     */

//    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
//        ListNode listA = headA;
//        ListNode listB = headB;
//        if (listA==null||listB==null){
//            return null;
//        }
//
//    }
//    public static ListNode reverseList(ListNode head) {
//
//
//    }



}

