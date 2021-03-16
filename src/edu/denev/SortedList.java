package edu.denev;

public class SortedList <T extends Comparable<T>> implements List<T>
{
	Object[] arr;
	int lastIndex;
	

	@Override
	public boolean isEmpty() 
	{
		return arr.length == 0;
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(T item) 
	{
		if(lastIndex + 1 == arr.length)
		{
			Object[] temp = new Object[this.arr.length*2];
			for(int i = 0; i < arr.length; i++)
			{
				temp[i] = arr[i];
			}
			
			this.arr = temp;
		}
	}

	@Override
	public void insertAt(T item, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFrom(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() 
	{
		this.lastIndex = 0;
		this.arr = null;
	}
	
	public void sort()
	{
		for(int i=0; i < arr.length; i++)
		{
			for(int j = i; j < lastIndex; j++)
			{
				T o1 = (T)arr[i];
				T o2 = (T)arr[j];
				if(o1.compareTo(o2) > 0)
				{
					T temp = o1;
					o1 = o2;
					o2 = temp;
				}
			}
		}
	}
	
	public static void main(Object[] items)
	{
		int[] arr = {12, 3, 16, 5, 8};
	}
	

}
