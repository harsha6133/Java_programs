public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,5,1};
        int target=3;
        int ans=search(nums,target);

        System.out.println(ans);

    }



    private static int search(int[] nums, int target) {
        int pivot=findpivot(nums,target);
        System.out.println("pivot : "+pivot);
        if(pivot==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binarysearch(nums, target, 0, pivot-1);
        }
        else{
            return binarysearch(nums, target, pivot+1, nums.length-1);
        }
    }



    private static int binarysearch(int[] nums, int target, int start, int end) {
        

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
        

    }



    private static int findpivot(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]>=nums[start]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
        
    }

    
}
