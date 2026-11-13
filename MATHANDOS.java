import java.util.Scanner;
import java.text.DecimalFormat;
public class MATHANDOS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R#,###.00");
		
		double cumulative = 0, totalbppksbought = 0, maxpurchasecost = 0, TotalCost = 0, NEW_BOOK = 400.00, USED_BOOK = 280.00, RENT_BOOK = 150.00,E_BOOK = 200.00;
		final double DISCOUNT = 0.10;
		int NumBooks;
		
		System.out.print("Enter your student ID: ");
		int ID = sc.nextInt();
		
		while( ID != -1)
		{
			System.out.println("N/n - Buy New Books (R400.00) ");
			System.out.println("U/u - Buy Used Books (R250.00) ");
			System.out.println("R/r - Rent Book (Per semester) (R150.00) ");
			System.out.println("E/e - E-book (R200.00) ");
			
			System.out.print("Option: ");
			char option = sc.next().charAt(0);
			
			
			switch( option )
			{
				
				case 'N':
				case 'n':
				NEW_BOOK = 400.00;
				System.out.print("Enter the number of books you want to buy: ");
				NumBooks = sc.nextInt();
				double Amount = NEW_BOOK * NumBooks;
				
				if ( Amount > 1000.00)
				{
					Amount = DISCOUNT * ( NumBooks * NEW_BOOK);
				}
				
				System.out.println("Invoice for Student ID:" + ID);
				System.out.println("Purchase Option: "+ NumBooks + "New Book(s)");
				System.out.println("Total Cost: "+ df.format(Amount));
				break;
				
				case 'U':
				case 'u':
				USED_BOOK = 200.00;
				System.out.print("Enter the number of books you want to buy: ");
				NumBooks = sc.nextInt();
				Amount = USED_BOOK * NumBooks;
				
				if (Amount > 1000.00)
				{
					Amount = DISCOUNT * ( USED_BOOK * NumBooks);
				}
				
				System.out.println("Invoice for Student ID:" + ID);
				System.out.println("Purchase Option: "+ NumBooks + "Used Book(s)");
				System.out.println("Total Cost: "+ df.format(Amount));
				
				break;
				
				case 'R':
				case'r':
				RENT_BOOK = 150.00;
				System.out.print("Enter the number of books you want to buy: ");
				NumBooks = sc.nextInt();
				Amount = RENT_BOOK * NumBooks;
				
				if ( Amount > 1000.00)
				{
					Amount = DISCOUNT * ( RENT_BOOK * NumBooks);
				}
				System.out.println("Invoice for Student ID:" + ID);
				System.out.println("Purchase Option: "+ NumBooks + "Rented Book(s)");
				System.out.println("Total Cost: "+ df.format(Amount));
				break;
				
				case 'E':
				case 'e':
				E_BOOK = 200.00;
				System.out.print("Enter the number of books you want to buy: ");
				NumBooks = sc.nextInt();
				break;
				
				default:
				System.out.println("Invalid option");
			}
			
			
		}
		System.out.println("Thank you for using this application!");
	}
}