package MDStateMachine;

public abstract class AMDSate implements IMDState {
    protected Context context;

    public AMDSate(Context context) {
        this.context = context;
    }

    @Override
    public void entry() {
        System.out.println("enter " + getClass().toString().replace("class MDStateMachine.", "") + " state");
    }

    @Override
    public void exit() {
        System.out.println("exit " + getClass().toString().replace("class MDStateMachine.", "") + " state");
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
