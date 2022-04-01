import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Stop";
		String s2= "tops";
		  
		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("The given String is Anagram");
		}
			else
			{
				
				System.out.println("The given  String is not an Anagram");
			}
		}

	}


