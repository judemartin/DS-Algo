package LL;

public class Node<T> {
	
	private T data;
	private Node<T> nextNode;
	
	public Node(T data) {
		this.data = data;
	}
	
	/*
	private T data;
	private Node<T> nextNode;
	
	public Node(int data){
		this.data=data;
	}
	*/
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString(){
		return this.data.toString();
	}
}
