package s11;

import java.util.Stack;

public class S05 {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("사과");
        stack.push("바나나");
        stack.push("츄릅");
        stack.push("호잇");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    }
    
}
