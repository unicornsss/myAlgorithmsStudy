package others;

/**
 * Created by 羊 on 2019/3/22.
 */
public class M53 {
//    public static int maxSubArray(int[] arr) {
//        return recursion(arr, arr.length/2, 0, arr.length-1);
//    }

//    private static int recursion(int[] arr, int base, int leftLimit, int rightLimit){
//        // 设置初始值，避免负数时出现错误
//        int leftMax = arr[leftLimit];
//        int rightMax = arr[rightLimit];
//        int max = arr[base];
//
//        if(base-leftLimit <=1 && rightLimit-base <=1){
//            max = max > leftMax ? max : leftMax;
//            max = max > rightMax ? max : rightMax;
//            return max;
//        }
//
//        int leftSum = 0;
//        for(int i=base; i>=leftLimit; i--){
//            leftSum+=arr[i];
//            if(leftMax < leftSum){
//                leftMax = leftSum;
//            }
//        }
//
//        int rightSum = 0;
//        for(int j=base; j<=rightLimit; j++){
//            rightSum +=arr[j];
//            if(rightMax < rightSum){
//                rightMax = rightSum;
//            }
//        }
//
//        max = leftMax + rightMax - arr[base];
//        int searchLeft = searchCaculate(arr, (leftLimit+base)/2, leftLimit, base-1);
//        int searchRight = searchCaculate(arr, (base+rightLimit)/2, base+1, rightLimit);
//
//        max = max > searchLeft ? max : searchLeft;
//        max = max > searchRight ? max : searchRight;
//
//        return max;
//    }
    public static void main(String[] args) {
        M53 m = new M53();
        int in[] = {-2,1,-3,4,-1,2,1,-5,4,6};
//        int res = m.maxSubArray(in);
//        System.out.println(res);
    }
}
