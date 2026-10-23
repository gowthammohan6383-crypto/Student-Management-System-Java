import java.util.Scanner;
public class SGPAandCGPACalculation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter number of Subjects:");
		int n=sc.nextInt();
		double totalCredits=0,totalPoints=0;
		for(int i=1;i<=n;i++){
			System.out.println("Subject"+i);
			System.out.print("Enter the Credit:");
			int credit=sc.nextInt();
			System.out.print("Enter the Grade Point:");
			int grade =sc.nextInt();
			totalCredits+=credit;
			totalPoints+=credit*grade;
		}
		
		double sgpa=totalPoints/totalCredits;
		System.out.println("SGPA="+sgpa);
	

		System.out.println("Enter Number of Semester:");
		int sem=sc.nextInt();
		double totalSGPA=0;
		for(int i=1;i<=sem;i++){
			System.out.print("Enter SGPA of semester"+i+":");
			totalSGPA+=sc.nextDouble();
		}
		

		double cgpa=totalSGPA/sem;
		System.out.println("CGPA="+cgpa);

		sc.close();
	}
}