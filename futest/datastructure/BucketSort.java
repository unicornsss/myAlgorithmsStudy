package futest.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 羊 on 2019/7/10.
 */
public class BucketSort {
    public static void bucketSort(int[] arr){
        ArrayList<LinkedList<Integer>> buckets = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            buckets.add(new LinkedList<Integer>());
        }
        for (int i : arr) {
            int index = i/10;
            insertSort(buckets.get(index),i);
        }
        int index = 0;
        for (LinkedList<Integer> bucket : buckets) {
            for (Integer i:bucket){
                arr[index++] = i;
            }
        }
    }

    public static void insertSort(List<Integer> bucket, int data) {
        ListIterator<Integer> it = bucket.listIterator();
        boolean insertFlag = true;
        while (it.hasNext()) {
            if (data <= it.next()) {
                it.previous(); // 把迭代器的位置偏移回上一个位置
                it.add(data); // 把数据插入到迭代器的当前位置
                insertFlag = false;
                break;
            }
        }
        if (insertFlag) {
            bucket.add(data); // 否则把数据插入到链表末端
        }
    }

    public static void main(String[] args) {
        int[] a = {14,32,15,45,68,31,46,78,58,99,74,25};
//        int[] a = {14 15 25 31 32 45 46 58 68 74 78 99 };
        bucketSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
