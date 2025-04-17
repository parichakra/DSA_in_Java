public class Branching{
    public static void main ( String [] args){
        System.out.println("break");
        for( int j=1; j<5; j++){
            if(j==3){
                break;
            }
            System.out.println(j);
        }
        
        
        System.out.println("continue");
        
        
        for( int i=1; i<5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}