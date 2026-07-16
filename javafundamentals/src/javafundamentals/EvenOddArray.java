package javafundamentals;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {1, 0, 1, 0, 0, 1, 1};
	        int[] res = new int[a.length];

	        int index = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % 2 == 0) {
	                res[index] = a[i];
	                index++;
	            }
	        }
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % 2 != 0) {
	                res[index] = a[i];
	                index++;
	            }
	        }

	        
	        for (int i = 0; i < res.length; i++) {
	            System.out.print(res[i] + " ");
	        }
	}

}
