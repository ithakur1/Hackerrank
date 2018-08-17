package isUnique;

import java.util.Scanner;

public class isUnique {
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		isUnique uniq = new isUnique();
		if(isUnique.isTheStringUnique(s)){
			System.out.println("The string "+ s + " has all the unique characters");
		}else {
			System.out.println("The string "+s+ " has duplicate characters");
		}
	}

	public static boolean isTheStringUnique(String s) {
		if(s.length() > 128){
			return false;
		}
		boolean chars[] = new boolean[128];
		for(int i = 0;i<s.length();i++){
			int val = s.charAt(i);
			if(chars[val]){
				return false;
			}else
				chars[val] = true;
		}
		return true;
		
	}

}
