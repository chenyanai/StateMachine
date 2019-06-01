package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class WaitingForDownloads extends AMDSate {

    public WaitingForDownloads(Context context) {
        super(context);
    }

    @Override
    public void entry() {
        super.entry();
        context.downloadingPercentage = 0;

    }

    @Override
    public void fileRequest() {
        super.fileRequest();
        context.addToQueue();
    }

    @Override
    public void downloadAborted() {
        super.downloadAborted();
        context.deleteRequestFromQueue();
    }
}
