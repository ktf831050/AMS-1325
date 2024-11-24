package Macedonian;
import java.util.Scanner;

public class Macedonian {
    private static boolean[] seats = new boolean[30];
    public void Macedonian() {
            Scanner input = new Scanner(System.in);
            while (true) {
                //show menu
                Integer x;
                System.out.println("      *      *      ");
                System.out.println("   *     *     *   ");
                System.out.println(" *   *       *   * ");
                System.out.println("   *           *   ");
                System.out.println("       Виетнам       ");
                System.out.println("      Авиокомпании      ");
                System.out.println("   \"Летај во далечината\"   ");
                System.out.print("----------------------------\n");
                System.out.println("1. Резервирајте стол");
                System.out.println("2. Прикажи седење");
                System.out.println("3. Отстранете ги седиштата");
                System.out.println("4. времето");
                System.out.println("5. излез");
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
                        break;
                    case 5:
                        
                        
                }
            }
        }
        //delete the seat
        private static void deleteSeat(){
            Scanner input = new Scanner(System.in);
            //Display the available seat (accesability)
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Стави");
                } else {
                    System.out.println("Сè уште не");
                }
            }
            System.out.print("Внесете го бројот на седиштето што сакате да го избришете: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Извинете, погрешен број: ");
                    System.out.print("Внесете број: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == true) {
                seats[seatNum - 1] = false;
                System.out.println("Местата се резервирани, ви благодариме");
            } else {
                System.out.println("Извинете, ова место не е резервирано");
            }
        }
        //reserve the seat
        private static void reserveSeat() {
            Scanner input = new Scanner(System.in);
            //Display the available seat (accesability)
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Поставете го");
                } else {
                    System.out.println("достапни");
                }
            }
            //Input part
            System.out.print("Внесете број: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Извинете, погрешен број: ");
                    System.out.print("Внесете број: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == false) {
                seats[seatNum - 1] = true;
                System.out.println("Поставете го");
            } else {
                System.out.println("достапни");
            }
        }
        //Display the availabel seat:
        private static void viewSeats() {
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Поставете го");
                } else {
                    System.out.println("достапни");
                }
            }
        }
    }
