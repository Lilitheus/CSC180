import java.util.Scanner;

public class SearchResultState implements State {

	InMemoryAuctionService aService;
	Scanner scan = new Scanner(System.in);
	private String user;
	private String search;

	public SearchResultState(String user, String search, InMemoryAuctionService aService) {
		this.aService = aService;
		this.user = user;
		this.search = search;
	}

	@Override
	public void show() {
		aService.search(search);
		System.out.println(user + ", which item would you like to bid on?");
	}

	@Override
	public State next() {
		String bidding = scan.nextLine();

		if (!bidding.isEmpty()) {
			int bid = Integer.parseInt(bidding);
			aService.bid(user, bid);
			return new SearchResultState(user, search, aService);
		} else {
			return new UserHomeState(user, aService);
		}
	}
}
