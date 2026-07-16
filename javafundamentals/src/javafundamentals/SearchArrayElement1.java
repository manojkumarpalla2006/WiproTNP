package javafundamentals;

public class SearchArrayElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,34,56,7};
		int search=56;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==search) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
