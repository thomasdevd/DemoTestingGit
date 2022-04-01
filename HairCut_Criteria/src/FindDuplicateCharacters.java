import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str="Laptopaaaaaa";
		
		char[] arr=str.toCharArray();
		System.out.println(arr);
		
		Map<Character, Integer>map = new HashMap<Character,Integer>();
		
		int count=1;
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
		
		
		for(Character T :map.keySet() )
		{
			if(map.get(T)>1)
			{
				System.out.println(T + " : " +map.get(T));
			}
		}
		

	}

}
