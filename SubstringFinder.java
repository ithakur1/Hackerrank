import java.util.HashMap;
import java.util.Map;

public class SubstringFinder {

	public static void main(String[] args) {
		long l = 12;
		int sum = (int)l;
		int[] arr = {7,
				6,
				6,
				3,
				9,
				3,
				5,
				1};
		Map<Integer, Integer> set = new HashMap<>();
		for(int item: arr) {
			set.put(item, 0);
		}
		
		int n = arr.length;
		int count = 0;
        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){
        	if(set.containsKey((int)sum-arr[i]) && set.get((int)sum-arr[i]) == 0 && ((int)sum-arr[i] != arr[i])) {
        		set.put(arr[i], set.get(arr[i]) + 1);
        		set.remove((int)sum-arr[i]);
        		count++;
        	}else if(set.containsKey(arr[i]) && set.get(arr[i]) == 0) {
        		set.remove(arr[i]);
        	}
        }
        System.out.println(count + " " + set.size());
        
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		int n = arr.length;
//        // Store counts of all elements in map hm
//        for (int i=0; i<n; i++){
//             
//        	if(hm.containsKey(sum-arr[i])) {
//        		hm.put(sum-arr[i], hm.get(key));
//        	}
//            // initializing value to 0, if key not found
//            if(!hm.containsKey(arr[i])) {
//            	hm.put(arr[i],0);
//            }
//                
//                 
//            hm.put(arr[i], hm.get(arr[i])+1);
//        }
//        int twice_count = 0;
// 
//        // iterate through each element and increment the
//        // count (Notice that every pair is counted twice)
//        for (int i=0; i<n; i++)
//        {
//            if(hm.get(sum-arr[i]) != null)
//                twice_count += hm.get(sum-arr[i]);
// 
//            // if (arr[i], arr[i]) pair satisfies the condition,
//            // then we need to ensure that the count is
//            // decreased by one such that the (arr[i], arr[i])
//            // pair is not considered
//            if (sum-arr[i] == arr[i])
//                twice_count--;
//        }
// 
//        // return the half of twice_count
//        //return twice_count/2;
//		String skills = "pcmbz";
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//        for(int i=0; i<skills.length(); i++) {
//            if(!map.containsKey(skills.charAt(i))) {
//                map.put(skills.charAt(i), 1);
//            }else if(map.containsKey(skills.charAt(i))) {
//                map.put(skills.charAt(i), map.get(skills.charAt(i)) + 1);
//            }
//        }
//        int resultt = Integer.MAX_VALUE;
//        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
//            resultt = Math.min(resultt, entry.getValue());
//        }
////        return resultt < Integer.MAX_VALUE ? result : 0;
	}
}
