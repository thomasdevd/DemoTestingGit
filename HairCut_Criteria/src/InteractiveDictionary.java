import java.util.HashMap;

public class InteractiveDictionary {
	  HashMap<String, String> map ;
	  public InteractiveDictionary() {
		     map = new HashMap<>();
		  }
		  public void newEntry(String key, String value) {
		    map.put(key, value);
		  }
		  public String look(String key) {
			  return map.getOrDefault(key, "Cant find entry for " + key);
		  }

	public static void main(String[] args) {
		InteractiveDictionary d = new InteractiveDictionary();
		 d.newEntry("Apple", "A fruit that grows on trees");
		 String result=d.look("Banana");
		 System.out.println(result);
	}

}
