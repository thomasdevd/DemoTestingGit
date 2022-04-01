
public class countcharacterOccurrence {

	public static void main(String[] args) {
		
		//count character Occurrence in a given String
		
		/*
		 * String s1="Java is a object oriented programm"; int s2 = s1.length();
		 * System.out.println(s2);
		 * 
		 * 
		 * int s3 = s1.replaceAll("a", "").length(); System.out.println(s3);
		 * 
		 * int result =s1.length()-s1.replaceAll("a", "").length();
		 * System.out.println(result);
		 */

		String s1="Java is a object oriented programm";
		
		int count =0;
		char ch = 'a';
		for (int i=0;i<s1.length()-1;i++) {
			if(ch == s1.charAt(i))
			{
				count++;	
			}		
		}
		
		System.out.println(count);
		
	}
	
	

}
