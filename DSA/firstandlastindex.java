public class firstandlastindex {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,7,8,10};
        int target=7;
        int[] ans={-1,-1};
        int start=binarysearch(arr, target,true);
        int end=binarysearch(arr, target,false);

        arr[0]=start;
        arr[1]=end;
        System.out.println(arr[0]+" "+arr[1]);

    }
    public static int binarysearch(int[] arr, int target,boolean firstocc) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                if(firstocc){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
        
        
    }


    
    
}
