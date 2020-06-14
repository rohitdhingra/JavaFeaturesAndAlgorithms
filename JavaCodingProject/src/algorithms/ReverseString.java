package com.rohit.poc;

public class ReverseString {
	public static void main(String[] args) {
		String originalString="Rohit";
		String originalSurrogate ="\uDC00-\uD800";
		
		//Normal String
		StringBuilder sb = new StringBuilder(originalString);
		System.out.println(originalString +" has been reversed to :"+ sb.reverse());
		
		//Surrogate String
		StringBuilder sb1 = new StringBuilder(originalSurrogate);
		System.out.println(originalSurrogate +" has been reversed to :"+ sb1.reverse());

		//Custom Method
		String custOriginalString ="12345";
		
		System.out.println(custOriginalString +" has been reversed to :"+ inPlaceReverse(custOriginalString));
		
	}

	private static String inPlaceReverse(String custOriginalString) {
		
		final StringBuilder sb= new StringBuilder(custOriginalString);
		int length = sb.length();
		
		for(int i=0; i<length/2;i++)
		{
			final char current = sb.charAt(i);
			final int otherEnd = length - i - 1;
			
			sb.setCharAt(i, sb.charAt(otherEnd));
			sb.setCharAt(otherEnd, current);
			
		}
		
		
		
		return sb.toString();
	}
}
