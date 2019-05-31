package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Connection.HasConnection;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class CheckingDiskSpace extends AMDSate {

    public CheckingDiskSpace(Context context) {
        super(context);
        if(context.connectionRegion_currentState instanceof HasConnection && (context.diskCapacity - context.diskSpaceTaken > 0)){
            context.startDownloading();
            context.setDownloadsRegion_currentState(context.downloads_downloadingFile);
        }
    }

}
