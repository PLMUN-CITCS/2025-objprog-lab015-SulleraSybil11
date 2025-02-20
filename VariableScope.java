public class VariableScope {
    public static void main(String[] args) {  //Defining the main method

        int globalCount = 100;  //Declaring the global count variable using int
        int localCount = 50;    //Declaring the local count variable using int

        //Printing both global and local count from main and showscope
        System.out.println("Global Count (from main): " + globalCount);
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
        
    }
}
