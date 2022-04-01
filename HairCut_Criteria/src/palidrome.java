
public class palidrome {

	public int solution(String s1) {

		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("the given string is plaidrome");
		} else {
			System.out.println("the given string is not plaidrome");
		}
		return 0;
	}

	public static void main(String[] args) {

		// palidrome p1 = new palidrome();
		// p1.solution("dooernedeevrvn");
		palidrome p2 = new palidrome();
		p2.solution("kayak");
	}
}
