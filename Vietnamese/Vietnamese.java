package Vietnamese;
import java.util.Scanner;
import Vietnamese.*;
import Spanish.*;
import Macedonian.*;
public class Vietnamese {
    private static boolean[] seats = new boolean[30];
    public void Vietnamese() {
            Scanner input = new Scanner(System.in);
            while (true) {
                Vietnamese v = new Vietnamese();
                Spanish s = new Spanish();
                Macedonian m = new Macedonian();
                //show menu
                Integer x;
                System.out.println("      *      *      ");
                System.out.println("   *     *     *   ");
                System.out.println(" *   *       *   * ");
                System.out.println("   *           *   ");
                System.out.println("       Việt Nam       ");
                System.out.println("      Hãng hàng không       ");
                System.out.println("   \"Bay lên phương xa\"   ");
                System.out.print("----------------------------\n");
                System.out.println("1. Đặt một ghế");
                System.out.println("2. Hiển thị chỗ ngồi ngồ");
                System.out.println("3. Xoá chỗ ngồi");
                System.out.println("4. thời tiết");
                System.out.println("5. thoát");
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
            System.out.print("Nhập số ngồi bạn muốn xoá: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Xin lỗi, sai số: ");
                    System.out.print("Nhập số: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == true) {
                seats[seatNum - 1] = false;
                System.out.println("Chỗ ngồi đã đặt, cảm ơn");
            } else {
                System.out.println("Xin lỗi, chỗ ngồi này chưa đặt");
            }
        }
        //reserve the seat
        private static void reserveSeat() {
            Scanner input = new Scanner(System.in);
            //Display the available seat (accesability)
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Đặt rồi");
                } else {
                    System.out.println("có sẵn");
                }
            }
            //Input part
            System.out.print("Nhập số: ");
            int seatNum = input.nextInt();
            if(seatNum < 1 || seatNum > 30){
                do{
                    System.out.print("Xin lỗi, sai số: ");
                    System.out.print("Nhập số: ");
                    seatNum = input.nextInt();
                }while(seatNum < 1 || seatNum > 30);
            }
            if (seats[seatNum - 1] == false) {
                seats[seatNum - 1] = true;
                System.out.println("Đặt rồi");
            } else {
                System.out.println("có sẵn");
            }
        }
        //Display the availabel seat:
        private static void viewSeats() {
            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");
                if (seats[i] == true) {
                    System.out.println("Đặt rồi");
                } else {
                    System.out.println("có sẵn");
                }
            }
        }
    }
