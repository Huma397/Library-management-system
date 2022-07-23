import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
 	super(msg);
	}
}
class Voting
{
	public static void main(String args[])
	{
	  Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age=s.nextInt();
	if(age<18)
	{
	throw new YoungerAgeException("You r not Eligible for vote");
}
	else
	{
		System.out.println("you can vote :");
 			}
		}
	}

