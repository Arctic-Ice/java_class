import org.junit.Test;

import java.util.Stack;

public class testStack {
    /**
     * 只要一个构造函数Stack()
     */
    @Test
    public void testConstruct() {
        Stack stack = new Stack();
        Stack<String> stack1 = new Stack<>();
    }

    @Test
    public void testEmpty() {
        Stack stack = new Stack();
        boolean boo = stack.isEmpty();
        System.out.println(boo); // true
    }

    @Test
    public void testInsertElementAt() {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.insertElementAt("c", 0);
        System.out.println(stack); // true
    }

    @Test
    public void testPush() {
        Stack<Object> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        System.out.println(stack); // [a, b]
    }

    /**
     * public synchronized E pop()
     */
    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        Object data = stack.pop(); // b
        System.out.println(data);
//        stack.pop();  // 异常
    }

    /**
     * 获取栈顶元素,不抛出
     */
    @Test
    public void testPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        Object data = stack.peek();
        System.out.println(data); // a
        data = stack.peek();
        System.out.println(data); // a
    }

    /**
     * 查询数据，有返回数据下标，没有返回-1
     */
    @Test
    public void testSearch() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        Object data = stack.search("c");
        System.out.println(data); // a
    }
}
