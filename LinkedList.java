class LinkedList<E>
{
    private static class Node<E>
    {
 	   Object  data;
 	   Node  next;
 	   Node(Object data){
 	   	this.data = data;
 	   	next = null;
 	   }
 	   
    }
    Node head ;
    int size = 0 ;
    
    public void add(E data)
    {
    	Node<E> newNode = new Node<E>(data);
    	
    	if ( head == null){
    		head = newNode;
    		    return ;
    	   }
       else{
         Node<E>   temp = head ;
         while ( temp.next != null){
         	temp = temp.next;
         	}
         	temp.next = newNode;
         	size++;
         }
    	   	
    }
    public void remove(int index){
    	if(index == 0)
    	  head = head.next;
    	  
    	else{
            Node<E> temp = head ;
            Node nullobj = null;
            for ( int i = 0 ; i <index -1 ; i++)
            	temp = temp.next;
            
            nullobj = temp.next;
            temp.next = nullobj.next;
    	  }
    	}
    
    public String toString(){
    	Node<E> temp = head ;
    	String str = "";
    	while(temp != null){
	str = str + temp.data +" , ";
//	System.out.print(str);
    	temp = temp.next;
    	}
    	return "["+ str+"]";
    }
    	public static void main(String[] aa)
    	{
    	   LinkedList<String> ll= new LinkedList<String>();
    	   ll.add("Shilpa");
    	   ll.add("Wasim");
    	   ll.add("Rekha");
    	   ll.add("Nina");
    	   ll.add("Mark");
    	   ll.add("Windy larson");
    	   System.out.println(ll.toString());
    	   
    	   LinkedList<Integer> ll2= new LinkedList<Integer>();
    	   ll2.add(75);
    	   ll2.add(45);
    	   ll2.add(12);
    	   ll2.add(123);
    	   ll2.add(899);
    	   ll2.add(120);
    	   ll2.remove(4);
    	   System.out.println(ll2.toString());
    	   
    }
}
