package others;

/**
 * Created by 羊 on 2019/3/19.
 */
public class M21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //判断链表的是否为空
        if (l1 == null && l2 == null){
            return null;
        }

        ListNode mergeHead;
        if(l1 != null && l2 == null){
            mergeHead = l1;
            l1 = l1.next;
            //感觉有些多余，因为链表本来就是排好序的
        } else if(l1 == null && l2 != null){
            mergeHead = l2;
            l2 = l2.next;
        } else if(l1.val <= l2.val){
            mergeHead = l1;
            l1 = l1.next;
        } else {
            mergeHead = l2;
            l2 = l2.next;
        }

        mergeHead.next = mergeTwoLists(l1, l2);

        return mergeHead;
    }

//极简代码写法
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
//        如果l1大于l2 亮着交换位置，保证l1< l2，然后用一种处理方式解决，并且保证l1不会是空的 神一般的想法
//        相当于就在l1的基础上进行更改。
        if (l1 == null || (l2 != null && l1.val > l2.val)) {
            ListNode t = l1;
            l1 = l2;
            l2 = t;
        }
        if (l1 != null) l1.next = mergeTwoLists1(l1.next, l2);
        return l1;
    }
}
