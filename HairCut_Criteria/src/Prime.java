
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=7;
		int temp =0;
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%2 == 0)
			{
				temp = temp+1;
			}
		}
		
		if(temp>0)
		{
			System.out.println("not a prime");
		}else
		{
			System.out.println("prime");
		}

	}

}
