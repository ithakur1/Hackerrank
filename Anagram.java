import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "abcdf";
		String s1 = "cdewwww";
		int ans = anagram(s,s1);
		System.out.println();
		System.out.println(ans);

	}
	
	public static int anagram(String s, String s1){
		
		int count1[] = new int[26];
		int count2[] = new int[26];
		
		for(int i=0;i<s.length();i++){
			count1[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s1.length();i++){
			count2[s1.charAt(i)-'a']++;
		}
		
		int result =0 ;
		for(int i=0;i<count1.length;i++){
			System.out.print(count1[i] + " ");
		}
		System.out.println();
		for(int i=0;i<count2.length;i++){
			System.out.print(count2[i] + " ");
		}
		
		for(int i=0;i<26;i++){
			result += Math.abs(count1[i]-count2[i]);
		}
		
		return result;
	}

}
