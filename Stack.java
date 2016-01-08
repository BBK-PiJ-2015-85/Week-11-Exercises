public class Stack<N extends Number> {
	private N value;
	private Stack top;
	private Stack nextElement;
	
	
	public Stack() {
		top = null;
		nextElement = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(N newElement) {
		Stack addStack = new Stack();
		addStack.value = newElement;
		if (top == null) {
			top = addStack;
		} else {
			addStack.nextElement = top;
			top = addStack;
		}
	}
	
	public N pop() {
		if (top == null) {
			return null;
		} else{
			N result = (N)top.value;
			top = top.nextElement;
			return result;
		}
	}
	
	public String toString() {
		String str = "";
		Stack temp = top;
		while (temp != null) {
			str += temp.value;
			if (temp.nextElement != null) {
				str += ", ";
			}
			temp = temp.nextElement;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.isEmpty());
		
		//Stack<String> myStack2 = new Stack<>();
		
		//above does not compile
		
	}


}