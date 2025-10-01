public class FindMax {
    public static void main(String[] args) {
        int[] arr={1,4,-5,15,6,30,8};
        System.out.println(findmax(arr));
    }
    static int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
}
