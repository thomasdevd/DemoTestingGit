
public class SplitExample {
 public static void main(String[] args) {
	
		
		  // TODO Auto-generated method stub 
	     String s= "java,selenium,maunal"; 
		 String[] str = s.split(","); 
		 for(int i=0;i<str.length;i++) 
		 {
		  System.out.println("string is separated by cooma: " + str[i]); 
		  }
		 
	 
	 //concatenation of all three strings
	 String s1 ="xyz";
	 String s2="abc";
	 String s3="pqr";
	 
	String concatination= s1.concat(s2).concat(s3);
    System.out.println(" concatenation of all three strings " +concatination);
}
}
