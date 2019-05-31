package MDStateMachine.Connection;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class HasConnection extends AMDSate {

    public HasConnection(Context context) {
        super(context);
    }

    @Override
    public void internetOff() {
        context.setConnectionRegion_currentState(context.connection_noConnection);
    }

}
