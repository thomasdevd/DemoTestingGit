import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find First Non Repeated character 
		
		String str ="swiss";
		int count=1;
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), count);
				
			}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			
		}
		
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("The First non repated character in the given string is : "+entry.getKey());
				break;
			}
		}
		


	}

}
