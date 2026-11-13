import java.util.Scanner; 
public class Renovations
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int TILES_COVERAGE =2;
		
		System.out.print("Enter the lenght of the office: ");
		double OfficeLenght = input.nextDouble();
		
		System.out.print("Enter the width of the office:");
		double OfficeWidth = input.nextDouble();
		
		double Area = OfficeLenght*OfficeWidth;
		int Num = (int)Math.ceil(Area/TILES_COVERAGE);
		
		System.out.println("Area of the office: " + Area + "m^2");
		System.out.print("Boxes of tiles needed: " + Num);
	}
}	
		