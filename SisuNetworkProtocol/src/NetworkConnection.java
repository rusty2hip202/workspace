
public class NetworkConnection {

	private Queue<String> q1 = new Queue<String>(), q2 = new Queue<String>();
	private NetworkNode n = null, n2 = null;
	
	
	public NetworkConnection(NetworkNode n, NetworkNode n2) {
		this.n= n;
		this.n2 = n2;
	}
	
	public String read(NetworkNode node) {
		if(node == n) {
			q2.dequeue();
		}
		if(node == n2) {
			return q1.dequeue();
		}
		return null;
	}
	public void write(NetworkNode node, String s) {
		if(node == n) {
			q1.enqueue(s);
		}
		if(node == n2) {
			q2.enqueue(s);
		}
	}
}
