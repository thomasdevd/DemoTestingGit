
public class PatternFour {

	public static void main(String[] args) {
		
	/*	
		       *
		     * *
		   * * *
		 * * * *
		
		*/
		
	/*	i  |  j space
		1  |  3
		2  |  2
		3  |  1
		4  |  0
		
		*/
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		}
	}

}
