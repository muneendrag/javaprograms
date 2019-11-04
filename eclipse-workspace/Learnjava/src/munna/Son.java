package munna;


	
		class Grandmother{
	static String property1="gold";
	static String property2="land";
    }
	class Father extends Grandmother{
		static String property3="business";
		static String property4="plots";

    }
	class Son extends Father{
		static String property5="house";

	public static void main(String[] args) {
		
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property3);
		System.out.println(property4);
		System.out.println(property5);
	}
	}

	
