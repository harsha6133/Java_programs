import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.indexOf("a"));
    }
    
}
