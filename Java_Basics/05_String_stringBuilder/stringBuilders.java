public class stringBuilders {
    public static void main ( String [] args){
        String str1 = "Hello "; //

        StringBuilder sb = new StringBuilder(" Hello");

        sb.append(" World");


        System.out.println(sb);





        //insert

        sb.insert(6, "ng");

        System.out.println(sb);

        


        //delete

        sb.delete(6,8);
        System.out.println(sb);


        //replace
        sb.replace(6,10," bikram");
        System.out.println(sb);


        



        //deleteCharAT

        sb.deleteCharAt(1);
        System.out.println(sb);



        //reverse
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());



        //setlength
        sb.setLength(5);
        System.out.println(sb);





    }
}