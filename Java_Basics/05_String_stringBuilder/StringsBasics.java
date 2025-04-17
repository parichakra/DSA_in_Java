public class StringsBasics{
    public static void main ( String [] args){
        String str1 = "Hello"; //pne way 


        String str2 = new String ( " BIkram "); // another way 

        System.out.println( str1 + str2); 

        //length
        int len1= str1.length();
         System.out.println( len1);


         //caseConversion

         String upper1 = str1.toUpperCase();

         String lower1= upper1.toLowerCase();

         System.out.println( upper1);

         System.out.println(lower1);


        String s= " Hellow World ";
        //trimimg space 
        String trimmed= s.trim();


        //replacing characters
        String replacecd= s.replace('w', 'm');

        System.out.println( trimmed);

         System.out.println(replacecd);



        String s1= " Hellow ,World ";
        //split into array

        String[] parts = s1.split(",");

        System.out.println(parts);




    }
}