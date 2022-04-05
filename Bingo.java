import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        ArrayList<Integer> randNumbers = new ArrayList<>();
        Random random = new Random();
        String input;
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please press enter to begin");
            input = sc.nextLine();
        }while (!input.equals(""));//loop while user doesn't press ENTER

        for (int i = 0; i < 4; i++){
            randNumbers.add(random.nextInt(10) + 1);//loop to fill the randNumbers arraylist with random numbers
        }
        /*
        randNumbers.add(3);
        randNumbers.add(2);
        randNumbers.add(9);
        randNumbers.add(9);

         */
        System.out.println("My random numbers: " + randNumbers.toString());

        int counter = 0;
        int bulls = 0;
        int eyes = 0;
        do {
            System.out.println("Please enter 4 numbers between 1-10");
            number = sc.nextInt();
            if (number > 0 && number <= 10){
                //System.out.println("index of rand: " + randNumbers.indexOf(number));
                //System.out.println("count: " + counter);
                if (randNumbers.indexOf(number) == counter){
                    eyes++;
                    System.out.println("eyes++");
                }else if (randNumbers.contains(number)){
                    bulls++;
                    System.out.println("bulls++");
                }
                counter++;
                System.out.println("Number " + counter + " introduced. " + (4 - counter) + " more to go.");
            }else {
                System.out.println("Wrong number.");
            }
        }while (counter < 4);//loop for user to introduce valid numbers

        System.out.println("You scored " + bulls + " bulls and " + eyes + " eyes.");
    }
}