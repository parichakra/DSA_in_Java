class Father {
    String name = "Ram";
    String surname = "pokharel";
}

class Son extends Father {  // Son inherits from Father
    String name = "Viod";  // This shadows Father's name
}

public class Test {  // Changed to proper naming convention
    public static void main(String[] args) {
        Son s = new Son();
        
        System.out.println(s.name);    // Prints "Viod" (from Son class)
        System.out.println(s.surname); // Prints "pokharel" (inherited from Father)
    }
}