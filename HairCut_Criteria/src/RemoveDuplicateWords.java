import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to remove DUPLICATE words from a given sentence
		
		String str = "learning Java java manual manual course";
		String str1 =str.toLowerCase();
		
		String [] arr =str1.split(" ");
		Set<String> mySet = new LinkedHashSet<>();
		for(String x:arr)
		{
			mySet.add(x);
		}	
		
	Iterator itr = mySet.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next()+ " ");
		
		
	}

	}

}
