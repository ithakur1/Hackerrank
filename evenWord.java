
public class evenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Neil Time to write code";
		
		//String ans = longestEvenWord(s);
		//System.out.println(ans);
		
		String ans1 = encode("bbhhtrffff");
		System.out.println(ans1);

	}

	public static String longestEvenWord(String s) {
		String def = "Input is null";
		if(s.equals(null)){
			return def;
		}
		
		String arr[] = s.split(" ");
		int maxLength = 0;
		int position = -1;
		
		for(int i=0;i<arr.length;i++){
			int len = arr[i].length();
			if(len%2==0){
				if(len>maxLength){
					position = i;
					maxLength = len;
				}
			}
			if(position == -1){
				return def;
			}
		}
		return arr[position];
	}
	
	public static String encode(String str) {
	/*    StringBuffer dest = new StringBuffer();
	    for (int i = 0; i < source.length(); i++) {
	        int runLength = 1;
	        while (i + 1 < source.length()
	                && source.charAt(i) == source.charAt(i + 1)) {
	            runLength++;
	            i++;
	        }
	        dest.append(source.charAt(i));
	        dest.append(runLength);
	        
	    }
	    return dest.toString();*/
		String compressed = " ";
		 
	      char ch=0;
	      int count=1;
	      for (int x = 0; x < str.length(); x++) { 
	         if (ch == str.charAt(x)){
	            count = count + 1;
	         } else {
	            compressed = compressed + ch;
	            if(count != 1){
	               compressed = compressed + count;
	            }
	            ch = str.charAt(x);
	            count = 1;
	         }
	      }
	      compressed = compressed + ch;
	      if(count != 1){
	         compressed = compressed + count;
	      }
	      System.out.println("Compressed: " + compressed); 
	      return compressed;
	}


}
