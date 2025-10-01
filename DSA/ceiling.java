public class ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int target=8;

        int ans=ceiling(arr,target);
        System.out.println(ans);
    }

    public static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;

            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
    
}
