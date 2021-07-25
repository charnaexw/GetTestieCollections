package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestStack2(){
        Stack<String> stack=new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }
    @Test
    public void TestStack3(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String actual=stack.peek();
        Assert.assertEquals("Hello world", actual);
    }


    // Make a bigger test exercising more Stack methods.....
}
