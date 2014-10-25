package labs.two;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

	public static int cardinality(java.lang.Object obj,	java.util.Collection coll) {
		int count = 0;

		for (Object i : coll) {

			if (i == obj) {
				count++;
			} else {
				// do nothing
			}
		}

		return count;
	}

	public static <T> Collection filter(Collection<T> coll,	Predicate<T> predicate) {
		Collection<T> tColl = new ArrayList<T>();
		for (T element : coll) {
			if (predicate.evaluate(element) == true) {
				tColl.add(element);
				System.out.println(element);
			}
		}
		return tColl;

	}
}
