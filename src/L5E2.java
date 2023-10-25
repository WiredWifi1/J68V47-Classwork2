import java.util.Scanner;
public class L5E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("If you are ready for launch, type 'YES'. Otherwise, type 'NO': ");
        String answer = input.nextLine();
        if (answer.equals("YES")) {
            System.out.println("10");
            System.out.println("9");
            System.out.println("8");
            System.out.println("7");
            System.out.println("6");
            System.out.println("5");
            System.out.println("4");
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
            System.out.println("Blastoff!!!!!!!");
        } if (answer.equals("NO"));
            System.out.println("Blastoff program has ended");

        }
    }

