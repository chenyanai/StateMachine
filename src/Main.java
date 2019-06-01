import MDStateMachine.Context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        Scanner sc = new Scanner(System.in);

        boolean flag =true;
        int event;
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
                "14) wait 1 second\n");

        while (flag){

            event = sc.nextInt();
            System.out.println(event);
            switch (event){
                case 0: {
                    System.out.println("enter disk capacity:");
                    context.diskCapacity=sc.nextInt();
                }
            }




        }


    }
}
