import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String s1="Eleven plus two";
        String s2="Twelve plus one";

        


        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");
        }
        else{
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);


            System.out.println(Arrays.toString(ch1));
            System.out.println(Arrays.toString(ch2));

            if(Arrays.toString(ch1).equals(Arrays.toString(ch2))){
                System.out.println("Anagram");
            }
            else{
                System.out.println("not");
            }



            

            
        }


    }
    
}
