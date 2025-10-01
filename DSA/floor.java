public class floor {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,10};

        int target=7;

        int ans=flooring(arr,target);
        System.out.println(ans);
    }

    public static int flooring(int[] arr,int target){
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
        return arr[end];
    }
    
}
