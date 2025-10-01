// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Arm {
    public static void main(String[] args) {
        int num=30;
        int temp=num;
        int count=0;
        int sum=0;
        int originalsum=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        while(num!=0){
            int digit=num%10;
            int i=1;
            int pow=1;
            while(i<=count){
                pow*=digit;
                i++;
                
            }
            sum+=pow;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==originalsum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong");
        }

    }
} {
    
}
