import java.util.Stack;

public class SortArrayWithStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,12,9,6};
		sortArrayWithStacks(arr);

	}

	public static void sortArrayWithStacks(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Stack<Integer> input = new Stack<Integer>();
		
		for(int i=0;i<n;i++){
			input.push(arr[i]);
		}
		
		Stack<Integer> sortStack = sortStack(input);
		
		while(!sortStack.isEmpty()){
			System.out.println(sortStack.pop());
		}
	}

	public static Stack<Integer> sortStack(Stack<Integer> input) {
		// TODO Auto-generated method stub
		Stack<Integer> tempStack = new Stack<Integer>();
		
		while(!input.isEmpty()){
			int temp = input.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek()>temp ){
				input.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		
		
		return tempStack;
	}

}
