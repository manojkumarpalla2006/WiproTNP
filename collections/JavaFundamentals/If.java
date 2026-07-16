package javafundamentals;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='@';
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			System.out.println("Alphabet");
			}
		else if(ch>='0'&&ch<='9'){
System.out.println("Digit");
	}
		else {
			System.out.println("Speial Character");
		}

}
}
