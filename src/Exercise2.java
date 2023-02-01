import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextFloat();
        System.out.println("Enter b: ");
        b = sc.nextFloat();
        System.out.println("Enter c: ");
        c = sc.nextFloat();
        sc.close();

        delta = Math.pow(b, 2) - (4 * a * c);

        if(delta < 0) {
           System.out.println(a+"x² + "+b+"x + "+c+" = 0 has no real solutions."); 
        } else if(delta == 0) {
            System.out.println(a+"x² + "+b+"x + "+c+" = 0 has one solution."); 
        } else {
            System.out.println(a+"x² + "+b+"x + "+c+" = 0 has two solutions."); 
        }
    }
}
