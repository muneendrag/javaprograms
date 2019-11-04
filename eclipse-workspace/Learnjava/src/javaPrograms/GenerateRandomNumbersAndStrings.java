package javaPrograms;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		//random method built in 0-99 it will print
		Random randInt=new Random();
		System.out.println(randInt.nextInt(100));
		
		Random randDoub=new Random();
		System.out.println(randDoub.nextDouble());
		
		//By using math function it will generate decimal num
		System.out.println(Math.random());
		
		//by using apache commons lang api
		
	}

}
