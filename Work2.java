import java.lang.reflect.Array;
import java.util.Arrays;

public class Work2 {
    private static final String arr = null;
    public static void main(String[] args) {
        int []arr = {2,5,6,8,4,2,2,5,6,9};
        int []uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
        
    }
    public static int[] removeDuplicates(int[]arr){
        if(arr==null || arr.length<=1){
            return arr;
        }
          Arrays.sort(arr);
    int[]temp = new int[arr.length];
    int j = 0;
    for(int i = 0 ; i<arr.length-1;i++){
        if (arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
        }
    }
    temp[j++]=arr[arr.length-1];
    int[]result = new int[j];
    for(int i = 0; i<j; i++){
        result[i]=temp[i];
    }
    return result;
    }
}