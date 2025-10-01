public class FindEvenDigits {
    public static void main(String[] args) {
        int[] arr={1,22,2,7568,3,33,44,888888};

        int ans=findeven(arr);
        System.out.println(ans);
    }

    static int findeven(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isevendigit(arr[i])){
                count++;
            }
        }

        return count;

    }

    static boolean isevendigit(int i) {
        int count=0;
        while(i>0){
            i/=10;
            count++;
        }
        if(count%2==0) {
            return true;
        }
        return false;
        
    }

    
    
}
