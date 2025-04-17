public class basics1{
    
    
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    
    public static void printMessage(String message) {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        int result = addNumbers(5, 3); // Calling the function
        System.out.println("Sum: " + result);
        
        printMessage("Hello, Java!"); // Calling void function
    }
}