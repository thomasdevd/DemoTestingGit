
public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		*
		* *
		* * *
		* * * *
		* * * * *  
		* * * * *
		* * * *
		* * *
		* *
		*
*/
		
		
		/*	i  |  j
			
			1  |  1
			2  |  2
			3  |  3
			4  |  4
			5  |  5
			
			*/
		
		/*	i  |  j
		
		1  |  5
		2  |  4
		3  |  3
		4  |  2
		5  |  1
		
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}



