import java.util.ArrayList;

public class duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4,2,3,4,4,4};
        ArrayList al=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>=2){
                
                    if(al.contains(arr[i])){
                        break;
                    }
                    else{
                        al.add(arr[i]);
                        System.out.println(arr[i]);
                    }
                }
                   
            }
            
            
        }
    }
    
}
