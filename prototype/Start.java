import java.util.Scanner;

public class Start {
    //Main class for the app
    /*
    this is just for the testing of the idea of the app
    this will be ported to js and ran within a web ui however
    to test the understanding of the app it will be done in an
    oop idea with java
    */
    public static void main(String[] args) {
        boolean state = true;
        //userinput
        Scanner scnr = new Scanner(System.in);
        

        do {
            System.out.println("Welcome to the alpha build of FastTek");
            System.out.println("Please make a menu choice: ");
            System.out.println("1. Start a new fast");
            System.out.println("2. Review past fasts");

            if (scnr.nextInt() == 1)  {
                System.out.println("Loading new fast!");
                
                //Creating an instance of Fasting
                Fasting fast = new Fasting();
                //Prompting user for input
                System.out.println("Start Time?");
                //getting the user's next int err checking is within the Fasting class
                fast.setStartingTime(scnr.nextInt());
                //prompting for end time
                System.out.println("End Time?");
                //getting the user's next int err checking is within the Fasting class
                fast.setExpectedEnd(scnr.nextInt());
                //Printing Info for debugging.
                fast.PrintInfo();

                

                state = false;
                break;
            }
            if(scnr.nextInt() == 2){
                System.out.println("Looking for older fasts.....");
                state = false;
                break;
            }
        } while (state);
    }
    
}