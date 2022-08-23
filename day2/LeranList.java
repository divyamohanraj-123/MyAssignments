package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeranList {
public static void main(String[] args) {
	List<String> names= new ArrayList<String>();
	names.add("Karthi");
	names.add("Arun");
	names.add("Dev");
	names.add("Selva");
	names.add("Anbu");
	names.add("Sekar");
	Collections.sort(names);
	System.out.println(names);
	for(int i=0;i<names.size();i++) {
		if(names.get(i).startsWith("S")) {
			System.out.println(names.get(i));
		}
	}

//List<Integer> numbers= new ArrayList<Integer>();
//int[] num= {1,22,3,54,65,22,43};
List<Integer> numbers= new ArrayList<Integer>();
numbers.add(1);
numbers.add(22);
numbers.add(3);
numbers.add(54);
numbers.add(65);
numbers.add(22);
System.out.println(numbers);
for(int i=0;i<numbers.size();i++)
{
	if(numbers.get(i)==22) {


System.out.println(numbers.get(i));
}
}
}
}