
public class Auction {
	
	private final int id;
	private int currentBid;
	private String owner;
	private String name;
	
	
	public int getCurrentBid() {
		return currentBid;
	}
	public void setCurrentBid(int currentBid) {
		this.currentBid = currentBid;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Auction(int id, String name, int currentBid) {
		
		this.id = id;
		this.name = name;
		this.currentBid = currentBid;
	}
	
	@Override
	public String toString() {
		if(owner == null) {
			return id + "\t" + name + "\t" + currentBid;
		}
		return id + "\t" + name + "\t" + currentBid + "\t" + owner;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this.id == ((Auction) obj).getId()) {
			return true;
		} 
		return false;
	}
	

}
