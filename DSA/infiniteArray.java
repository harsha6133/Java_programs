public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={2,5,7,10,60,77,90,140,160};
        int target=10;

        System.out.println(ans(arr,target));
        
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;

            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr, start, end, target);
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
