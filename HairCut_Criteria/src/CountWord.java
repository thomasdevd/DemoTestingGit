import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {

		String s1 = "I am learning learning java learing java";
		String[] arr = s1.split(" ");
		System.out.println("arr.length :" +arr);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int count = 1;
		for(int i =0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}
		
		}
		
		for(String p: map.keySet())
		{
		
			//System.out.println("The count of word :"+p+" = " +map.get(p));
			
			System.out.println( p+"=" +map.get(p));
			
		}
		

		
	}
	}


