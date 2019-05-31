package MDStateMachine;

public interface MDState {

    public void turnOn();
    public void turnOff();
    public void internetOn();
    public void internetOff();
    public void fileRequest();

    public void downloadAborted();
    public void downloadError();
    public void errorFixed();
    public void downloadFinished();

    public void movieOn();
    public void restartMovie();
    public void holdMovie();
    public void movieOff();
    public void resume();
    

}