
public class Extractlastfourcharacter {

	public static void main(String[] args) {
		// How to Extract last four character from string
		String str ="www.estrom.com";
		
		String firstFour = str.substring(0, 4);
		System.out.println(firstFour);
		
		String LastFour = str.substring(str.length()-4, str.length());
		System.out.println(LastFour);
		
		String webSite = str.substring(4, str.length()-4);
		System.out.println(webSite);
		return;

	}

}
