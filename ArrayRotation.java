
public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int d = 4;
		int ans[] = arrayRotation(a,d);
		for(int i=0; i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
		

		// TODO Auto-generated method stub

	}
	
	public static int[] arrayRotation(int[] a, int d){
		
		int i;
		
	
		for(int j = 0;j<d;j++){
			int temp = a[0];
		
		for(i=0; i<a.length-1;i++){
			a[i] = a[i+1];
		}
			
		a[a.length-1] = temp;
		}
		return a;
	}

}
