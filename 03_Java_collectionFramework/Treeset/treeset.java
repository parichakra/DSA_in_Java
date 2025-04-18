import java.util.TreeSet;

public class treeset{
    public static void main (String [] args){
        TreeSet <Integer> tset = new TreeSet<>();
        tset.add(20);
        tset.add(40);
        tset.add(30);
        tset.add(20);
        tset.add(50);
        tset.add(3);

        System.out.println(tset);

    }
}