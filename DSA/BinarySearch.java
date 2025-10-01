public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        int target=8;
        int start=0;
        int end=arr.length-1;

        int res=binarysearch(arr,start,end,target);
        System.out.println(res);
    }

    public static int binarysearch(int[] arr, int start, int end, int target) {
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
        
    }
    
}
