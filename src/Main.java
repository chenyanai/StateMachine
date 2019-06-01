import MDStateMachine.Context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        Scanner cSc = new Scanner(System.in);

        boolean flag =true;
        int event;
        String ch;
        System.out.println("Welcome!");
        System.out.println("Choose an event you want to launch:\n" +
                "0)  turnON\n" +
                "1)  turnOff\n" +
                "2)  internetOn\n" +
                "3)  internetOff\n" +
                "4)  fileRequest\n" +
                "5)  downloadAborted\n" +
                "6)  downloadFinished\n" +
                "7)  downloadError\n" +
                "8)  errorFixed\n" +
                "9)  movieOn\n" +
                "10) movieOff\n" +
                "11) restartMovie\n" +
                "12) resume\n" +
                "13) holdMovie\n" +
                "14) wait 1 second\n" +
                "15) exit program\n");

        while (flag){

            event = sc.nextInt();

            System.out.println(event);
            switch (event){

                case 0: {
                    System.out.println("do you want to change disk capacity from 100(y/n)?");
                    ch=cSc.nextLine();
                    if(ch.equals("y") || ch.equals("y\n")){
                        System.out.println("enter new disk capacity:");
                        context.diskCapacity=sc.nextInt();
                    }else {
                        context.diskCapacity=100;
                    }
                    context.turnOn();
                }
                case 1:{
                    context.turnOff();
                }
                case 2:{
                    context.internetOn();
                }
                case 3:{
                    context.internetOff();
                }
                case 4:{
                    int size;
                    System.out.println("enter file size:");
                    size=sc.nextInt();
                    context.setRequestSize(size);
                    context.fileRequest();
                }
                case 5:{
                    context.downloadAborted();
                }
                case 6:{
                    context.downloadFinished();
                }
                case 7:{
                    context.downloadError();
                }

                case 8:{
                    context.errorFixed();
                }
                case 9:{
                    context.movieOn();
                }
                case 10: {
                    context.movieOff();
                }
                case 11: {
                    context.restartMovie();
                }
                case 12: {
                    context.resume();
                }
                case 13: {
                    context.holdMovie();
                }
                case 14: {
                    context.time();
                }
                case 15: {
                    System.exit(0);
                }
                default: {
                    System.out.println("please enter a valid choice");
                }

            }

            System.out.println("Choose an event you want to launch:\n" +
                    "0)  turnON\n" +
                    "1)  turnOff\n" +
                    "2)  internetOn\n" +
                    "3)  internetOff\n" +
                    "4)  fileRequest\n" +
                    "5)  downloadAborted\n" +
                    "6)  downloadFinished\n" +
                    "7)  downloadError\n" +
                    "8)  errorFixed\n" +
                    "9)  movieOn\n" +
                    "10) movieOff\n" +
                    "11) restartMovie\n" +
                    "12) resume\n" +
                    "13) holdMovie\n" +
                    "14) wait 1 second\n" +
                    "15) exit program\n");

        }


    }
}
