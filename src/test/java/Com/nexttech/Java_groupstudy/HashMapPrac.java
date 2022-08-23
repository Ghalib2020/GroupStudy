package Com.nexttech.Java_groupstudy;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapPrac {

	public static void main(String[] args) {
		HashMap<String,Integer> Prac=new HashMap<String,Integer>();
		Prac.put("DD", 11);
		Prac.put("AA", 12);
		Prac.put("CC", 14);
		System.out.println(Prac);
System.out.println(Prac.get("CC"));
System.out.println(Prac.size());
Prac.clear();
System.out.println(Prac);
//**********************
int [] num= {11,22,33,44};
System.out.println(Arrays.toString(num));
num[0]=12;
System.out.println(Arrays.toString(num));

	}

}
