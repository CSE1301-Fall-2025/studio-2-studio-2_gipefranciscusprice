import java.util.Scanner;
public class Ruin {
public static void main(String[] args) {

Scanner in = new Scanner(System.in);

// starting number of dollars for gambling
System.out.print("Enter starting amount: ");
        int startAmount = in.nextInt();

System.out.println("Welcome to Black Jack!");

System.out.println("Place your bets: ");
int bets = in.nextInt();

int newAmount = startAmount - bets;
System.out.println("Your current balance after betting but before playing: ");
System.out.println(newAmount);

int randomNumber=(int)(Math.random() * (10-1 + 1 )) + 1;

boolean winChance = randomNumber %2 == 0;

boolean keepPlaying = "Yes";



if (winChance == true) {
System.out.println("Congrats you won!, Here's your new balance: ");
    newAmount = bets * 2;
    System.out.println(newAmount);
} else {
    System.out.println("Oh no you lost!!! Here is your current balance: ");
    System.out.println(newAmount);
}
//win probability each hand
if (newAmount > 1200){
    System.out.println("You have had a sucessful day! It's time to go home!");

}
if (newAmount <= 0) {
    System.out.println("You are poor go home!!");
}
}



}



