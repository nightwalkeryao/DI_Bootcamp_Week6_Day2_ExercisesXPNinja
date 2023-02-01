import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time required by worker: ");
        double timeRequired = sc.nextDouble();
        sc.close();

        if(timeRequired >= 2 && timeRequired <= 3) {
            System.out.println("Worker is highly efficient");
        } else if(timeRequired <= 4) {
            System.out.println("Worker Needs to Improve Speed");
        } else if(timeRequired <= 5) {
            System.out.println("Worker needs training to improve speed");
        } else {
            System.out.println("Worker has to leave the company");
        }
    }
}
