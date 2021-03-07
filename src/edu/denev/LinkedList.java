package edu.denev;

class Node<T>
{
	T data;
	Node<T> next;
	
	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedList<T> implements List<T>
{
	Node<T> linkedList;
	int index;
	
	public LinkedList(Node<T> linkedList, int index)
	{
		this.linkedList = linkedList;
		this.index = index;
	}
	
	public LinkedList()
	{
		this.index = 0;
	}
	
	@Override
	public boolean isEmpty()
	{
		return index <= 0;
	}

	@Override
	public boolean contains(T item) 
	{
		Node<T> current = this.linkedList;
		
		if(current != null)
		{
			if(current.data == item)
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void add(T item) 
	{
		this.linkedList = new Node<T>(item, this.linkedList);
		this.index++;
	}

	@Override
	public void insertAt(T item, int index) 
	{
		Node<T> newNode = new Node<>(item);
		 
	    if(index == 0) 
	    {
	        newNode.next = linkedList;
	        linkedList = newNode;
	    }
	    else 
	    {
	        Node<T> node = linkedList;
	        while(--index > 0) 
	        {
	            node = node.next;
	        }
	        newNode.next = node.next;
	        node.next = newNode;
	    }
	}

	@Override
	public void removeFrom(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T item) 
	{
		this.linkedList = new Node<T>(item, this.linkedList);
		this.index--;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear()
	{
		this.index = 0;
	}

}
