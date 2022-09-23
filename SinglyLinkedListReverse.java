import java.util.Scanner;

public class SinglyLinkedListReverse {

        public static void main(String[] args) {			// main method 
                			
                      Scanner LinkedListNumber = new Scanner(System.in);		//creation of Scanner object
                        System.out.println("Enter the nodes of the LinkedList to be reversed: ");  // receive input from user 
                     int m = LinkedListNumber.nextInt(),n;  
                     LinkedList list = new LinkedList();     // creation of new LinkedList
                      
               for(int counter = 0; counter < m; counter++) {		// for loop that will copy all the array entries into the LinkedList
            	   System.out.println("Enter the value of LinkedList node number " + (counter+1) + " to be reversed: " );
            	      n = LinkedListNumber.nextInt();
            	           list.append(n);
              }

           list.reverse();			// reverse list 
           list.print();   		   // print the list entries
                 
                }
