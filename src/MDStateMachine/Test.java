package MDStateMachine;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

        /**
     * Get a diff between two dates
     * @param date1 the oldest date
     * @param date2 the newest date
     * @param timeUnit the unit in which you want the diff
     * @return the diff value, in the provided unit
     */
    private static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    public static void main (String[] args) throws Exception {
//        Context context = new Context();
//        context.turnOn();
//        context.internetOn();
//        context.internetOff();
//        context.internetOn();
//        context.internetOff();
//        context.internetOn();
//        context.turnOff();
//        context.internetOff();
//        context.internetOn();
//        context.turnOn();
//        context.internetOn();
//        context.internetOff();
//        context.internetOn();
        Date first = new Date();
        TimeUnit.SECONDS.sleep(2);
        long diff = getDateDiff(first, new Date(), TimeUnit.SECONDS);
        System.out.print(diff);
    }
}
