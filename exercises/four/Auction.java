package labs.two;
import java.util.Map;


public class Auction extends Object{
	
	private final Integer id;
	private Integer currentBid;
	private String owner;
	private String name;
	private Map<String, Object> properties;
	private String description;
	
	
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Map<String, Object> getProperties() {
		return properties;
	}
	
	public Object getProperty(String propertyName) {
		return null;
	}
	
	public <T> T getProperty(String propertyName, Class<T> propertyType) {
		return null;
	}
	
	public void setProperty(String propertyName, Object propertyValue) {
		
	}
	
	public Auction(int id, String name, int currentBid, String description) {
		
		this.id = id;
		this.name = name;
		this.currentBid = currentBid;
		this.description = description;
	}
	
	public Auction(Integer id, String name, Integer currentBid, Map<String, Object> properties) {
		this.id = id;
		this.name = name;
		this.currentBid = currentBid;
		this.properties = properties;
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
	
	public int HashCode() {
		return currentBid;
		
		
	}
	

}
