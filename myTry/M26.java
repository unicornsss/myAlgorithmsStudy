package myTry;

/**
 * Created by 羊 on 2019/3/19.
 */
public class M26 {
//    Remove Duplicates from Sorted Array
//    思路： 相当于在原数组上面更改内容 让前n个为不重复的内容
//    这个目前是个结束不了的循环， 没考虑好怎么结束  重点   i--
//    因为没有找到能够结束循环的方式，所以只能先用一个循环判断出剩下的个数，然后将数组处理过足够的次数
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = nums.length;
        int m = 0;
//        nums[count+1] != nums[max-1]
//        停止的条件。
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j] == nums[j+1]){
                count--;
            }
        }
        while(m < nums.length ){
            if(nums[i] == nums[i+1]){
                for (int j = i+1; j < nums.length -1; j++) {
                    nums[j] = nums[j+1];
                }
            }else{
                i++;
            }
            m++;
        }
        return count;
    }

    public int removeDuplicates1(int[] nums) {
        int i = 0;
        int count = nums.length;
        while( i < nums.length-1){
            if(nums[i] == nums[i+1]){
                count--;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        M26 m = new M26();
//        int in [] = {0,0,1,1,1,2,2,3,3,4,5};
        int in [] = {0,0,1,1,1,2,2,3,3,4};
        int res = m.removeDuplicates(in);
        System.out.println(res);
    }
}
