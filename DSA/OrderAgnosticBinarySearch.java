public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={10,9,8,7};
        int target=8;

        System.out.println(orderAgnostic(arr,target));
    }

    public static int orderAgnostic(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;

        boolean isasc=arr[start]<arr[end];

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(isasc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return -1;
        

    }
    
}
