package oopsandinheritence;

import java.util.Optional;
import java.util.Scanner;

public class Optional2 {
	
	    public static void main(String[] args) {

	        String address = null;

	        String result = Optional.ofNullable(address)
	                                .orElse("India");

	        System.out.println(result);
	    }
	}