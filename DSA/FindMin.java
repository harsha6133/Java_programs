public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,4,-5,15,6,30,8};
        System.out.println(findmin(arr));
    }
    static int findmin(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
