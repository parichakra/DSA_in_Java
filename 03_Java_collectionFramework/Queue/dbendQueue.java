
import java.util.Deque;
import java.util.LinkedList;




public class dbendQueue {


   public static void main(String[] var0) {


      Deque<Integer> adq= new LinkedList<Integer>();

    adq.offer(10);
    adq.offer(20);
    adq.offerLast(30);
    adq.offer(60);
    adq.pollLast();
    adq.offerFirst(40);


    System.out.println("Deque"+adq);




   
      
   }
}
    
