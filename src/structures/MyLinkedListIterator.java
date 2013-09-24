package structures;

import java.util.Iterator;

public class MyLinkedListIterator implements Iterator<Object>{

	private MyLinkedListElement element;
	
	public MyLinkedListIterator(MyLinkedListElement element){
		this.element = element;
	}
	
	@Override
	public boolean hasNext() {
		return element.getNext()!=null;
	}

	@Override
	public Object next() {
		Object content = element.getContent();
		element = element.getNext();
		return content;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}


	
}
