import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //starting menu system
        int placeHolder = 1;
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("FastTek Prototype.");
            System.out.println("Please make a menu selection.");
            System.out.println("1. Start a new fast");
            System.out.println("2. Edit a existing fast");

            //Checking for users choice
            if (userInput.nextInt() == 1) {
                System.out.println("Beep");
            }


        } while (placeHolder != 0);
    }
}