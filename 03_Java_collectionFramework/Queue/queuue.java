
import java.util.LinkedList;
import java.util.Queue;



public class queuue{
  

   public static void main(String[] var0) {


      Queue<Integer> queue= new LinkedList<Integer>();
      queue.add(10);
      queue.offer(20);
      queue.offer(15);
      queue.add(40);

      System.out.println("Queue"+queue);
      System.out.println("Queue eremove= "+queue.remove());
      System.out.println("Queue"+queue);
      System.out.println("Queue eremove= "+queue.poll());
      System.out.println("Queue"+queue);


   // double ended queue








      

      
      
   }
}
