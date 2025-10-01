public class MergeSort {
    public static void mergesort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int size1=mid-low+1;
        int size2=high-mid;
        int lArr[]=new int[size1];
        int rArr[]=new int[size2];

        for(int i=0;i<size1;i++){
            lArr[i]=arr[low+i];
        }
        for(int i=0;i<size2;i++){
            rArr[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<size1 && j<size2){
            if(lArr[i]<rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
         while(j<size2){
            arr[k]=rArr[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int[] arr={7,2,3,6,1,8,5};
        System.out.println("Before Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        
        mergesort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
    
}
