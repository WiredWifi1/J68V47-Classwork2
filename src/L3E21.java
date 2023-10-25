import java.util.Scanner;
public class L3E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain?");
        String Spain = input.nextLine();
        System.out.println(Spain.contains("Madrid"));
        System.out.println("What is the capital of the UK? ");
        String UK = input.nextLine();
        System.out.println(UK.contains("London"));
        System.out.println("What is the capital of Italy? ");
        String Italy = input.nextLine();
        System.out.println(Italy.contains("Rome"));
    }
}
