pacakge assignment1;

class Ifstatement {
    public static void main(String[] args) {
        System.out.println("I am going to execute IF statement");
        String outsidevar ;
        outsidevar = "I am a Outside Variable " ;
        if (true) {
            String insidevar ;
            insidevar = "I am a Inside Variable" ;
            System.out.println(insidevar);
        }
        System.out.println(outsidevar);
        /* System.out.println(insidevar); 
        
        This will provide compiler Error.
        Because The "insidevar" is initialized inside a block .
        */
    }
}