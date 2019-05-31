package MDStateMachine.Player;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class MoviePaused extends AMDSate {

    public MoviePaused(Context context) {
        super(context);
    }


    @Override
    public void resume() {
        super.resume();
        context.setPlayerRegion_currentState(context.player_moviePlaying);
    }

    @Override
    public void internetOn() {
        super.internetOn();
        context.setPlayerRegion_currentState(context.player_moviePlaying);
    }

    @Override
    public void errorFixed() {
        super.errorFixed();
        context.setPlayerRegion_currentState(context.player_moviePlaying);
    }

    @Override
    public void downloadAborted() {
        super.downloadAborted();
        context.setPlayerRegion_currentState(context.player_idle);
    }
}
