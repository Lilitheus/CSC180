import java.util.ArrayList;
import java.util.List;


public class InMemoryAuctionService implements AuctionInterface {
	
	List<Auction> auctList; 
	Auction[] auctArray;
	Auction[] searchResults;
	
	public InMemoryAuctionService() {
		auctList = new ArrayList<Auction>();
	}
	
	public void auctionItems() {		
		
		auctList.add(new Auction(13, "Ponies", 100));
		auctList.add(new Auction(17, "String", 1));
		auctList.add(new Auction(4, "Beans", 10));
		auctList.add(new Auction(9, "Nuke", 200000000));
		
		
		
		search("Nuke");
		bid("Bob", 9);
		search("Nuke");
	}

	@Override
	public Auction[] search(String criteria) {
		int searchindex = 0;
		int lengthOfArray = 0;
		
		for(Auction auctItem : auctList) {
			lengthOfArray++;
		}
		
		searchResults = new Auction[lengthOfArray];
		
		for(Auction item : auctList) {
			if(item.getName() == criteria) {
				
				searchResults[searchindex] = item;

				System.out.println(item);
				
				searchindex++;				
			} else {
				//do nothing
			}
			
		}
		
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

}
