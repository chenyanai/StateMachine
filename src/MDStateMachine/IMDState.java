package MDStateMachine;

public interface IMDState {

    void entry();
    void exit();

    void turnOn();
    void turnOff();
    void internetOn();
    void internetOff();
    void fileRequest();

    void downloadAborted();
    void downloadError();
    void errorFixed();
    void downloadFinished();

    void movieOn();
    void restartMovie();
    void holdMovie();
    void movieOff();
    void resume();
    }