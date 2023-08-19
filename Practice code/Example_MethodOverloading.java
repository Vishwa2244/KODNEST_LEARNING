package Java_Program;

public class Example_MethodOverloading {
	
	public static void teaBill()
	{
		System.out.println("Normal tea 10 Rs");
	}
	
	public static void teaBill(int n)
	{
		System.out.println("3 Normal tea " + n*10+" Rs");
	}
	
	public static void teaBill(String type,int n)
	{
		System.out.println(type+" "+"tea "+n*20+" Rs");
	}
		

	public static void main(String[] args) {
		teaBill();
		teaBill(3);
		teaBill("Lemon",5);
	}

}
