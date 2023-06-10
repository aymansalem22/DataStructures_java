package P1;

import java.util.ArrayList;

public class Stack<T> {
	int top;
	int size;
	ArrayList<T> item;

	public Stack(int size) {
		this.size = size;
		this.item = new ArrayList<T>(size);
		this.top = -1;
	}

	public void push(T element) {
		if (top >= item.size()) {
			System.out.println("Stack full on push");
		}
		top++;
		item.add(top, element);
	}

	boolean isEmpty;

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;

	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("stack empty on pop");
		} else
			top--;
	}

	public void pop(T Element) {
		if (isEmpty()) {
			System.out.println("stack empty on pop");
		} else {
			Element = item.get(top);
			top--;
		}
	}

	public void getTop(T stackTop) {
		if (isEmpty()) {
			System.out.println("stack empty on getTop");
		} else {
			stackTop = item.get(top);
			System.out.println(stackTop);
		}
	}

	public void print() {
		System.out.print("[");
		for (int i = top; i >= 0; i--) {
			System.out.print(item.get(i) + " ");
		}
		System.out.println("]");
		System.out.println();
	}

	public static void main(String[] args) {
		Stack<Integer> i = new Stack<>(10);
		i.push(5);
		i.push(10);
		i.push(15);
		i.push(20);
		i.print();
		int y = 0;
		i.getTop(y);
		i.pop(); // delete the last element
		i.push(7);
		i.print();
		Stack<String> s = new Stack<>(10);
		s.push("ayman");
		s.push("David");
		s.pop();
		s.print();
		Stack<Double> d = new Stack<>(10);
		d.push(1.6);
		d.push(5.3);
		d.print();

	}

}
