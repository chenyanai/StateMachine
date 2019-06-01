package MDStateMachine.Player;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.Downloads.DownloadingFile;
import MDStateMachine.IMDState;

public class DownloadingMovie extends AMDSate  {

    public DownloadingMovie(Context context) {
        super(context);
    }

    @Override
    public void movieOn() {
        super.movieOn();
        if (context.downloadsRegion_currentState instanceof DownloadingFile && context.downloadingPercentage >= 20){
            context.stopPoint = 0;
            context.setPlayerRegion_currentState(context.player_moviePlaying);
        }
    }

    @Override
    public void downloadAborted() {
        super.downloadAborted();
        context.setPlayerRegion_currentState(context.player_idle);
    }
}
