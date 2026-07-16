package javafundamentals;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {12,34,12,45,67,89};
		for(int i=0;i<a.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					duplicate=true;
					break;
				}
			}
		
		if(!duplicate) {
		System.out.print(a[i]+" ");
		}
		}

	}

}
