package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare name as input
		String name="Divya Mohan";
		//Convert String to Character array
		char[] ch=new char[name.length()];
		//Iterate the Character array
		for(int i=0;i<name.length();i++) {
			ch[i]=name.charAt(i);
		}
		//Create a new Set -> HashSet
		Set<Character>charSet=new HashSet<Character>();
		//Add each character to the Set and if it is already there, remove it
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=(' ')) {
				charSet.add(ch[i]);
			}
		}
		//Print the set
		System.out.println("Print the Unique Characters:"+charSet);
	}

}
