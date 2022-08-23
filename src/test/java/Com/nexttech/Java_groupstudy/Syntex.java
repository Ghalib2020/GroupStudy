
package Com.nexttech.Java_groupstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Syntex {
	//syntex for crating access modifier,
	
	public String D="public Access modifier"; //Public access modifier type attribute created
	String E="Default modifier"; //Default access modifier type attribute created
	private String F="Private modifier";//private access modifier type attribute created
	
	
	// creating method with different access level
	//syntex is method_type void method_name(){block of code}
	public void method1() {System.out.println("This is a public method");}//public method,accessable from anywhere
	 void method2() {System.out.println("This is a default method");}//default method accessable from clases in same package
	 private void method3() {System.out.println("This is a private  method");}//accessable only in same class

	public static void main(String[] args) {
		
		int a=7; //Syntex for store a integer value
		double b=1.5; //Syntex for store a double or float value
		char c='A'; //Syntex for store a single character
		String d="ABCD" ;//syntex for store string value
		System.out.println(d);// syntex for print store value
		
		//Arithmatic
		double add=a+b; //syntex for adding
		double sub=a-b;//syntex for substract
		double div=a/b; //Syntex for divide
System.out.println(div);

		//For loop
		for(int e=0;e<=10;e=e+2){System.out.println(e);} //syntex for declare a forloop
		
		//If else or else if
		int p=5;
		int q=7;
		if(p>q) {System.out.println("A is greater then B");}//syntex for if else condition
	else if (p<q){System.out.println("B is less then A");}
	else if (p==q) {System.out.println("A is equal to B");}	
		//try {
		//Array
		try {
		String[] car= {"kia","toyota","ford","bmw"}; //syntex for declare an array
		System.out.println(car[0]); //syntex for print index 0
		System.out.println(car[5]);
		car[0]="marcedez";//syntex for replace value
		System.out.println(Arrays.toString(car)); //syntex for full array print
		System.out.println(car.length);//Syntex for getting arraylength
		for(int i=0;i<car.length;i++) {System.out.println(car[i]);}//print whole array using for loop

		}
		catch (Exception e) {System.out.println("outbound error");}
		


		//}
		//catch (Exception e) {System.out.println("Outbound exception");}
		
		//Array list= here we can store data as array but in array list its resizeable
		//we can add, remove or replace
		//syntex ArrayList<datatype> variablename= new ArrayList<Datatype>();
try {
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(1); //suntex for adding data in arraylist
		number.add(2);
		number.set(0,5);//syntex for replace a value variablename.set(index,value);
		number.remove(0);//syntex for remove a value variablename.remove(index);
		System.out.println(number);//syntex for print whole arraylist
		//number.clear();//syntex for clear all values variablename.clear();
		number.size();//syntex for determine size of an array variablename.size();
		System.out.println(number.get(0));//syntex for print size of array list
}
catch (Exception e) {System.out.println("rrgdhdhhd");}
	
		
		//HashMap syntex for declare HashMap HashMap<datatype,datatype>=new HashMap<datatype,datatype>();
		//in hashmap we store data in pair, in key and value format
		HashMap<String,String> carmodels=new HashMap<String,String>();
		carmodels.put("bmw","M Series"); //syntex to add data variable name.put(key,value);
		carmodels.put("Nissan", "Armada");
		carmodels.put("Toyota", "rav4");
		carmodels.remove("bmw");//Syntex for remove single data from hashmap
		carmodels.get("Nissan");//Syntex to get value from HashMap
		System.out.println(carmodels.get("Nissan")); //syntex to print single value from HashMap
		System.out.println(carmodels.size());//syntex for print size of an HashMap
		
		System.out.println(carmodels);
		
		
		HashMap<String,Integer> empId=new HashMap<String, Integer>();
		empId.put("Adil", 1211);// syntex for adding data in HashMap
		empId.put("boby",2423);
		empId.put("jojo",2579);
		empId.remove("Adil");//Syntex for remove a data from HashMap
		System.out.println(empId);//syntex for print whole HashMap
		System.out.println(empId.get("boby")); //Syntex to get the value using key of a HashMap
		
		
		//Access modifier
		//Accesss modifier is used to crete different access level of an attribute
		//To access any attribute we need to create an object in the class where we want to access the data
		// syntex for creating a object is classname object_name=new classname();
		
		Syntex obj2=new Syntex(); //object cteated
		//How to access the data
		//To print the data syntex is System.out.println(object_name.variablename);
		System.out.println(obj2.E+" "+obj2.D+" "+obj2.F);
		
		
		//Access method
		//we need to create a object in the class where we want to access the method
		//syntex for creating an object is classname object_name=new classname();
		 
		Syntex obj3=new Syntex(); //Object created for methjods
		obj3.method1(); //Syntex for access the method object_name.method_name();
		obj3.method2();
		obj3.method3();
		
		//inharitance
		//for inharite a class we need to use extends after the child class name in child class
		//syntex is public class child_class extends parent_class,
		//then we need to create an object in child class
		//syntex is child_class object_name=new child_class
		//to access the method syntec is object_name.method name
		
		
		
		//An interface is a completely "abstract class" that is used to group related methods with empty bodies
		//when we want to hide the code of a method then we use interface
		//interface is not a class
		//we can not store normal methods in a interface
		//to create a interface we need to delete public class and replace this with interface to create an interface
		//to create a method in interface syntex is access_type void method_name();
		//to implement the method body in another class we need to use implements keyword after the class name where
		//we want to impliment the codes and then name of interface
		//we need to write the bodu in impliment class
		//now if we execute the method in child class then we need to extend the child class with the impliment class
		//then need to create an object with the child class, child_class obj_name=new child_class
		//to access the method obj_name.method name();
		
		
		
		


	}

}
