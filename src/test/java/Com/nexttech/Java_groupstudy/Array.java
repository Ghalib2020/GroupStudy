package Com.nexttech.Java_groupstudy;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// syntex for array datatype[]variable name={value1,v2,....};
		
		
		String [] car= {"bmw","ford","nissan","toyota"};
		System.out.println(car.length);
		
		
		//store an array name Nissan,
		//values are Nissan Rouge,Nissan Pathfinder, Nissan Armada
		//store a int value name car value
		// if the car value is less the 20000$ it will print Nissan rouge
		// if the car value is less then 40000$ it will print Nissan pathfinder
		// if the car value is more then 40000$ it will print Nissan armara
		//Make sure you print from the array not a text doc
		
		String[] Nissan= {"Nissan Rouge","Nissan Pathfinder","Nissan Armada"};
		int carvalue=41000;
		if (carvalue<20000) {System.out.println(Nissan[0]);}
		else if (carvalue<40000) {System.out.println(Nissan[1]);}
		else {System.out.println(Nissan[2]);}
		
		
		
		
		//Array List syntex ArrayList<datatype> variablename= new ArrayList<Datatype>();
		
		ArrayList<String>bb=new ArrayList<String>();
		bb.add("v1"); //add in arraylist
		bb.add("V2");
		bb.add("V3");
		bb.add("V4");
		bb.set(0,"V11"); 
	bb.remove(1);
	//bb.clear();
		System.out.println(bb);
		System.out.println(bb.size());
		
		
		
		
		
		
		
		
		

	}

}
