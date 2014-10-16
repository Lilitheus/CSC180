import java.util.Scanner;


public class UserHomeState implements State{

	Scanner scan = new Scanner(System.in);
	private String user;
	InMemoryAuctionService aService;
	
	
	public UserHomeState(String user, InMemoryAuctionService aService) {
		this.aService = aService;
		this.user = user;
	}
	
	public void show() {
		System.out.println(user + ", what would you like to search for?");
	}

	@Override
	public State next() {
		String search = scan.nextLine();
		
		if(!search.isEmpty()) {
			
			return new SearchResultState(user, search, aService);
		} else {
			System.out.println("logout");
		}
		//if null queue.remove();
		return null;
	}
}
