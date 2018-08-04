//main function to calculate the age
import java.util.Scanner;
import java.text.SimpleDateFormat;//function to modify date format
import java.util.Calendar;//function to import calendar

public class DateMain
{
	public static void main(String[] args)throws Exception 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date of birth in DD/MM/YYYY format:");
		String input=scanner.nextLine();//input date of birth
		scanner.close();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Calendar dob=Calendar.getInstance();//create object
		dob.setTime(sdf.parse(input));
		
		Date Age=new Date(dob);//object creation
		Age.getAge(dob);//invoking object function
		
		System.out.println("Age of the person is: "+Age.getAge()+" yr "+Age.getMonth()+" months "+Age.getDay()+" days old");
	}
}
