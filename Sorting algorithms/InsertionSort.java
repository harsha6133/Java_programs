public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,2,3,6,1,8,5};
        int key=0;
        System.out.println("Before Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int j=0;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
        System.out.println("After Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
