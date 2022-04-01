import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		sc.nextLine();
		
		
		ch=sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' ||ch=='i' || ch == 'o')
		{
		   System.out.println("it is vowel");
		}else
		{
			System.out.println("not vowel");
		}
		
	}
	
}
