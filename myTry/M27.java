package myTry;

/**
 * Created by 羊 on 2019/3/20.
 */
public class M27 {
//    Remove Element 移出元素
//        更换思路 双指针 两头往中间走 当后面的大于前面的指针时就可以停止
    public int removeElement(int[] nums, int val) {
        if( nums == null ) return 0;
//        if( nums.length == 1 && nums[0] == val) return 0;
        int len = nums.length - 1;
        int t = 0;
        int res = 0;
        while(t <= len){
            if( nums[len] == val){
//                System.out.println(nums[len]+"nums[len]");
                len--;
                res++;
                continue;
            }
            if(nums[t] == val){
                nums[t] = nums[len];
                nums[len] = val;
                res++;
                len--;
            }
            t++;
        }
//        System.out.println("res"+res);
        return nums.length - res;
    }
    public static void main(String[] args) {
        M27 m = new M27();
//        int in[] = { 0,1,2,2,3,0,0,2,4,2,4,5,2 };
        int in[] = {1};
//        int in[] = { 3,2,2,3};
        int res = m.removeElement(in ,1);
        System.out.println(res);
        for (int i : in) {
            System.out.print(i+"-");
        }
        System.out.println();
    }

//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == val){
//                while( nums.length - flag - 1 > i ){
//                    if(nums[i] == nums[nums.length - flag -1]){
//                        flag++;
//                    }else{
//
//                    }
//                }
//            }
//        }

    //if(nums[i] == val){
//        while(nums[x2] == val){
//        x2 --;
//        if( nums[x2]!= val){
//        int t = nums[i];
//        nums[i] = nums[x2];
//        nums[x2] = t;
//        break;
//        }
//        }
//        }
}
