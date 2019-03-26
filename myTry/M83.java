package myTry;

/**
 * Created by 羊 on 2019/3/26.
 */
public class M83 {
//    83. Remove Duplicates from Sorted List

//    /**
//     * Definition for singly-linked list.

    //如果等于下一个的值，就跳过下一个，应该采用递归的方式写。循环始终有问题。
//    public ListNode deleteDuplicates1(ListNode head) {
//        int val ;
//        ListNode mid = new ListNode(0);
//        mid.val = head.val;
//        if(head.next!=null){
//            val = head.val;
//            if( val == head.next.val){
//                if(head.next.next!= null){
//                    mid.next = deleteDuplicates(head.next.next);
//                }
//            }
//            else {
//                mid.next = deleteDuplicates(head.next);
//            }
//            return mid;
//
////            head = head.next;
//        }else{
//            return head;
//        }
//    }

//    public ListNode deleteDuplicates2(ListNode head) {
//        int val = head.val;
//        if (head.next != null) {
//            if (val == head.next.val) {
//                if (head.next.next != null) {
//                    head.next = head.next.next;
//                    head = deleteDuplicates(head);
////                head.next = deleteDuplicates(head.next);
//                } else {
//                    head.next.next = null;
//                }
//            } else {//不等于 直接返回
//                head = deleteDuplicates(head.next);
//            }
//            return head;
//        } else {
//            return null;
//        }
//    }
    public ListNode deleteDuplicates3(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
    //当第一个等于第二个是，2 = 2.next 如果2为空则1 的下一个为空。
    // 不相等的话，1的下一个就是2 分别将指针往后移一位。、
    // 类似两个指针 runtime 错误
        while(ptr2!=null)
        {
            if (ptr1.val == ptr2.val) {
                ptr2 = ptr2.next;
                if (ptr2 == null)
                    ptr1.next = null;
            } else {
                ptr1.next = ptr2;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }
        return head;
    }
    public ListNode deleteDuplicates4(ListNode head) {
        ListNode list = head;
        while(list!= null){
            if(list.next!=null){
                if(list.val == list.next.val){
                    list.next = list.next.next;
                }else{
                    list = list.next;
                }
            }else {
                break;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        M83 m = new M83();
        ListNode list = new ListNode(1);
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(3);
        ListNode list5 = new ListNode(3);
        ListNode list6 = new ListNode(4);
        ListNode list7 = new ListNode(5);
        ListNode list8 = new ListNode(5);
        ListNode list9 = new ListNode(5);
        ListNode list10 = new ListNode(6);
        ListNode list11 = new ListNode(7);
        list.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;
        list8.next = list9;
        list9.next = list10;
        list10.next = list11;
        ListNode res = m.deleteDuplicates4(list);
        while(res!= null){
            System.out.println(res);
//            System.out.println("/n");
            res = res.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}