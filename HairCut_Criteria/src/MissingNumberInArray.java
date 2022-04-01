import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,5,6,7,8,9,10};
		int sum=0;
		int expectedSum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		for(int i=1;i<=10;i++)
		{
			expectedSum	=expectedSum+i;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		System.out.println(expectedSum);
		System.out.println("The Missing number is :" +(expectedSum-sum));

	}

}
