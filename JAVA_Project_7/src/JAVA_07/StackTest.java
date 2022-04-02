package JAVA_07;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

