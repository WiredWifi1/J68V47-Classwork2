import java.util.Scanner;

public class L2E3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of Item 1: ");
        String item1Name = input.nextLine();
        System.out.print("Enter the name of Item 2: ");
        String item2Name = input.nextLine();
        System.out.print("Enter the name of Item 3: ");
        String item3Name = input.nextLine();
        System.out.print("Enter the value of Item1: ");
        Float item1 = input.nextFloat();
        System.out.print("Enter the value of Item 2: ");
        Float item2 = input.nextFloat();
        System.out.print("Enter the value of Item 3: ");
        Float item3 = input.nextFloat();

        Float total = item1 + item2 + item3;

        System.out.println("Your total is: " + total);
    }
}






