package list;

public class node {
	private String fruit;
	private node next = null;
	
	public node(String fruit) {
		this.fruit = fruit;
	}
	
	public String get_fruit() {
		return this.fruit;
	}
	
	public node get_next() {
		return this.next;
	}
	
	public void set_next(node next) {
		this.next = next;
	}
}
