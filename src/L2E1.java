import java.util.Scanner;

public class L2E1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.print("What is your hobby: ");
        String hobby = input.nextLine();
        System.out.print("This is a sentence about " + name + " Who really enjoys " + hobby + ". They find it is a great way to express themselves!");
    }
}
