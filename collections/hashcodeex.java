class temp{
    int i;
    temp(int i){
        this.i=i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+" ";
    }
}
public class hashcodeex {
    public static void main(String[] args) {
        temp t=new temp(11);
        System.out.println(t.hashCode());
    }
    
}
