package others;

/**
 * Created by 羊 on 2019/3/19.
 */
public class M26 {
//    思路：首先 判空，空则返回0
//    相当于：将原来的当作一个标记，做一个新标价，
//    将相同的数字    取一个放进标记的下一个，正常的标记一直往下走。
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int n = 0;
        int o = 1;
        for( ;o < nums.length ; o++){
            if( nums[o] != nums[n]){
                n++;
                if(n != o){
                    nums[n] = nums[o];
                }
            }
        }
        return n+1;
    }
}
