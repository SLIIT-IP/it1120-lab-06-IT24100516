import java.util.Scanner;

public class IT24100516Lab6Q1
{
	public static void main(String[]args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number: ");
	double num=input.nextDouble();
	double square= num*num;
	double squareRoot= Math.sqrt(num);

	System.out.println("Square of " + num +"is : " + square);
	System.out.print("Square root of " + num +"is : " + squareRoot);
	}
}