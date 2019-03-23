package myTry;

/**
 * Created by 羊 on 2019/3/22.
 */
public class M53 {
//    53. Maximum Subarray
//    类似于排列组合，n个长度可以讨论从 n-1,n-2.....1个长度 所有的最大的和
    public int maxSubArray(int[] nums) {
        //暴力破解版本，得到了超时警告    	Time Limit Exceeded
        int max = nums[0];
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if(max <= sum){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        M53 m = new M53();
        int in[] = {-2,1,-3,4,-1,2,1,-5,4,6};
        int res = m.maxSubArray(in);
        System.out.println(res);
    }
}
