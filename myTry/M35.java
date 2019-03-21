package myTry;

/**
 * Created by 羊 on 2019/3/21.
 */
public class M35 {
//    Search Insert Position
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] == target){
                return i;
            }else if(nums[i] < target){
                if(i == nums.length-1){
                    return i+1;
                }else if(nums[i+1]> target){
                    return i+1;
                }
            }else {
                return 0;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        M35 m=new  M35();
        int in[] = {0,1,3,5,6};
        int res = m.searchInsert(in,4);
        System.out.println(res);
    }
}
