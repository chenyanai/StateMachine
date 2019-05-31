package MDStateMachine.User;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class Professional extends AMDSate {

    public Professional(Context context) {
        super(context);
    }

    @Override
    public void downloadFailed() {
        super.downloadFailed();
        if (context.userPoints < 7) {
            context.setUserRegion_currentState(context.user_advanced);
        }
    }
}
