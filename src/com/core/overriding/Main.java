package com.core.overriding;
//A Simple Java program to demonstrate 
//method overriding in java 

//Base Class 
class Animal 
{ 
	void shout() { System.out.println("Animal's shout()"); } 
   static void print() { System.out.println("Animal's Static print()"); } 
void xyz() { System.out.println("Animal's xyz()");}
     static void disp() { System.out.println("Animal's Static disp()"); } 


} 

//Inherited class 
class Horse extends Animal 
{ 
	// This method overrides show() of Parent 
	@Override
	void shout() { System.out.println("Horse's shout()"); }
 void winraces() { System.out.println("Horse's Winraces()");}
       static void print() { System.out.println("Horse's Static print()"); } 
   static void abc() { System.out.println("Horse's Static abc()"); } 


} 
class Mule extends Horse
{

}
//Driver class 
class Main 
{ 
	public static void main(String[] args) 
	{ 
		// If a Parent type reference refers 
		// to a Parent object, then Parent's 
		// show is called 
		Horse a = new Horse(); 
		a.shout(); 
   a.print();
   a.xyz();
   a.disp();
  a.abc();
   a.winraces();

		// If a Parent type reference refers 
		// to a Child object Child's show() 
		// is called. This is called RUN TIME 
		// POLYMORPHISM. 
	//	Animal b = new Horse(); 
		//obj2.show();
//  obj2.print();
   
  // Horse c =new Horse();
	} 
} 
