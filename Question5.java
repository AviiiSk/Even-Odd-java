import java.util.Scanner;

// 5. Write a program to check whether number is even or odd.



public class Question5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		
		Scanner d = new Scanner(System.in);
		int number = d.nextInt();
		
		if(number % 2== 0)
		{
			System.out.println("your Enter number is Even");
			
		}
		else 
		{
			System.out.println("Your Enter number is ODD");
		}
		
		
		
	}

}
