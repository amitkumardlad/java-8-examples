package code.java8.interviewtask;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

public class WordMachine {

	public static final int MAX = 0xFFFFF;
	public static final int MIN = 0;
	private static final Pattern NUMERIC = Pattern.compile("\\d+");
	private final Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		WordMachine machine = new WordMachine();
		System.out.println("Expected 1::" + machine.solution("1"));
		System.out.println("Expected 1::" + machine.solution("1 2 POP"));
		System.out.println("Expected 1::" + machine.solution("1 DUP POP"));
		System.out.println("Expected 2::" + machine.solution("1 1 +"));
		System.out.println("Expected 2::" + machine.solution("1 3 -"));
		System.out.println("Expected 7::" + machine.solution("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println("Expected -1::" + machine.solution(String.format("%d 1 +", 0xFFFFF)));
		System.out.println("Expected -1::" + machine.solution("1 0 -"));
		System.out.println("Expected -1::" + machine.solution("5 6 + -"));
	}
	
	public int solution(String S) {
		try {
			Arrays.stream(S.split(" ")).forEach(this::applyCommand);
			return pop();
		} catch (IllegalArgumentException e) {
			return -1;
		}
	}

	private void applyCommand(String s) {
		if (NUMERIC.matcher(s).matches()) {
			push(Integer.valueOf(s));
		} else if("POP".equals(s)){
			this.pop();
		} else if("DUP".equals(s)){
			this.dup();
		} else if("+".equals(s)){
			this.add();
		} else if("-".equals(s)){
			this.sub();
		}
	}

	private void push(int i) {
		withinRange(i);
		stack.push(i);
	}

	private int pop() {
		return stack.pop();
	}

	private void dup() {
		hasElements(1);
		push(stack.peek());
	}

	private void add() {
		hasElements(2);
		push(stack.pop() + stack.pop());
	}

	private void sub() {
		hasElements(2);
		push(stack.pop() - stack.pop());
	}

	private int hasElements(int i) {
		if (stack.size() < i) {
			throw new IllegalArgumentException("Too few elements available");
		}
		return i;
	}

	private int withinRange(int i) {
		if (i < MIN || i > MAX) {
			throw new IllegalArgumentException("Input under/overflow");
		}
		return i;
	}
}