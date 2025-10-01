public class findsmall {
    public static void main(String[] args) {
        char[] ch={'c','f','j'};
        char target='k';

        char res=smallchar(ch,target);

        System.out.println(res);
    }

    private static char smallchar(char[] ch, char target) {
        
        int start=0;
        int end=ch.length-1;

        if(target>ch[ch.length-1]){
            return ch[0];
        }
        while(start<=end){
            int mid=(start+end)/2;

            if(ch[mid]==target){
                return ch[mid];
            }
            else if(ch[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return ch[start];
    }
    
}
