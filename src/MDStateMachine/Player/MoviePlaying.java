package MDStateMachine.Player;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class MoviePlaying extends AMDSate  {

    int moviePlayTime = 0;
    Date startTime;

    public MoviePlaying(Context context) {
        super(context);
    }

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

    @Override
    public void entry() {
        super.entry();
        //TODO implement (do not delete call to super)
//        moviePlayTime = context.stopPoint;
    }

    @Override
    public void restartMovie() {
        super.restartMovie();
        context.stopPoint = 0;
        context.setPlayerRegion_currentState(this);
    }

    @Override
    public void holdMovie() {
        super.holdMovie();
//        moviePlayTime += getDateDiff(new Date(), startTime, TimeUnit.MINUTES);
//        context.stopPoint = moviePlayTime;
        context.setPlayerRegion_currentState(context.player_moviePaused);
    }

    @Override
    public void internetOff() {
        super.internetOff();
//        moviePlayTime += getDateDiff(new Date(), startTime, TimeUnit.MINUTES);
//        context.stopPoint = moviePlayTime;
        context.setPlayerRegion_currentState(context.player_moviePaused);
    }

    @Override
    public void downloadError() {
        super.downloadError();
//        moviePlayTime += getDateDiff(new Date(), startTime, TimeUnit.MINUTES);
//        context.stopPoint = moviePlayTime;
        context.setPlayerRegion_currentState(context.player_moviePaused);
    }

    @Override
    public void downloadAborted() {
        super.downloadAborted();
        context.setPlayerRegion_currentState(context.player_idle);
    }
}
