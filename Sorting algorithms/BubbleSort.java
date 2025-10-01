public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,2,3,6,1,8,5};
        System.out.println("Before Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
