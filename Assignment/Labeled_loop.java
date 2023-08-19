package Java_Program;

public class Labeled_loop {

	public static void main(String[] args) {
	 int i=1;
	 label1:while(i<=5)
	 {
		 int j=1;
		 label2:while(j<=5)
		 {
			 System.out.println("* ");
			 j++;
			 break label1;
		 }
		 System.out.println();
		 i++;
	 }
	}
}
// output: *