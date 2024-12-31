import java.util.Scanner;
public class SingleThreadedProgram {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1:Addition operation started");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result is:"+res);
		System.out.println("Additon operation completed");
		
System.out.println("Task2:Printing operation completed");
System.out.println("Task3:Banking operation started");
System.out.println("Enter the Account number:");
int acc=sc.nextInt();
System.out.println("Enter pin code:");
int pin=sc.nextInt();
System.out.println("Account details recorded");
System.out.println("Task 3:Banking operation completed");
	}
}
