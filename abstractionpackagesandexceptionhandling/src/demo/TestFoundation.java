package demo;



import testpackage.Foundation;

public class TestFoundation {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Error - private
        // System.out.println(obj.var2); // Error - default
        // System.out.println(obj.var3); // Error - protected

        System.out.println("var4 = " + obj.var4);
    }
}