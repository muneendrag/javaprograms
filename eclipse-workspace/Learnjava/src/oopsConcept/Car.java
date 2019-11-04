package oopsConcept;

public class Car {
	//global variables
	int wheels;
	int model;

	public static void main(String[] args) {
		//new keyword is used to create an object
		//a,b,c are the object references
		//new Car() is the object of car class
		Car a=new Car();
        Car b=new Car();
        Car c=new Car();
        
        System.out.println("before assigning the references");
        c.wheels=2;
        c.model=2000;
        
        a.model=1990;
        a.wheels=4;
        
        b.model=1980;
        b.wheels=4;
        
        System.out.println(a.wheels);
        System.out.println(a.model);
        
        System.out.println("after assignig the references");
        a=b;
        b=c;
        c=a;
        a.model=10;
        System.out.println(a.model);//10
        c.model=20;
        System.out.println(a.model);//20
        System.out.println(c.model);//20
        
        
        
        
	}

}
