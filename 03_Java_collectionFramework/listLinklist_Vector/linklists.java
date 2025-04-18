import java.util.LinkedList;
import java.util.List;

public class linklists{
    public static void main ( String [] args){
       List  linkedList= new LinkedList<Integer>();
       linkedList.add(0,20);
       linkedList.add(10);
       linkedList.add(2,50);

       linkedList.remove(1);
        System.out.println(linkedList);
    }

}
