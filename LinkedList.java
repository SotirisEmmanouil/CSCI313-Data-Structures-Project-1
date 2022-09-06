public class LinkedList {
           private ListNode first;
           private ListNode last;
           private int length;

           public LinkedList () {					// no parameter LinkedList constructor 
                 ListNode ln = new ListNode();
                 first = ln;
                 last = ln;
                 length = 0;
              }

           public void append (int s) {				// append method to add new nodes to the list 
              ListNode m = new ListNode(s);
              last.next = m;
              last = m;
              length++;
           }
           public void reverse() {								// no parameter reverse method to reverse the nodes 
                   ListNode pointer = first;				   // of the LinkedList 
                   ListNode previous = null, current = null;
                   while (pointer != null) {
                           current = pointer;
                           pointer = pointer.next;
                           current.next = previous;
                           previous = current;
                           first = current;
                           }
                               }
                         public void print() {					//print method to print the nodes of the LinkedList 
                                ListNode node = first;
                                while (node != null) {   
                                System.out.print(node.data + " ");
                                 node = node.next;
                               }
                                 System.out.println("");   
                             }
}
