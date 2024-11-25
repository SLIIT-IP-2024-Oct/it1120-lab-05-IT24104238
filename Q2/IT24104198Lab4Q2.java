import java.util.Scanner;

public class IT24104198Lab4Q2{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please enter exam marks(out of 100):");
	int marks=scanner.nextInt();

	if (marks>100 || marks<0) {
	System.out.print("Invalid input for exam marks. Terminating program.");
	return;
	}


	System.out.print("Please enter lab submission marks(out of 100):");
	int labsubmarks=scanner.nextInt();

	if (labsubmarks>100 || labsubmarks<0) {
	System.out.print("Invalid input for exam marks. Terminating program.");
	return;
	}

	
	System.out.print("Please enter the percentage given for the exam:");
	double exampercentage=scanner.nextDouble();

	System.out.print("Please enter the percentage given for the lab 	submission:");
	double labsubpercentage=scanner.nextDouble();
	

	if (exampercentage+labsubpercentage!=100) {
	System.out.print("The percentages must add up to 100.Terminating program");
	return;
	}

	double finalExamMark = (marks * exampercentage / 100) + (labsubmarks * 	labsubpercentage / 100);
        System.out.printf("The final exam mark is: %.2f\n", finalExamMark);


	scanner.close();
	}
}

	


	
	
	


