import java.util.Stack;

public class SortStackTempStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(21);
		stack.add(95);
		stack.add(63);
		stack.add(12);
		stack.add(35);
		
		Stack<Integer> ans = sortStack(stack);
		
		while(!ans.isEmpty()){
			System.out.println(ans.pop());
		}
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> tempStack = new Stack<Integer>();
		
		while(!input.isEmpty()){
			int temp = input.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek() > temp){
				input.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		
		
		return tempStack;
	}

}
