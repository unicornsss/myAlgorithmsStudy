package futest.datastructure;

/**
 * Created by 羊 on 2019/7/10.
 */
public class HeapSort {
    public static void heapSort(int[] arr){
        heapInsert(arr);
        int size = arr.length;
//        调整位置
        while(size > 1){
//            固定最后一个数
            swap(arr,0,size-1);
            size--;
            heapify(arr,0,size);
        }
    }
    public static void heapInsert(int[]  arr){
        for (int i = 0; i < arr.length; i++) {
            int current = i;
            int father = (i-1)/2;
            while(arr[current] > arr[father]){
                swap(arr,current,father);
                current = father;
                father = (current-1)/2;
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int t = arr[y];
        arr[y] = arr[x];
        arr[x] = t;
    }
    public static void heapify(int[] arr,int index,int size){
        int left = 1;
        int right = 2;
        while(left < size){
            int max;
            if(arr[left]<arr[right] && right <size){
                max = right;
            }else{
                max = left;
            }
//            比较父节点和孩子中较大的值
            if(arr[index] > arr[max]){
                max = index;
            }
            if(index == max){
                break;
            }
            swap(arr,max,index);
            index = max;
            left = 2*index+1;
            right = 2*index+2;
        }
    }
}
