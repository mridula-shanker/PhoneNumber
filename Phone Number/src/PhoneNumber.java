import java.util.Scanner;

public class PhoneNumber 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your 10 digit phone number: ");
		int phno = in.nextInt();
		String teleno = ""+phno;
		System.out.print("(" + teleno.substring (0,3)+ ")" + teleno.substring(3,6)+"-"+teleno.substring(6)+"\n");
		String first = teleno.substring(0,3);
		String middle = teleno.substring(3,6);
		String last = teleno.substring(6);
		System.out.print("(" + first + ")" + middle + "-" + last);
	}			
}
	
	
	
	
	
