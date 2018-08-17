package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class HashTableRansom {

	public static void main(String[] args) {
		String magazine[] = {"give" , "me", "one","grand","today","night"};
		String note[] = {"give", "me1","today","night"};
		
	checkMagazine(magazine,note);
		
	}

	public static void checkMagazine(String[] magazine, String[] note) {
		
		if(note.length>magazine.length){
			System.out.println("No");
			return;
		}
		
		Map<String, Integer> word = new HashMap<String,Integer>();
		
		for(String s: magazine){
			if(!word.containsKey(s)){
				word.put(s, 1);
			}else{
				word.put(s, word.get(s)+1);
			}
		}
		
		
		boolean isValid = true;
		for(String s: note){
			if(word.containsKey(s)){
				word.put(s, word.get(s)-1);
				if((word.get(s))==0)
					word.remove(s);
			}else {
				isValid = false;
				break;
			}
		}
		if(isValid)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
