
public abstract class NetworkNode {
	
	private NetworkConnection[] connections = new NetworkConnection[256];
	private String networkName;
	private String name;
	
	public NetworkNode(NetworkNode parent) {
		
	}
	public NetworkNode(String networkName) {
		this.networkName = networkName + ":";
	}
	
	
	
	public String read(int connectionNumber) {
		if(connectionNumber < 0 || connectionNumber >= connections.length) {
			return null;
		}
		NetworkConnection c = connections[connectionNumber];
		if(c == null) {
			return null;
		}
		return c.read(this);
	}
	
}
