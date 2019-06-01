package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Connection.HasConnection;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class CheckingDiskSpace extends AMDSate {

    public CheckingDiskSpace(Context context) {
        super(context);
    }

    @Override
    public void entry() {
        super.entry();
        context.seconds = 0;
        context.whenDiskSpaceNotFullHasConnection();
    }
}
