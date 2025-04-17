import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int array[] = {4,6,7,8,9};
        int[] myarray = {4,6,7,8,9,10};




        //2d Arrya

        int[][] twoD = { {20,30}, {40,50}};

        System.out.println( array[4]);
        System.out.println(myarray[2]);
        System.out.println(twoD[1][1]);



        //dynamic array 

        Scanner scan = new Scanner( System.in);
        System.out.println("Enter the size of array ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        //  arr[0]= 10;
        // System.out.print("Enter the value to store in array ");
        // arr[1]= scan.nextInt();

        // System.out.print("Enter the value to store in array ");
        // arr[2]= scan.nextInt();

        // System.out.print("Enter the value to store in array ");
        // arr[3]= scan.nextInt();

        for ( int i=0; i<arr.length; i++){
            System.out.print("Enter the value to store in array ");
            arr[i]= scan.nextInt();

        }

        for ( int i: arr){
            System.out.println( i);
        }
    }
    
}
