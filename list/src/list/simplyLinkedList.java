package list;

public class simplyLinkedList {
	private node header = null;
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
			node tempNode = header;
			while (tempNode.get_next() != null) {
				tempNode = tempNode.get_next();
			}
			tempNode.set_next(tempNode);
		}
	}
}
