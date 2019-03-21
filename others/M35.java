package others;

/**
 * Created by 羊 on 2019/3/21.
 */
public class M35 {
//    思路：两个指针的思想，将两头往中间走，如果本数组中存在该数，则在两头碰上之前就应该找到位置
//    当大和小的两边碰上的时候，表示这个位置后面的位置就应该是应该在的位置
    public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        M35 m=new  M35();
        int in[] = {0,1,3,5,6};
        int res = m.searchInsert(in,4);
        System.out.println(res);
    }
}
