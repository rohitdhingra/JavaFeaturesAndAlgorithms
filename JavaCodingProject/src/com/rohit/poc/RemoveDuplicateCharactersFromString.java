package com.rohit.poc;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {

		String inputString ="aassdsddaassdd";
		
		System.out.println("Original String is :" +inputString);
		//Removing Duplicate Character using first approach
		System.out.println("New String after removing duplicate characters:"+removeDuplicates(inputString));
		//Removing Duplicate using Ascii methodology
		System.out.println("New String after removing duplicate characters:"+removeDuplicatesFromString(inputString));

	}

	

	private static String removeDuplicates(String word) {
		// TODO Auto-generated method stub
			if(word == null || word.length()<2)
		{
			return word;
		}
		int pos = 1;// possible position for duplicate character
		char[] c = word.toCharArray();
		
		for(int i=1;i<word.length();i++)
		{
			int j;
			for(j=0;j<pos;++j)
			{
				if(c[i]==c[j])
					break;
			}
			if(j==pos)
			{
				c[pos]=c[i];
				++pos;
			}
			else
			{
				c[pos]=0;
				++pos;
			}
		}
		return toUniqueString(c);
	}



	private static String toUniqueString( char[] c) {
		StringBuilder sb = new StringBuilder(c.length);
		for(char c1: c)
		{
			if(c1!=0)
			{
				sb.append(c1);
			}
		}
		return sb.toString();
	}

	private static String removeDuplicatesFromString(String input) {
		// TODO Auto-generated method stub
		if(input ==null || input.length()<2)
		{
			return input;
		}
		
		boolean[] ASCII = new boolean[256];
		char[] c= input.toCharArray();
		
		ASCII[input.charAt(0)]=true;
		
		int dupIndex = 1;
		
		for(int i=1;i<input.length();i++)
		{
			if(!ASCII[input.charAt(i)])
			{
			c[dupIndex]=c[i];
			++dupIndex;
			ASCII[c[i]]=true;
			}
			else
			{
				c[dupIndex]=0;
				++dupIndex;
			}
		}
				
		return toUniqueString(c);
	}
}
