package MDStateMachine.Connection;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class NoConnection extends AMDSate implements IMDState {

    public NoConnection(Context context) {super(context);}

    @Override
    public void entry() {
        super.entry();
        // function "CheckConnection()"
        if(context.isConnection) context.internetOn();
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {
        context.setConnectionRegion_currentState(context.connection_hasConnection);
    }

    @Override
    public void internetOff() {

    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadFinished() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }
}
