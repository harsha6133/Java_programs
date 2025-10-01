import java.lang.Math;
public class reverse {
    public static void main(String[] args) {
        int num=123;
        int reverse=0;
        int temp=num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
            
        }
        System.out.println(reverse);
    }
    
}
