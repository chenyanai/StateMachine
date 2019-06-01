package MDStateMachine.User;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class Advanced extends AMDSate {

    public Advanced(Context context) {
        super(context);
    }


    @Override
    public void downloadFinished() {
        super.downloadFinished();
        if (context.userPoints >= 7) {
            context.setUserRegion_currentState(context.user_professional);
        }
    }

    @Override
    public void downloadFailed() {
        super.downloadFailed();
        if (context.userPoints < 4) {
            context.setUserRegion_currentState(context.user_beginner);
        }
    }
}
