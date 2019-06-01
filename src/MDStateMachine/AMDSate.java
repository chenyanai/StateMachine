package MDStateMachine;

import java.util.Arrays;

public abstract class AMDSate implements IMDState {
    protected Context context;
    String [] s = getClass().toString().split("\\.");

    public AMDSate(Context context) {
        this.context = context;
    }

    @Override
    public void entry() {

        System.out.println("enter " + s[s.length-1] + " state");
    }

    @Override
    public void exit() {
        System.out.println("exit " + s[s.length-1] + " state");
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
    public void downloadFailed(){

    }

    @Override
    public void startDownloading() {

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
