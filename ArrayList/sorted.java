import java.util.ArrayList;

public class sorted {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        boolean changed=true;
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(10);
        al.add(-1);
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size()-1-i;j++){
                if(al.get(j)>al.get(j+1)){
                    changed=false;
                    break;
                }
            }
        }
        
        if(changed){
            System.out.println("Array is sorted");  
        }
        else{
            changed=true;
            for(int i=0;i<al.size();i++){
                for(int j=0;j<al.size()-1-i;j++){
                    if(al.get(j)<al.get(j+1)){
                        changed=false;
                        break;
                    }
                }
            }
            if(changed){
                System.out.println("Array is sorted");
            }
            else{
                 System.out.println("Array is not sorted");
            }
            
        }


    }
    
}
