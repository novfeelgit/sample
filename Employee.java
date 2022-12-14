package org.tcs;

public class Employee {
	private void add() {
// datatype varable name = value
		
		String name = "Novfeel";
		byte age = 127;
		long phone = 9688999284l;
		char gender= 'm';
		
//<<<<<<< HEAD
		System.out.println("mugul final step");
		System.out.println("*******----////////");
//=======
		System.out.println("Novfeel step 1 ");
		System.out.println("***************");
//>>>>>>> 2a4510e1430a0cd42945a639a71c311c250e40f3
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(gender);
		
		
		System.out.println("My name is : "+name);
	
	}
	public static void main(String[] args) {
		Employee a= new Employee();
		a.add();
	}

}
