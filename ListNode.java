public class ListNode {
           int data;
           ListNode next;

           public ListNode(int data, ListNode next)  {			// Two parameter LinkedList Node constructor 
              this.data = data;
              this.next = next;
           }

           public ListNode()  {		// no parameter LinkedList Node constructor 
              this.data = data;
              this.next = null;
           }

           public ListNode(int data)  {				// one parameter LinkedList Node constructor
              this.data = data;
              this.next = null;
           }
}

