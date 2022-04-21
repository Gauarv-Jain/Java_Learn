package lists.linkedList;

public class MyLinkdList<E> {
	
	Node<E> head ; 
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data); 
		
		if(isEmpty()) {
			head = toAdd;
			return ;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = (Node<E>) temp.next;
		}
		temp.next =  toAdd;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp =  temp.next;
		}
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public E removeLast() throws Exception{
		Node<E> temp =  head.next;
		Node<E> temp2 = head;
		
		if(temp2 == null) {
			throw new Exception("Cannot rempve last element from a empty list");
		}
		
		
		if(temp == null) {
			head = null;
			return temp2.data;
		}
		while(temp.next != null) {
			temp = (Node<E>) temp.next;
			temp2 = (Node<E>) temp2.next;
		}
		temp2.next = null;
		return temp.data;
	}

	public E getLast() throws Exception{
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot peek last element from a empty list");
		}
		
		while(temp.next != null) {
			temp = (Node<E>) temp.next;
		}
		return temp.data;
	}
	
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
