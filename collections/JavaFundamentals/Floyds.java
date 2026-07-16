package javafundamentals;

public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(args.length==0) {
	System.out.println("please enter an integer number:");
	return;
}
int n=Integer.parseInt(args[0]);
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" * ");
		
	}
	System.out.println();
}


	}

}
