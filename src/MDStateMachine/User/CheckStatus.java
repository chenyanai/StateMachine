package MDStateMachine.User;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class CheckStatus extends AMDSate {

    public CheckStatus(Context context) {
        super(context);
    }

    @Override
    public void entry() {
        super.entry();
        if (context.userPoints < 4) {
            context.setUserRegion_currentState(context.user_beginner);
        } else if (context.userPoints < 7) {
            context.setUserRegion_currentState(context.user_advanced);
        } else if (context.userPoints > 7) {
            context.setUserRegion_currentState(context.user_professional);
        }
    }
}
