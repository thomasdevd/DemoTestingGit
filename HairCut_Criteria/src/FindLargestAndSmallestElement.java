import java.util.Arrays;

public class FindLargestAndSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to find largest and smallest element in array
		
		int [] arr = {5,6,8,25,54,200,11,12};
		
		int largest = arr[0];
		int smallest =arr[0];
		
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
		}else if(arr[i]<smallest)
		{
			smallest=arr[i];
		}

	}
     System.out.println(Arrays.toString(arr));
     System.out.println("The Largest element is : "+largest);
     System.err.println("The Smallest element is : "+smallest);
	}
}
