package labs.two;


public class ContainsPredicate implements Predicate<Auction> {
	
	public String criteria;
	
	public ContainsPredicate(String criteria) {
		this.criteria = criteria;
	}
	
	@Override
	public boolean evaluate(Auction t) {
		
		boolean isAnItem;
		
		if(t.getName().contains(criteria) || t.getDescription().contains(criteria)){
			isAnItem = true;
		} else {
			isAnItem = false;
		}
		
		return isAnItem;
	}

}
