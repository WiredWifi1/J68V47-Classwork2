import java.util.Scanner;

public class L4E2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Scotland? : ");
        String scotlandCap = input.nextLine();
        if (scotlandCap.toLowerCase().equals("Edinburgh")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The capital of Scotland is Edinburgh.");


        }
    }
}
