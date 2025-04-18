import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set{
    public static void main (String [] args){
        Set<Integer> sett= new HashSet<Integer>();
        sett.add(20);
        sett.add(30);
        sett.add(40);
        sett.add(50);
        sett.add(50);
        sett.add(60);

        System.out.println(sett);



        //linked set

        LinkedHashSet<Integer> llset= new LinkedHashSet();
        llset.add(10);
        llset.add(20);
        llset.add(30);
        llset.add(40);

        System.out.println(llset);


    }
}