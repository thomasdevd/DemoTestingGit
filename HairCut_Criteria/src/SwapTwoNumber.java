
public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp =0;
		
	
		
		System.out.println("before swapping: " +a+" " +b);
		
		
		 /* temp=a; 
		  a=b; 
		  b=temp;*/
		 
		
		
		
		//logic2 using without using third variable
	
		/*a=a+b; //30
		b=a-b; //10
		a=a-b; //20*/
		
		//logic3 -use * and / without using third variable
		
		/*a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		
		
	//	Logic4 - bitwise XOR(^)
		/*a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b;*/ //30^10=20
		
		//Logic5 - single statement

		b=a+b-(a=b);
		
		System.out.println("After swapping: " +a+ " " +b);
		
		
		 
		

	}

}
