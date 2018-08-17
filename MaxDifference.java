
public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,10,2,4,8,1};
		
		int ans = maxDifference(arr);
		System.out.println(ans);
		
	}	
		
		static int maxDifference(int[] a) {
			int n = a.length;
			int diff[] = new int[n - 1];
			for (int i = 0; i < n - 1; i++)
			diff[i] = a[i + 1] - a[i];
			// Now find the maximum sum subarray in diff array
			int max_diff = diff[0];
			for (int i = 1; i < n - 1; i++)
			{
			if (diff[i - 1] > 0)
			diff[i] += diff[i - 1];
			if (max_diff < diff[i])
			max_diff = diff[i];
			}
			return max_diff;
			}

	}


