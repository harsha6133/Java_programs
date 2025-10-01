public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,5,15,6,30,8};

        int target=16;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }  
        }
        System.out.println(index);
    }
    
}
