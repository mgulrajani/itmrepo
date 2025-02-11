package com.itmskils.apps;

/**
 * access specifier -- public 
 * 
 * 
 */
 class Demo1 {
	
	//definition of m1 
	public  void m1(float f) {
		
		System.out.println(f);
		
	}
	
	public static void display() {
		
		
		//logic
		
	}
	
	//main can only accept String [] as input parameters
	
	public static void main(String [] args) {
		
		
		for (String s:args) {
			
			System.out.println(s);
		}
		Demo1 d1 = new Demo1();
		
		//executing m1 with a fixed value
		
		//caller is providing the float value needed by m1
		
		d1.m1(5.6f);
		
		d1.m1(9.0f);
		
		
	}
	

}
 
 
 
 /**
  * 
  * 1)create a class Demo3 , with a static method add which takes 2 int arguments 
  * and return int value which is the sum of those accepted args
  * execute add from main
  * 
  * 
  * 2)create a non static method multiply which accepts 2 numbers and returns the
  * product of 2 accepted values
  * execute multipy from main
  * 
  * 3)accept integer values 10 and 20 as program args to the main method and
  * display the difference between the two in main method
  * Hint :use Integer class static method parseInt
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */
