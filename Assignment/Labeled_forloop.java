package Java_Program;

public class Labeled_forloop {

	public static void main(String[] args) {
		macha:for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("# ");
				break macha;
			}
			System.out.println();
		}

	}

}

//output: *
