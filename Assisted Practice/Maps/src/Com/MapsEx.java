package Com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapsEx 
{
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Ipsita");
		map.put(2, "Iswari");
		map.put(3, "manasa");
		map.put(3, "Ankita");
		map.put(null, "nithiu");
		map.put(null, "deepak");

		System.out.println(map.get(1));
		System.out.println(map.get(3));

		Set<Integer> keys = map.keySet();
		for(Integer d: keys) {
			System.out.println(d);
		}

		Collection<String> values = map.values();
		for(String d: values) {
			System.out.println(d);
		}

	}

}
