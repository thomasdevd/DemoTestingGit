
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag =false;
     int a[] = {10,20,40,50,70,80};
     
     int search_ele=70;
     
     for(int i=0;i<=a.length-1;i++)
     {
    	 if(search_ele==a[i])
    	 {
    		System.out.println("Element found at: " +i);
    		flag=true;
    		break;
    	 }
     }
     if(flag==false)
     {
    	 System.out.println("Element not found at ");
     }
	}

}
