
public class Queue<T> {

	private Element<T> start = null;
	private Element<T> last = null;
	
	public void enqueue(T element) {
		Element<T> e = new Element<T>(element);
		if(start == null || last == null) {
			start = e;
			last = e;
			return;
		}
		if(e != null) {
			this.last.setNext(e);
		}
	}
	
	public T dequeue() {
		if(start == null) {
			return null;
		}
		T val = start.value;
		this.start = start.next();
		return val;
	}
	
	private class Element<T> {
		
		private T value = null;
		private Element<T> next = null;
		
		public Element(T value) {
			this.value = value;
		}
		
		public Element<T> next() {
			return this.next;
		}
		
		public boolean setNext(Element<T> n) {
			if(this.next == null) {
				return false;
			}else {
				this.next = n;
				return true;
			}
		}
		
		public T value() {
			return this.value();
		}
	}
}
