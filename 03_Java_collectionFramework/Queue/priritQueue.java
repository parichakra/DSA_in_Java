
import java.util.Comparator;
import java.util.PriorityQueue;




public class priritQueue {


   public static void main(String[] var0) {


      PriorityQueue<Integer> pqu= new PriorityQueue<Integer>(Comparator.reverseOrder());

    pqu.offer(80);
    pqu.add(20);
    pqu.add(30);
    pqu.offer(10);
    


    System.out.println("Priorque="+pqu);




   
      
   }
}
  