package javafundamentals;

public class Palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int temp=n;
		int rev=0;
		while(n>0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
