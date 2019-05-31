package MDStateMachine.Player;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class Idle extends AMDSate  {

    public Idle(Context context) {
        super(context);
    }


    @Override
    public void startDownloading() {
        super.startDownloading();
        context.setPlayerRegion_currentState(context.player_downloadingMovie);
    }
}
