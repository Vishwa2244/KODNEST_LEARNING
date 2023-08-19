package Java_Program;

public class Labeled_dowhile_loop {

	public static void main(String[] args) {
		int m=1;
			label1:do {
				int n=1;
				do {
					System.out.println("# ");
					n++;
					break label1 ;
				}while(n<=5);
			}while(m<=5);m++;
				System.out.println();
			}
}

//output: #