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

}
