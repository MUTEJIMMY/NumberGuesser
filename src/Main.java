import java.util.*;

private void waiting(int second){
    second *= 1000;
    try {
        Thread.sleep(second);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

void main() {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    boolean repeat = true;
    int points = 0;

    System.out.println("Welcome to my Guessing Game.");

    while(repeat) {

        int randomNum = rand.nextInt(1, 10);

        System.out.println("here is the random number for testing purposes: " + randomNum);

        waiting(1);

        System.out.println("I have a random number between 1-10 and I want you to try and guess it.");

        System.out.print("Your Guess: ");

        int userGuess = scan.nextInt();

        scan.nextLine();

        if (userGuess == randomNum) {
            System.out.println("Correct good job.");
            points++;
        } else {
            System.out.println("Wrong guess");
        }

        System.out.print("Do you want to try guessing again(Y/N): ");



        String userRepeat = scan.nextLine();

        boolean input = true;

        System.out.println("here is your response: " + userRepeat);

        while(input) {
            if (userRepeat.equalsIgnoreCase("Y")) {
                input = false;
            } else if (userRepeat.equalsIgnoreCase("N")) {
                repeat = input = false;
            } else {
                System.out.print("Please type Y for repeating or N for not repeating:");

                userRepeat = scan.nextLine();
            }
        }
    }
    System.out.println("Thank you for playing here is your score: " + points);
}
