
public class CollectionUtils 
{

	public static int cardinality(java.lang.Object obj, java.util.Collection coll) 
	{
		int count = 0;
		
		for(Object i : coll) {
			
			if(i == obj) {
				count++;
			} else {
				//do nothing
			}
		}
		
		return count;		
	}
}
