package MDStateMachine.User;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class Beginner extends AMDSate {

    public Beginner(Context context) {
        super(context);
    }

    @Override
    public void downloadFinished() {
        super.downloadFinished();
        if (context.userPoints > 4) {
            context.setPlayerRegion_currentState(context.user_advanced);
        }
    }
}
