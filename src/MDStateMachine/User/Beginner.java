package MDStateMachine.User;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class Beginner extends AMDSate implements IMDState {

    public Beginner(Context context) {
        super(context);
    }

    @Override
    public void entry() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {

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
