// package java_oops.oopsBasic.encapsulation;


class Employee{
    int empId= 2;
    int basicSal= 20000;
    int incentive= 200;
    
    void countSalary(){

        System.out.println(basicSal+ incentive);
    }
}
public class Test {
    public static void main ( String[] args){
        Employee e= new Employee();
        e.countSalary();

        
    }
    
}
