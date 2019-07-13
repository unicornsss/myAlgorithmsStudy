package futest.datastructure;

/**
 * Created by 羊 on 2019/7/10.
 */
public class Search {
    //循环实现
    public static int binarySearch(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(x == arr[mid]){
                return mid;
            }else if(x< arr[mid]){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    //递归实现:
    //递归实现二分查找
    public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;
        if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
            return -1;
        }
        if(data <dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
        }else if(data>dataset[midIndex]){
            return binarySearch(dataset,data,midIndex+1,endIndex);
        }else {
            return midIndex;
        }
    }

}
