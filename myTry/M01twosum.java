package myTry;

/**
 * Created by 羊 on 2019/3/16.
 */
public class M01twosum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] x = {2,7,9,11};
        M01twosum xx = new M01twosum();
        int res[] = xx.twoSum(x,9);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if( nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
