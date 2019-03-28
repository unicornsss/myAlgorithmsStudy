package myTry;

import java.util.Arrays;

/**
 * Created by 羊 on 2019/3/28.
 */
public class M88 {
    /*最开始想到的 ，浪费空间的写法，完全没有必要，只能说我比较辣鸡
    * */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x1 = 0;
        int x2 = 0;
        int t = 0;
        int num[] = new int[nums1.length];
        while(x1< m && x2< n){
            if(nums1[x1] > nums2[x2]){
                num[t] = nums2[x2];
                x2++;
            }else{//等于划分到这里
                num[t] = nums1[x1];
                x1++;
            }
            t++;
        }
        while(x1 < m){
            num[t++] = nums1[x1++];
        }
        while(x2 < n){
            num[t++] = nums2[x2++];
        }
        System.arraycopy(num, 0, nums1, 0, nums1.length);
    }
    /*将0 也算进去排序了*/
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        M88 m = new M88();
        int x1[] = {1,3,5,0,0,0};
        int x2[] = {2,5};
        m.merge(x1,3,x2,2);
        for (int i : x1) {
            System.out.print(i + " ");
        }
    }
}
