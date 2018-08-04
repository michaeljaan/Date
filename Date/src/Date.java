// date class
import java.util.Scanner;
import java.text.SimpleDateFormat;//import package for dateformat
import java.util.Calendar;//import calendar

public class Date
{
	private Calendar dob;//instance member date of birth
	private int age;
	private int month;
	private int day;

	public Date(Calendar dob)//constructor(parameteric) 
	{
		super();
		this.dob = dob;
	}

	public void getAge(Calendar dob)//age calculator(member function)
	{
		Calendar today=Calendar.getInstance();
		int curYear=today.get(Calendar.YEAR);
		int dobYear=dob.get(Calendar.YEAR);
		this.age= curYear-dobYear;//calculate years
		
		int curMonth=today.get(Calendar.MONTH);
		int dobMonth=dob.get(Calendar.MONTH);
		this.month=dobMonth-curMonth;//calculate month
		
		int curDay=today.get(Calendar.DAY_OF_MONTH);
		int dobDay=dob.get(Calendar.DAY_OF_MONTH);
		this.day=curDay-dobDay;//calculate days
		if(dobMonth > curMonth)
		{
			this.age--;
		}
		
		else if(dobMonth == curMonth)
		{					
			if(dobDay > curDay)
			{
				this.age--;
			}
		}
	}

	
	public int getAge()//getter 
	{
		return age;
	}

	public int getMonth()//getter
	{
		return month;
	}

	public int getDay()//getter
	{
		return day;
	}	
}
