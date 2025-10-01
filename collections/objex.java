public class objex {
    int x=10;
    class inner{
        public void m1(){
            System.out.println(x);
        }

    }
    public static void main(String[] args) {
        objex o=new objex();
        objex.inner i=o.new inner();
        i.m1();
    }
    
}
