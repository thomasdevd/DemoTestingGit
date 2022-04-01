
public class Reverse {
	
	public static void main(String[] args) {
	/*	String s1= "htm1";
		String s2="";

		for(int i = s1.length()-1;i>=0;i--)
		{
		s2= s2+s1.charAt(i);
		}
 
		 System.out.println("The given string is reversed: "+s2);
	}
	*/
		
		String s1 = new String ("java");
		String s2 = new String ("java");
		System.out.println("the string created using object: " +s1==s2);
	
		 
		String s3 = "ja";
		String s4 = "ja";
		System.out.println(s3==s4);
		
		String s5= new String(" Payal Priya");
		 s5= new String("Thomas");
		 System.out.println("the given " +s5);
		
		if(s1.equals(s2)) {
			System.out.println("the given string is equals");
		}else
		{
			System.out.println("the given string is not equals");
		}
	}
	
	
}
