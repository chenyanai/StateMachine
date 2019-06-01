package MDStateMachine.Connection;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class NoConnection extends AMDSate  {

    public NoConnection(Context context) {super(context);}

    @Override
    public void entry() {
        super.entry();
        // function "CheckConnection()"
        if(context.isConnection) context.internetOn();
    }

    @Override
    public void internetOn() {
        context.setConnectionRegion_currentState(context.connection_hasConnection);
        context.whenDiskSpaceNotFullHasConnection();
    }

}
