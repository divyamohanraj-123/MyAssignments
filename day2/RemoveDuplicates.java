package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a String as PayPal India
		String name="PayPal India";
		//Convert it into a character array
		char[] ch=new char[name.length()];
		//Declare a Set as charSet for Character
		Set<Character>charSet=new TreeSet<Character>();
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character>dupCharSet=new TreeSet<Character>();
		// character array and add it into charSet
		for(int i=0;i<name.length();i++) {
			ch[i]=name.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			//Check the iterator variable isn't equals to an empty space
			if(ch[i]!=(' ')) {
				//If the character is already in the charSet then, add it to the dupCharSet
				if(charSet.add(ch[i])==false) {
					dupCharSet.add(ch[i]);
				}else {charSet.add(ch[i]);
				}
			}
		}
		System.out.println("Unique"+charSet);
		System.out.println("Duplicate"+dupCharSet);

	}

}
