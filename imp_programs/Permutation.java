public class Permutation{
    public static void main(String[] args) {
        String str="abce";
        String str2="bcad";
        int[] freq=new int[256];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            freq[str2.charAt(i)]--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println("False");
            }
            
        }
        
        
        // System.out.println(freq['a']);

    }
}