
package studdybuddys_queue;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class StuddyBuddys_Queue {

    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        
        que.add("Studdy 1");
        que.add("Studdy 2");
        que.add("Studdy 3");
        que.add("Studdy 4");
        que.add("Studdy 5");
        que.add("Studdy 6");
        que.add("Studdy 7");
        que.add("Studdy 8");
        que.add("Studdy 9");
        que.add("Studdy 10");
        
        JOptionPane.showMessageDialog(null, que, "Queue after adding Elements: ", JOptionPane.INFORMATION_MESSAGE);
       
        //Remove an item from the Queue
        que.remove();
        JOptionPane.showMessageDialog(null, que, "After Removing an Element: ", JOptionPane.INFORMATION_MESSAGE);
    
        //Print Queue elements using for loop
        for (String element : que) {
            JOptionPane.showMessageDialog(null, element, "using For Loop ", JOptionPane.INFORMATION_MESSAGE);
        }
        System.out.println();

        //Get the size of the Queue collection
        int size = que.size();
        JOptionPane.showMessageDialog(null, size, "What is the Size of queue?? ", JOptionPane.QUESTION_MESSAGE);

         //Check whether a queue is empty or not
        boolean isEmpty = que.isEmpty();
        JOptionPane.showMessageDialog(null, isEmpty, "Is the Queue Empty?? ", JOptionPane.QUESTION_MESSAGE);
   
        //Remove all elements of queue
        que.clear();
        JOptionPane.showMessageDialog(null, que, "Queue after removing all elements: ", JOptionPane.INFORMATION_MESSAGE);

         //Add elements to queue again
        que.add("Hello 1");
        que.add("Hello 2");
        que.add("Hello 3");
        que.add("Hello 4");
        JOptionPane.showMessageDialog(null, que, "Queue after adding elements again: ", JOptionPane.INFORMATION_MESSAGE);

        //Retrieve & remove an element from the head of the queue
        String headElement = que.poll();
        JOptionPane.showMessageDialog(null, headElement, "Element retrieved and removed from the head: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, que, "Queue after poll: ", JOptionPane.INFORMATION_MESSAGE);
      
        //Retrieve an element from the head of the queue without removing it
        String headPeek = que.peek();
        JOptionPane.showMessageDialog(null, headPeek, "Element retrieved from the head ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, que, "Queue after Peek: ", JOptionPane.INFORMATION_MESSAGE);

        //Removing elements from the queue
        que.remove();
        JOptionPane.showMessageDialog(null, que, "Queue after removing an element: ", JOptionPane.INFORMATION_MESSAGE);
   
        
        //Accessing the head of the queue using peek() methods
        String headPeekAgain = que.peek();
        JOptionPane.showMessageDialog(null, headPeekAgain, "Element at the head using peek(): ", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
