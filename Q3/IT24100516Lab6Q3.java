import java.util.Scanner;

public class IT24100516Lab6Q3
{	public static void main(String[]args)
	{
	Scanner input=new Scanner(System.in);

	int num, count;
	double sumSq, rms;
	count=0;
	sumSq=0;

	System.out.println("Enter positive integers(terminate input with -99): ");
	while(true)
	{
	System.out.print("Enter a number: ");
	num=input.nextInt();

	if(num==-99)
	{
	break;
	}
	if(num<0)
	{
	System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
	continue;
	}
	sumSq+=num*num;
	count++;
	}
	if(count==0)
	{
	System.out.println("No numbers entered. ");
	}
	else
	{
	rms=Math.sqrt(sumSq/count);
	System.out.println("The Root Mean Square (RMS) is: "+ rms);
	}

	}
}