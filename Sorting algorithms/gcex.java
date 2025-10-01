class student{
    /* public void finalize() throws Throwable{
        System.out.println("finalize");
    }
 */
}
public class gcex {
    
    public static void main(String[] args) {
        student s=new student();
        Runtime r=Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        // student s1=new student();
        student s2=new student();
        student[] s1=new student[100000000];
        for(int i=0;i<s1.length;i++){
            s1[i]=new student();
            s1[i]=null;

        }
        System.out.println(r.freeMemory());
        System.gc();
        System.out.println(r.freeMemory());
        
    }
    
}
