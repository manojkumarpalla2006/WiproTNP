package javafundamentals;
import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		int val=sc.nextInt();
		if(val%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
