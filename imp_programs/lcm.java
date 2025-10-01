import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int a=3;
        int b=350;
        int lcm=Math.max(a, b);
        /* Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;

        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0){
                gcd=i;
                
            }
        }
        int lcm=(n1*n2)/gcd;
        System.out.println(lcm); */
        /* while (temp==0) {
            if (lcm % a == 0 && lcm % b == 0) {
                temp=1;
                break;
            }
            lcm++;
        } */

        for(int i=1;i<=lcm;i++){
            if(lcm % a==0 && lcm % b ==0){
                break;
            }
            lcm++;
        }
        System.out.println("lcm "+lcm);
        int gcd=(a*b)/lcm;
        System.out.println("gcd "+gcd);
    }
    
}
