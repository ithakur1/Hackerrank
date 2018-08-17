import java.util.Stack;

public class DeleteMidStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> input = new Stack<Character>();
		
		input.push('1');
		input.push('2');
		input.push('3');
		input.push('4');
		input.push('5');
		input.push('6');
		input.push('7');
		
		deleteMid(input, input.size(),0);
		
		while(!input.empty()){
			System.out.print(input.pop());
		}
		}

	public static void deleteMid(Stack<Character> input, int size, int i) {
		
		if(input.empty() || size == i){
			//System.out.println("Stack is empty");
			return;
		}
		
		char x = input.pop();
		deleteMid(input, size, i+1);
		
		if(i != size/2)
			input.push(x);
		/*if (st.empty() || curr == n)
            return;
         
        // Remove current item
        char x = st.pop();
         
        // Remove other items
        deleteMid(st, n, curr+1);
         
        // Put all items back except middle
        if (curr != n/2)
            st.push(x);*/
		
		
	}

}
