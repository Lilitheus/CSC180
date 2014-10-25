package labs.two;
import java.util.ArrayList;
import java.util.List;


public class InMemoryAuctionService extends AbstractService<Auction> implements AuctionInterface {
	
	List<Auction> auctList; 
	Auction[] auctArray;
	Auction[] searchResults;
	CollectionUtils collUtils;
	
	public InMemoryAuctionService() {
		auctList = new ArrayList<Auction>();
		auctList.add(new Auction(13, "Ponies", 100, "Pony"));
		auctList.add(new Auction(17, "String", 1, "Silly"));
		auctList.add(new Auction(4, "Beans", 10, "Pork and"));
		auctList.add(new Auction(9, "Nuke", 200000000, "Boom"));
	}
	
	@Override
	public Auction[] search(String criteria) {
		int searchindex = 0;
		int lengthOfArray = 0;
		ContainsPredicate cPredicate = new ContainsPredicate(criteria);
		
		for(Auction auctItem : auctList) {
			lengthOfArray++;
		}
		
		searchResults = new Auction[lengthOfArray];
		
		System.out.println("==================================");
		System.out.println("====      Search Results      ====");
		System.out.println("==================================");
		
		CollectionUtils.filter(auctList, cPredicate);
		
		for(Auction item : auctList) {
			if(cPredicate.evaluate(item)) {				
				searchResults[searchindex] = item;
				searchindex++;				
			} else {
				
			}	
		}
		
		System.out.println("==================================");
		System.out.println("");
		return auctList.toArray(searchResults);
	}

	@Override
	public void bid(String username, int itemId) {
		
		for(Auction item : auctList) {
			if(item.getId() == itemId) {
				item.setCurrentBid(item.getCurrentBid() + 1);
				item.setOwner(username);
			} else {
				//do nothing
			}
			
		}
	}
	
	public Auction create(Auction auction) {
		models.put(auction.getId(), auction);
		
		return retreive(auction.getId());
	}
	
	public Auction retreive(Integer id) {
		return models.get(id);
	}
	
	public Auction update(Auction auction, Integer id) {
		if(auction.getId() != id) {
			System.out.print("IdMismatch ");
		} else{
			models.put(id, auction);
		}
		
		return retreive(id);
	}
	
	public void delete(Integer id) {
		models.remove(id);
		System.out.println("The Auction with the id " + id + " has been deleted.");
	}
	
	public int idGen() {		
		int newId = 0;
		boolean hasNewId;
		
		do{
			hasNewId = false;
			newId++;
			for(Auction item : auctList) {
				if(item.getId() == newId) {
					hasNewId = true;
				} 
			}
		}while(hasNewId == true);
		
		return newId;
	}
	
	public void addItem(Auction auction) {
		auctList.add(auction);
	}

}
