package edu.denev;

public class LinkedList<T> implements List<T>
{
	private Node<T> linkedList;
	private int index;
	
	public LinkedList(Node<T> linkedList, int index)
	{
		this.linkedList = linkedList;
		this.index = index;
	}
	
	public LinkedList()
	{
		this.index = 0;
	}
	
	public int getIndex()
	{
		return this.index;
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
		Node<T> newItem = new Node<>(item);
		if(this.isEmpty())
		{
			this.linkedList = newItem;
		}
		else
		{
			Node<T> temp = this.linkedList;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newItem;
		}
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
	public void removeFrom(int index) 
	{
		if(index == 0)
		{
			this.linkedList = linkedList.next;
		}
		else
		{
			Node<T> temp = linkedList;
			int count = 0;
			while(count < index - 1)
			{
				temp = temp.next;
				count++;
			}
			Node<T> removedItem = temp.next;
			temp = removedItem.next;
		}
		this.index--;
	}

	@Override
	public void remove(T item) 
	{
		this.linkedList = new Node<T>(item, this.linkedList);
		this.index--;
	}

	@Override
	public T get(int index) 
	{
		Node<T> a = linkedList;
		for(int i=0; i < index; i++)
		{
			a = a.next;
		}
		return a.data;
	}

	@Override
	public void clear()
	{
		this.index = 0;
	}

}
