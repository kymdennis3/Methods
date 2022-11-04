public class Main {
    public static void main(String[] args) {

        //method = a block of code that is executed whenever it is called upon

        String name = "Kimtai";

        //values or variables parsed to a method are referred to as arguments and can be confused with parameters
        //You need a matching set of parameters
        hello(name);
     }
    static void hello(String name) {

        System.out.println("Hello "+name); //with parameters you dont need to keep the name of the values consistent
}}