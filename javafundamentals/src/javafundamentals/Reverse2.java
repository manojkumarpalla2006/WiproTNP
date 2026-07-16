package javafundamentals;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1004;
		int rev=0;
		while(n>0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println(rev);


	}

}
