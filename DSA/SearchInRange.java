public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,4,5,15,6,30,8};
        int target=15;
        int index=-1;
        int start=0;
        int end=2;

        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
    
}
