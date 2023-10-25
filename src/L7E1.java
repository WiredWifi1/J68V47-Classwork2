import java.util.Scanner;

public class L7E1 {
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Say hello");
        System.out.println("2. Tell me the time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Quit");
    }

    public static int getOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an option (1-4): ");
        int option = scanner.nextInt();
        System.out.format("You chose option %d %n", option);
        return option;
    }

    public static void option1(){
        System.out.println("HELLO!");
    }

    public static void option2(){
        System.out.println("The time is now.");
    }

    public static void option3(){
        System.out.println("Knock knock. Who's there? ....... long pause ........ Java");
    }

    public static void option4(){
        System.out.println("Bye!");
    }
    public static void main(String[] args) {

        int option;
        do {
            showMenu();

            option = getOption();

            if (option == 1){
                option1();
            } else if (option == 2){
                option2();
            } else if (option == 3){
                option3();
            } else if (option == 4){
                option4();
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        } while (option != 4);

    }
}