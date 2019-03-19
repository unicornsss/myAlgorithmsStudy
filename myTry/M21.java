package myTry;

/**
 * Created by 羊 on 2019/3/19.
 */
public class M21 {
//    Merge Two Sorted Lists 合并两个排序链表
//     * Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
//    思路：先判断是否为空，再通过递归的方式，始终取到下一个 直到为空。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null ) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode node = null;
        if(l1.val < l2.val){
            node = l1;
            node.next = mergeTwoLists(l1.next,l2);
            //递归的重点 反复取出这一个内容，调用本函数 ，链表
        }else{
            node = l2;
            node.next = mergeTwoLists(l1,l2.next);
        }
        return node;
    }
}
