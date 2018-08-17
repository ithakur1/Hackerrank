import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		
		reverseSTring(s);

	}

	public static void reverseSTring(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> input = new Stack<Character>();
		
		for(int i=0;i<s.length();++i){
			if(s.charAt(i) != ' '){
				input.push(s.charAt(i));
			}else{
				while(!input.isEmpty()){
					System.out.print(input.pop());
				}
				System.out.print(" ");
			}
				
			
		}
		//As there is no " " after the last word. it will not be popped as there isn't anymore letter.
		while (input.empty() == false) {
	        System.out.print(input.pop());
	         
	    }
	}

}
