public class freq{
    public static void main(String[] args) {
        String str="hello java ";
        int[] freq1=new int[150];
        boolean[] check=new boolean[150];

        for(int i=0;i<str.length();i++){
            freq1[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(!check[ch]){
                System.out.println(str.charAt(i)+" "+freq1[str.charAt(i)]);
                check[ch]=true;
            }
            
        }

    }
    
}