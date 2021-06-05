package list;

public class simplyLinkedList {
	private node header = null;
	private node tail = null;
	private int size = 0;
	
	public simplyLinkedList() {
		
	}
	
	public void append(String fruit) {
		node newNode = new node(fruit);
		size++;
		if (header == null) {
			header = newNode;
		}
		else {
			tail.set_next(newNode);
		}
		tail = newNode;
	}
}
