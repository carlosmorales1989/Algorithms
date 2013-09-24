package practice;

public class Practice1 {

	
	public static int parenthesisCheck(String str){
		int val = 0;
		int openPos = 0;
		for(int i = 0;i < str.length();i++){
			char c = str.charAt(i);
			if(c == '('){
				if(val == 0)
					openPos=i;
				val++;
				
			}				
			else
				val--;
			if(val < 0)
				return i;
		}		
		if(val==0)
			return -1;
		else
			return openPos;
	}
	
	public static LinkedElement reverseList(LinkedElement list){	
		LinkedElement o = list;
		LinkedElement rList = new LinkedElement();
		rList.val = o.val;
		LinkedElement last = null;
		while(o.next!=null){
			last = rList;
			rList = new LinkedElement();
			rList.val = o.next.val;
			rList.next = last;
			o = o.next;
		}		
		return rList;		
	}
	
	public static void main(String[] args) {
		LinkedElement f = new LinkedElement(null,"f");
		LinkedElement e = new LinkedElement(f,"e");
		LinkedElement d = new LinkedElement(e,"d");
		LinkedElement c = new LinkedElement(d,"c");
		LinkedElement b = new LinkedElement(c,"b");
		LinkedElement a = new LinkedElement(b,"a");
		System.out.println(a.print());
		System.out.println(reverseList(a).print());
	}
	
	static class LinkedElement{
		
		LinkedElement next;
		
		Object val;	
					
		public LinkedElement(){
			
		}
		
		public LinkedElement(LinkedElement next, Object val) {
			super();
			this.next = next;
			this.val = val;
		}



		String print(){
			return val+((next!=null)?","+next.print():".");
		}
	}
	
}
