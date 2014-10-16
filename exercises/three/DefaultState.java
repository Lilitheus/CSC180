import java.util.Scanner;


public class DefaultState implements State{
	
	Scanner scan = new Scanner(System.in);
	InMemoryAuctionService aService;
	
	public DefaultState(InMemoryAuctionService aService) {
		this.aService = aService;
	}
	
	public void show() {
		System.out.println("New User, would you like to log in?");
	}

	@Override
	public State next() {
		String user = scan.nextLine();
		
		if(!user.isEmpty()) {
			
			return new UserHomeState(user, aService);
			
		} else {
			System.out.println("Good bye");
			
		}
		
		return null;
	}
}
