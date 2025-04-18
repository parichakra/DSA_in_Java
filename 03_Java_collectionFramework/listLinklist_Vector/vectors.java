import java.util.Vector;

public class vectors{
    public static void main ( String [] args){
        //vector is synchoronised 
        //it is slow than Arraylist 
        //thread safe

  



       Vector<String> vector = new Vector<>();
       vector.add("ram");
       vector.add("shyam");
       vector.add("hari");

        System.out.println(vector);

        vector.clear();
        System.out.println(vector);
    }

}
