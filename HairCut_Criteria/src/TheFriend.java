interface HairCut_Criteria{
	boolean haircut();
}
class ForMale implements HairCut_Criteria{
	@Override
	public boolean haircut() {
		System.out.println("Hair cut is finished for man & price is INR 120");
		return true;
	}
}
class ForFemale implements HairCut_Criteria{
	@Override
	public boolean haircut() {
		System.out.println("Hair cut is finished for Woman & price is INR 700");
		return true;
	}
}
class You {
	public static HairCut_Criteria suggestAShop(String criteria) {

		if(criteria.equals("man")) {
			return new ForMale();
		}else {
			return new ForFemale();
		}
	}
}
public class TheFriend{
	public static void main(String[] args) {
		// suggest for man
		You.suggestAShop("man").haircut();
		// suggest for woman
		You.suggestAShop("woman").haircut();
	}
}
