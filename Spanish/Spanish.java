package Spanish;
import java.util.Scanner;

public class Spanish {
    private static boolean[] seats = new boolean[30];
    public void Spanish() {
            Scanner input = new Scanner(System.in);
            while (true) {
                //show menu
                Integer x;
                System.out.println("      *      *      ");
                System.out.println("   *     *     *   ");
                System.out.println(" *   *       *   * ");
                System.out.println("   *           *   ");
                System.out.println("       Vietnameta       ");
                System.out.println("      aerolínea       ");
                System.out.println("   \"Vuela en la distancia\"   ");
                System.out.print("----------------------------\n");
                System.out.println("1. reservar una silla");
                System.out.println("2. Mostrar asientos");
                System.out.println("3. Quitar asientos");
                System.out.println("4. clima");
                System.out.println("5. salida");
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
                    System.out.println("Đặt");
                } else {
                    System.out.println("Chưa");
                }
            }
            System.out.print("Ingrese el número de asiento que desea eliminar: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Lo siento, número equivocado: ");
                    System.out.print("Introduzca el número: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == true) {
                seats[seatNum - 1] = false;
                System.out.println("Los asientos están reservados, gracias.");
            } else {
                System.out.println("Lo sentimos, este asiento no está reservado.");
            }
        }
        //reserve the seat
        private static void reserveSeat() {
            Scanner input = new Scanner(System.in);
            //Display the available seat (accesability)
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Configúrelo");
                } else {
                    System.out.println("disponible");
                }
            }
            //Input part
            System.out.print("Introduzca el número: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Lo siento, número equivocado: ");
                    System.out.print("Introduzca el número:: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == false) {
                seats[seatNum - 1] = true;
                System.out.println("Configúrelo");
            } else {
                System.out.println("disponible");
            }
        }
        //Display the availabel seat:
        private static void viewSeats() {
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Configúrelo");
                } else {
                    System.out.println("disponible");
                }
            }
        }
    }
