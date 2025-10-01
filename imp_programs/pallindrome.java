public class pallindrome {
    public static void main(String[] args) {
        int num=122;
        int sum=0;
        int temp=num;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }
    
}
