import time.susu.ru.*;

import java.math.BigInteger;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    private static Application service = new TimeService().getApplication();
    public static void main(String[] args) {
        do {
            printPrompt();
        }while(parseInput());
    }

    private static void printPrompt(){
        System.out.println("1 - current time");
        System.out.println("2 - time in guest zone");
        System.out.println("3 - plus hours");
        System.out.println("4 - time between");
        System.out.println("5 - available timezones");
    }

    /**
     * @return true if system waits for next command;
     * false if client app must be terminated
     */
    private static boolean parseInput(){
        switch (scanner.nextLine().charAt(0)){
            case '1':
                process(processCurrentTime());
                break;
            case '2':
                process(processGuestZone());
                break;
            case '3':
                process(processPlus());
                break;
            case '4':
                process(processBetween());
                break;
            case '5':
                process(processTimezones());
                break;
        }
        return true;
    }

    /**
     * Wrapper around commands for pretty-printing
     * @param response - response of correspondent command
     */
    private static void process(String response){
        System.out.println("response:");
        System.out.println(response);
        System.out.println("======================================================");
    }


    /// Sending requests for server

    private static String processHello(){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        return service.hello(name);
    }


    private static String processCurrentTime(){
        System.out.print("enter timezone =>");
        return service.currentTime(scanner.nextLine());
    }

    private static String processGuestZone(){
        System.out.print("enter datetime =>");
        String time = scanner.nextLine();
        System.out.print("enter home timezone =>");
        String homeTZ = scanner.nextLine();
        System.out.print("enter guest timezone =>");
        String guestTZ = scanner.nextLine();
        return service.timeInGuestZone(time, homeTZ, guestTZ);
    }

    private static String processPlus(){
        System.out.print("enter timezone =>");
        String tz = scanner.nextLine();
        System.out.print("enter hour =>");
        long offset = scanner.nextLong();
        return service.plusHours(tz, BigInteger.valueOf(offset));
    }

    private static String processBetween(){
        System.out.print("enter first timezone =>");
        String firstTZ = scanner.nextLine();
        System.out.print("enter second timezone =>");
        String secondTZ = scanner.nextLine();
        return service.timeBetween(firstTZ, secondTZ);
    }

    private static String processTimezones(){
       return String.join("\n", service.availableTimezones().getString());
    }
}
