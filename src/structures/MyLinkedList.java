package structures;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Object>{

	private MyLinkedListElement root;
	
	public MyLinkedList(){		
	}
	
	@Override
	public Iterator<Object> iterator() {		
		return new MyLinkedListIterator(root);
	}			
	
	
	

	
}
