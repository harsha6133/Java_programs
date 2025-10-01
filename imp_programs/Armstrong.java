import java.util.Scanner;
import java.lang.Math;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=0;
        int temp=num;
        int count=0;
        int sum=0;
        int originalsum=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        while(num!=0){
            digit=num%10;
            sum+=Math.pow(digit, count);
            num=num/10;
        }
        if(sum==originalsum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong");
        }
        sc.close();



        
        
    }
}