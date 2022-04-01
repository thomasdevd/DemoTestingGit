
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first =0;
		int second =1;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(first +" ");
			
			int third = first+second;
			first=second;
			second=third;
		}

	}

}
