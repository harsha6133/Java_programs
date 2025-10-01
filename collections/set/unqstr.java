import java.util.HashSet;

public class unqstr {
    public static void main(String[] args) {
        String s="duplicate";
        String t=s.toLowerCase();
        HashSet hs=new HashSet<>();
        for(int i:t.toCharArray()){
            hs.add((char)i);
        }
        System.out.println(hs.size());
    }
    
}
