pacakge assignment1;

import java.util.Scanner; 

class Quadraticequation{
    public static void main(String[] args) {
        System.out.println("Let's solve Quadratic Equation --> ax^2 + bx + c");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the \"a\" value");
        int a = obj.nextInt();
        System.out.println("Enter the \"b\" value");
        int b = obj.nextInt();
        System.out.println("Enter the \"c\" value");
        int c = obj.nextInt();
        int insideroot = b*b-4.0*a*c ;
        
        if (insideroot > 0){
            float root1 = (-b-Math.pow(insideroot , 0.5))/2 * a;
            float root2 = (-b+Math.pow(insideroot , 0.5))/2 * a;
            System.out.println("The root1 is "+root1+"\nThe root2 is "+root2);
        }
        else if (insideroot == 0){
            float root1 = -b/2 * a;
        }
        else{
            System.out.println("Enter the real value");
        }
    }
}
