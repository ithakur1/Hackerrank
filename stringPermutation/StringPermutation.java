package stringPermutation;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string :");
		String s2 = sc.nextLine();
		
		boolean b = stringPermutation(s1,s2);
		System.out.println(b);
	}

	public static boolean stringPermutation(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length() != s2.length()){
			return false;
		}
		char arr[] = s1.toCharArray();
		char arr1[] = s2.toCharArray();
			
		Arrays.sort(arr);
		String ans1 = new String(arr);
		
		Arrays.sort(arr1);
		String ans2 = new String(arr1);
		
		if(ans1.equals(ans2)){
			return true;
		}else {
			return false;
		}
	
	}

}
