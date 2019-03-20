package others;

/**
 * Created by 羊 on 2019/3/20.
 */
public class M27 {
//    思路 直接将不等于 elem 的 A中的内容  从头 到尾放置，不用管相等的怎么移动，以及后面部分的布局。
    public int removeElement(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }

        return m;
    }
}
