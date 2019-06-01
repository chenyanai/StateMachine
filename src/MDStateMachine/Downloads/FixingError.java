package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class FixingError extends AMDSate  {

    public FixingError(Context context) {
        super(context);

    }

    @Override
    public void entry() {
        super.entry();
        context.seconds = 0;
    }

    @Override
    public void errorFixed() {
        super.errorFixed();
        context.setDownloadsRegion_currentState(context.downloads_downloadingFile);
    }


}
