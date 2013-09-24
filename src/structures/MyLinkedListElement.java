package structures;

import java.util.Iterator;

public class MyLinkedListElement {

	private Object content;
	
	private MyLinkedListElement next;

	public MyLinkedListElement(Object content) {
		super();
		this.content = content;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public MyLinkedListElement getNext() {
		return next;
	}

	public void setNext(MyLinkedListElement next) {
		this.next = next;
	}


	
}
