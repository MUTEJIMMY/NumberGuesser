import java.util.*;

private void waiting(){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

void main() {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    boolean repeat = true;

    System.out.println("Welcome to my Guessing Game.");
    while(repeat) {

        int randomNum = rand.nextInt(1, 10);
        int points = 0;



        System.out.println("here is the random number for testing purposes: " + randomNum);

        waiting();

        System.out.println("I have a random number between 1-10 and I want you to try and guess it.");

        System.out.print("Your Guess: ");

        int userGuess = scan.nextInt();

        if (userGuess == randomNum) {
            points++;
        } else {
            System.out.println("Wrong guess");
        }

    }
}
