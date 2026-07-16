package javafundamentals;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
}
		if(count==1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
}
	}
}

