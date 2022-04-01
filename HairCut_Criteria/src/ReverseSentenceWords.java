
public class ReverseSentenceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to reverse sentence words 
		
		String str = "I am working on my pc";
		String[] arr = str.split(" ");
		String result = "";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			result = result+arr[i]+ " ";
		}
		 System.out.println(result);
	}

}
