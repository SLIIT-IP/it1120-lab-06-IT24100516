import java.util.Scanner;

public class IT24100516Lab6Q2B
{
	public static void main(String[]args)
	{
	Scanner input=new Scanner(System.in);

	int num1 , num2, num3 , num4 , num5 , num6 , num7 , num8 , num9 , num10 ;
	System.out.println("Please enter 10 numbers: ");

	System.out.print("Enter number1: ");
	num1=input.nextInt();
	
	System.out.print("Enter number2: ");
	num2=input.nextInt();

	System.out.print("Enter number3: ");
	num3=input.nextInt();
	
	System.out.print("Enter number4: ");
	num4=input.nextInt();
	
	System.out.print("Enter number5: ");
	num5=input.nextInt();

	System.out.print("Enter number6: ");
	num6=input.nextInt();

	System.out.print("Enter number7: ");
	num7=input.nextInt();

	System.out.print("Enter number8: ");
	num8=input.nextInt();

	System.out.print("Enter number9: ");
	num9=input.nextInt();

	System.out.print("Enter number10: ");
	num10=input.nextInt();

	System.out.print("The numbers you entered are: ");
	System.out.print(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10 );

	return;
	}
}