import java.util.Scanner;
import java.util.Random;
public class Mmm
{
	public static void main(String[] args)
	{
		Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int Max = 269999999;
	int Min = 260000000;
	
	System.out.print("Enter your full names: ");
	String Name = sc.nextLine();
	
	System.out.print("Enter your age: ");
	int Age = sc.nextInt();
	
	System.out.print("Enter your Maths(M/L): ");
	char MathType = sc.next().charAt(0);
	
	System.out.print("Enter your Mathematics/Mathematics Literacy: ");
	double MathMark = sc.nextDouble();
	
	System.out.print("Enter your APS: ");
	int APS = sc.nextInt();
	
	int StudentNo = rd.nextInt(Max-Min+1)+Min;
	
	System.out.println("Your student number is: "+ StudentNo);
	
	
	if( 30 > Age && Age >= 18){
		System.out.println("You qualify for the following application. ");
		
	} else {
		System.out.println("You do not qualify for this application. ");
		if ( MathType =='M' && MathMark >= 50){
			System.out.println("You qualify.");
		} else {
			System.out.println("Your Maths is low ");
		if ( MathType == 'L' && MathMark >=60){
			System.out.println("You qualify. ");
		} else {
			System.out.println("Your Maths is low ");
		if ( APS >=24 ){
			System.out.println("Your APS meets the minimun requirements, you do qualify for this application" );
		}else{
			System.out.println("Your APS score does not meet the minimun requiremenrs, you do not qualify for this application ");
		}
		}
		}
	}
	}
}