package labs.two;

public class Driver {

	public static void main(String[] args) {
//		EventLoop loop = new EventLoop();
//
//		loop.begin();
		
		InMemoryAuctionService aService = new InMemoryAuctionService();
		
		aService.search("Ponies");
		aService.bid("Jill", 13);
		
		aService.search("Ponies");
		aService.search("Nuke");

	}

}
