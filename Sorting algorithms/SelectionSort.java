public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,2,3,6,1,8,5};
        int minindex=-1;
        System.out.println("Before Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minindex]>arr[j])
                    minindex=j;
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
