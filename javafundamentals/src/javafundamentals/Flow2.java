package javafundamentals;
import java.util.Scanner;

public class Flow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int i1=sc.nextInt();
		System.out.println("Enter the num:");
		int i2=sc.nextInt();
		if(i1%10==i2%10) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
