import java.util.Scanner;

public class IT24104198Lab4Q1{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double num;
		
		System.out.println("Enter Number:");
		num=scanner.nextDouble();
		
		if (num<0) {
			System.out.print("The number is Negative");
		}else if (num>0) {
			System.out.print("The number is Positive");
		}else {
			System.out.print("The number is Zero");
		}

		scanner.close();
		}
}