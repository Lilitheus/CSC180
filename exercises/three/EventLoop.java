import java.util.LinkedList;
import java.util.Queue;

public class EventLoop {

	InMemoryAuctionService aService = new InMemoryAuctionService();
	DefaultState defaultState = new DefaultState(aService);

	public void begin() {
		Queue<State> todo = new LinkedList<State>();
		Queue<State> done = new LinkedList<State>();
		State currentState;
		boolean loop = true;

		/*
		 * int tempr = right;
		 * 
		 * right = left; left = tempr;
		 */

		do {
			if (!todo.isEmpty()) {
				currentState = todo.poll();
				currentState.show();
				done.add(currentState.next());
			} else {
				todo.add(defaultState);
				for (State state : done) {
					if (state == null) {

					} else {
						todo.add(state);
					}
				}
				done.clear();
			}
		} while (loop == true);
	}
}
