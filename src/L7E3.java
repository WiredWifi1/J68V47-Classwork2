import java.util.Scanner;

public class L7E3 {
    public static int AskQuestion(int number1, int number2) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int userAnswer = input.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score) {
        System.out.println("CORRECT!");
        score++;
        return score;
    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is " + answer);
        lives = (lives - 1);
        System.out.println("You have " + lives + "lives left.");
        return lives;

    }

    public static int gameOver(int score, int lives){
        System.out.println("Game over. Your score is " + score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
        return score;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int score = 0;
        int lives = 3;
        int userAnswer;
        int answer;
        int count = 1;
        while (count <= 10 && lives > 0){
            userAnswer = AskQuestion(count, count*count);
            answer = count + (count*count);
            if (answer == userAnswer){
                score = correctAnswer(score);
            } else {
                System.out.format("WRONG! The answer is %d %n", answer);
                lives--;
                System.out.format("You have %d lives left. %n", lives);
            }
            count++;
        }
        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0){
            System.out.println("Well done!");
        }
    }
}