public class RotationCount {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,1,2,3};
        int ans=rotationcount(arr);
        System.out.println(ans);
    }

    private static int rotationcount(int[] arr) {
        
        int pivot=findpivot(arr);

        if(pivot==-1){
            return 0;
        }
        return pivot+1;
    }

    private static int findpivot(int[] arr) {
        
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
}
