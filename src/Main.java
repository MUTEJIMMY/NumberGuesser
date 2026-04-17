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

    int random = rand.nextInt(1,10);

    System.out.println("Welcome to my Guessing Game.");

    waiting();

    System.out.println("I have a random number between 1-10 and I want you to try and guess it.");

    int userGuess =  scan.nextInt();


}
