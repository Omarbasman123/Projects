/*
*Nom étudiant : OMAR BASMAN ALMOGHLY 
*Numéro d’étudiant : 300406240
*Code du cours : ITI1521  
 */
package Devoir4_300406240.Exo2;

 public class LinkedList2 {

   /**
    * Objects of type Node are linked together into linked lists.
    */
   private static class Node {
      int value;        // value of an item in the list.
      Node next;       // Pointer to the next node in the list.
   }
   
   /**
    * Return a new list containing the same items as the list,
    * but in the reverse order.
    */
    static Node reverse( Node obj ) {
         Node reverse = null;     // reverse will be the reversed list.
         Node p = obj;       // going through the nodes of list.
         
         while (p != null) {
            Node newNode = new Node();   // Create a new node
            newNode.value = p.value;     // Copy value
            newNode.next = reverse;      // Point it to the current reversed list
            reverse = newNode;           // Move the reverse pointer to the new node
            p = p.next;                  // Move to the next node in the original list
         }
      
      return reverse;  // Return the reversed list
      
   } // end of reverse()
   
   
   /**
    * Displays the items in the list to which the parameter, first, points.
    * They are printed on one line, separated by spaces 
    */
    static void display(Node first) {
         Node p = first;
         while (p != null) {
            System.out.print(p.value + " ");  // Print the current value
            p = p.next;  // Move to the next node
         }
         System.out.println();  // Newline at the end of output
   } // end of display()
   
   /**
    * Return the number of zeros that occur in a given linked list of int.
    */
 static int count( Node head ) {
      int count = 0;
      Node p = head;
      
      while (p != null) {
         if (p.value == 0) {
            count++;  // Increment the count when value is zero
         }
         p = p.next;  // Move to the next node
      }
      
      return count;  // Return the total count of zeros
}// end of count()

 /**
    * Return the number of zeros that occur in a given linked list of int.
    * Uses recursion 
    */
 static int countRecursive( Node head ) {
      if (head == null) {
            return 0;  // Base case: if the list is empty, return 0
      }
      
      int count = (head.value == 0) ? 1 : 0;  // Check if current node has value 0
      return count + countRecursive(head.next);// Recursively count zeros in the rest of the list
} // end of countRecursive()
      
   public static void main(String[] args) {
   
      Node list = null;   // A list, initially empty.
      Node reverseList;  // The reversed list.
      
      int count = 0;  //The number of elements in the list
      
      while (true) {
             // add a new node onto the head of the list before repeating.      
          count++;
          if (count == 10)
             break;
          Node head = new Node();  // A new node to add to the list.
          head.value = (int)(Math.random()*100);  // A random item.
          head.next = list;
          list = head;
      }
          
        // Print the current list ; its reverse 
       // and the number of zeros in the list using both count methods
          System.out.print("The list: ");
          display(list);
          System.out.println();
          reverseList = reverse(list);
          System.out.print("The reversed list: ");
          display(reverseList);
          System.out.println();
          System.out.println();
          System.out.print("The number of zeros in the list : ");
          System.out.println(count(list));
          System.out.print("The number of zeros in the list, using recursion : ");
          System.out.println(countRecursive(list));
      
   } // end main()
   
} // end LinkedList2 class
