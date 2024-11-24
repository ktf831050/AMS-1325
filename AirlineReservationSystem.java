//This product was made by Khang Truong, Duc Le, Jacob !!!
//Airline Management System Core
import java.util.Scanner;
import Vietnamese.*;
import Spanish.*;
import Macedonian.*;
//Weather Component and API:
public class AirlineReservationSystem {
    
    public static boolean[] seats = new boolean[30];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            Vietnamese v = new Vietnamese();
            Spanish s = new Spanish();
            Macedonian m = new Macedonian();
            System.out.println("\033[31m"); // Set text color to red
            //Displaying the flag
            System.out.println("**************************** ****************************** ########################## ******************************");
            System.out.println("*                          * * * * * * *  ################# ######  GREEN   ########## *       \\   |   /           *");
            System.out.println("*          *****           *  * * * * *   ################# ######   🇲🇽    ########## *        \\  |  /            *");
            System.out.println("*         *     *          * * * * * * *  ################# ######   RED    ########## *  ------- ☀ -------         *");
            System.out.println("*      *************       *  * * * * *   ################# ########################## *        /  |  \\            *");
            System.out.println("*         *     *          * * * * * * *  #################                            *       /   |   \\           * ");
            System.out.println("*          *****           * ##############################                            ****************************** ");
            System.out.println("*                          * ##############################                                                         ");
            System.out.println("**************************** ##############################                                                             ");
            System.out.print("Which language do you want to use: \n");
            System.out.print("1. English\n");
            System.out.print("2. Vietnamese\n");
            System.out.print("3. Spanish\n");
            System.out.print("4. Macedonian\n");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    English();
                    break;
                case 2:
                    v.Vietnamese();
                    break;
                case 3:
                    s.Spanish();
                    break;
                case 4:
                    m.Macedonian();
                    break;
                default:
                    System.out.print("Invalid, please input again: ");
                    choice = input.nextInt();
            }
        }
    }
    public static void English(){
        Scanner input = new Scanner(System.in);
        while (true) {
            //show menu
            Integer x;
            System.out.println("      *      *      ");
            System.out.println("   *     *     *   ");
            System.out.println(" *   *       *   * ");
            System.out.println("   *           *   ");
            System.out.println("       VIETNAM       ");
            System.out.println("      AIRLINES       ");
            System.out.println("   \"Reach Further\"   ");
            System.out.print("----------------------------\n");
            System.out.println("1. Reserve a seat");
            System.out.println("2. View all seats");
            System.out.println("3. Delete one seat");
            System.out.println("4. Reset all seats");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            // input something
            switch(choice){
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    viewSeats();
                    break;
                case 3:
                    deleteSeat();
                    break;
                case 4:
                    resetSeats();
                    break;
                default:
                while(true){
                    Vietnamese v = new Vietnamese();
                    Spanish s = new Spanish();
                    Macedonian m = new Macedonian();
                    System.out.println("\033[31m"); // Set text color to red
                    //Displaying the flag
                    System.out.println("**************************** ****************************** ########################## ******************************");
                    System.out.println("*                          * * * * * * *  ################# ######  GREEN   ########## *       \\   |   /           *");
                    System.out.println("*          *****           *  * * * * *   ################# ######   🇲🇽    ########## *        \\  |  /            *");
                    System.out.println("*         *     *          * * * * * * *  ################# ######   RED    ########## *  ------- ☀ -------         *");
                    System.out.println("*      *************       *  * * * * *   ################# ########################## *        /  |  \\            *");
                    System.out.println("*         *     *          * * * * * * *  #################                            *       /   |   \\           * ");
                    System.out.println("*          *****           * ##############################                            ****************************** ");
                    System.out.println("*                          * ##############################                                                         ");
                    System.out.println("**************************** ##############################                                                             ");
                    System.out.print("Which language do you want to use: \n");
                    System.out.print("1. English\n");
                    System.out.print("2. Vietnamese\n");
                    System.out.print("3. Spanish\n");
                    System.out.print("4. Macedonian\n");
                    choice = input.nextInt();
                    switch(choice){
                    case 1:
                        English();
                        break;
                    case 2:
                        v.Vietnamese();
                        break;
                    case 3:
                        s.Spanish();
                        break;
                    case 4:
                        m.Macedonian();
                        break;
                    default:
                        System.out.print("Invalid, please input again: ");
                        choice = input.nextInt();
            }
                }
                    
            }
        }
    }
    //delete the seat
    public static void deleteSeat(){
        Scanner input = new Scanner(System.in);
        //Display the available seat (accesability)
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) {
                System.out.println("Reserved");
            } else {
                System.out.println("Available");
            }
        }
        System.out.print("Enter seat number you want to delete: ");
        Integer seatNum = input.nextInt();
        if(seatNum < 1 || seatNum > 30){
            do{
                System.out.print("Sorry, this is out of range: ");
                System.out.print("Enter seat number: ");
                seatNum = input.nextInt();
            }while(seatNum < 1 || seatNum > 30);
        }
        if (seats[seatNum - 1] == true) {
            seats[seatNum - 1] = false;
            System.out.println("Seat has deleted. Thank you.");
        } else {
            System.out.println("Sorry, this seat is not yet reserved.");
        }
    }
    //reserve the seat
    public static void reserveSeat() {
        Scanner input = new Scanner(System.in);
        //Display the available seat (accesability)
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) {
                System.out.println("Reserved");
            } else {
                System.out.println("Available");
            }
        }
        //Input part
        System.out.print("Enter seat number: ");
        Integer seatNum = input.nextInt();
        if(seatNum < 1 || seatNum > 30){
            do{
                System.out.print("Sorry, this is out of range: ");
                System.out.print("Enter seat number: ");
                seatNum = input.nextInt();
            }while(seatNum < 1 || seatNum > 30);
        }
        if (seats[seatNum - 1] == false) {
            seats[seatNum - 1] = true;
            System.out.println("Seat reserved. Thank you.");
        } else {
            System.out.println("Sorry, this seat is already reserved.");
        }
    }
    //Display the availabel seat:
    public static void viewSeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) {
                System.out.println("Reserved");
            } else {
                System.out.println("Available");
            }
        }
    }
    //Reset all seats
    private static void resetSeats() {
        for (int i = 0; i < seats.length; i++) {
            if(seats[i]== true){
                seats[i] = false;
            }else{
                System.out.print("No seat is reserved.\n");
                break;
            }
        }
        System.out.println("All seats have been reset.");
    }
}