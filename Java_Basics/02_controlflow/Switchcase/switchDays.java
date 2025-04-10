public class switchDays{
    public static void main ( String [] args){
        int num = 4;

        switch( num ){
            case 1:
                System.out.print( " sunday ");
                break;
            
            case 2:
                System.out.print(" monday ");
                break;
            
            case 3:
                System.out.print(" tuesday ");
                break;

            case 4:
                System.out.print( " wednesday ");
                break;
            
            case 5:
                System.out.print(" thursday ");
                break;
            
            case 6:
                System.out.print(" friday ");
                break;

            default:
            System.out.println("Invalid day");        
        }
    }
}