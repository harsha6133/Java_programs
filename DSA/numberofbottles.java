public class numberofbottles {
    public static void main(String[] args) {
        int num_bottles=15;
        int exchange=4;

        int drink=0;
        int total=0;

        while(num_bottles>0){
            total+=num_bottles;
            num_bottles+=drink;
            drink=num_bottles%exchange;
            num_bottles/=exchange;
        }

        System.out.println(total);
    }
    
}
