public class variables{
public static void main ( String [] args){
   int age= 25;  

   System.out.println( " age = " +age);


   //typecasting 
   //_1_implicit 
   int num = 10; 
   double bigNum = num; 
   System.out.println( " bignum = " + num);

   //2_explicit 
    double bignum2= 10.5;

    int num2 = (int) bignum2; 
    System.out.println( " bignum = " + num);
}
}