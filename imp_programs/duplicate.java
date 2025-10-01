public class duplicate {
    public static void main(String[] args) {
        String str="javvaaa";
        boolean[] b=new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(b[i]) continue;
            int c=1;
            for(int j=i+1;j<str.length();j++){
                
                if(str.charAt(i)==str.charAt(j)){
                    c++;
                    b[j]=true;
                }
            }
            if(c>1){
                System.out.println(str.charAt(i)+" "+c);
            }
            

        }

    }
    
}
