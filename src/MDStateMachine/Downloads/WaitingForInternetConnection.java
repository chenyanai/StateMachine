package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class WaitingForInternetConnection extends AMDSate {

    public WaitingForInternetConnection(Context context) {
        super(context);
    }

    @Override
    public void internetOn() {
        super.internetOn();
        context.setDownloadsRegion_currentState(context.downloads_downloadingFile);
    }
}
