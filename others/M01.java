package others;

import java.util.HashMap;

/**
 * Created by 羊 on 2019/3/16.
 */
public class M01 {
//    精简版
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

    public int[] twoSum2(int[] nums, int target) {
        //思路：通过map的key,value特点，将nums的内容分别定位在map中，利用map的特性。
        HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
        int res [] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if( hash.containsKey(x) && hash.get(x)!= i ){
                res[0] = i;
                res[1] = hash.get(x);
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] x = {2,7,2,11};
        M01 xx = new M01();
        int res[] = xx.twoSum(x, 4);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
