package javafundamentals;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,35,57,8,11};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);

	}

}
