package futest.datastructure;

import java.util.Arrays;

/**
 * Created by 羊 on 2019/7/10.
 */
public class sort {
    //冒泡排序
    public static int[] bubbleSort(int[] array){
        if(array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array;
    }

    //选择排序
    public static int[] selectSort(int[] array){
        if(array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int t = array[min];
            array[min] = array[i];
            array[i] = t;
        }
        return array;
    }

    //插入排序
    public static int[] insertSort(int[] array){
        if(array.length==0){
            return array;
        }
        int temp;
        int target;
        for (int i = 1; i < array.length; i++) {
            temp = i;//i = 1 i-1 = 0  从最开始的开始比较 要小于最开始扥
            target = array[i];
//            分别与之进行比较，吧这个数的位置空出来，赋值操作是在不停的移位
            while ( temp > 0 && target < array[temp-1]){
                array[temp] = array[temp-1];
                temp--;
            }
            array[temp] = target;
        }
        return array;
    }
    //插入排序
    public static int[] insertSort1(int[] array){
        if(array.length==0){
            return array;
        }
        int flag;
        for (int i = 0; i < array.length; i++) {
            flag = array[i+1];
            int temp = i;
            while(temp>=0 && flag < array[temp]){
                array[temp+1] = array[temp];
                temp --;
            }
            array[temp+1] = flag;
        }
        return array;
    }
    //希尔排序
    public static int[] shellSort(int[] array){
        if(array.length==0){
            return array;
        }
        int len = array.length;
        int temp,gap = len/2;
//        gap = 2;
        while (gap > 0){
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while(preIndex >= 0 && array[preIndex] > temp){
                    array[preIndex+gap] = array[preIndex];
                    preIndex = preIndex-gap;
                }
                array[preIndex+gap] =temp;
            }
            gap = gap/2;
        }
        return array;
    }

    //归并排序
    public static int[] mergeSort(int[] array){
        if(array.length < 2) return array;
        int mid  = array.length/2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        int[] l = mergeSort(left);
        int[] r = mergeSort(right);
        return merge(l,r);
    }
    public static int[] merge(int[] left,int[] right){
        int[] result = new int [left.length+right.length];
        for (int index = 0,i = 0,j = 0; index < result.length; index++) {
            if( i >= left.length)//只有right有值，处理只剩一个的情况
                result[index] = right[j++];
            else if( j>= right.length)
                result[index] = left[i++];
            else if( left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


//快速排序
    public static void quick(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low > high) return;
        i = low;j = high;
        temp = arr[low];
        while(i<j){
            while(arr[j] >- temp&&i<j ){
                j--;
            }
            while(arr[i] <= temp && i<j){
                i++;
            }
            if(i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quick(arr,low,j-1);
        quick(arr,j+1,high);
    }

//    public static void heapSort(int[] array){
//        for (int i = array.length/2-1; i >= 0; i-) {
//
//        }
//    }

    public static void main(String[] args) {
        int[] a = {1,11,15,5,2,12,10,3,8,7};
//        int[] b = mergeSort(a);
        quick(a,0,a.length-1);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
