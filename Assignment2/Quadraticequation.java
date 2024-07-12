pacakge assignment1;

import java.util.Scanner; 

class Quadraticequation{
    public static void main(String[] args) {
        System.out.println("Let's solve Quadratic Equation --> ax^2 + bx + c");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the \"a\" value");
        double a = obj.nextDouble();
        System.out.println("Enter the \"b\" value");
        double b = obj.nextDouble();
        System.out.println("Enter the \"c\" value");
        double c = obj.nextDouble();
        double insideroot = b*b-4.0*a*c ;
        
        if (insideroot > 0.0){
            double root1 = (-b-Math.pow(insideroot , 0.5))/2.0 * a;
            double root2 = (-b+Math.pow(insideroot , 0.5))/2.0 * a;
            System.out.println("The root1 is "+root1+"\nThe root2 is "+root2);
        }
        else if (insideroot == 0){
            double root1 = -b/2.0 * a;
        }
        else{
            System.out.println("Enter the real value");
        }
    }
}