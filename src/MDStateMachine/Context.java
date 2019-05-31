package MDStateMachine;

import MDStateMachine.Connection.HasConnection;
import MDStateMachine.Connection.NoConnection;
import MDStateMachine.Downloads.CheckingDiskSpace;
import MDStateMachine.Downloads.DownloadingFile;
import MDStateMachine.Downloads.FixingError;
import MDStateMachine.Downloads.WaitingForDownloads;
import MDStateMachine.Downloads.waitingForInternetConnection;
import MDStateMachine.Player.DownloadingMovie;
import MDStateMachine.Player.Idle;
import MDStateMachine.Player.MoviePaused;
import MDStateMachine.Player.MoviePlaying;
import MDStateMachine.User.Advanced;
import MDStateMachine.User.Beginner;
import MDStateMachine.User.CheckStatus;
import MDStateMachine.User.Professional;

import java.util.ArrayList;
import java.util.List;

public class Context{

    private IMDState downloadsRegion_currentState;
    private IMDState connectionRegion_currentState;
    private IMDState playerRegion_currentState;
    private IMDState userRegion_currentState;

    // downloads region states
    public final IMDState downloads_waitingForDownloads = new WaitingForDownloads(this);
    public final IMDState downloads_fixingError = new FixingError(this);
    public final IMDState downloads_downloadingFile = new DownloadingFile(this);
    public final IMDState downloads_checkingDiskSpace = new CheckingDiskSpace(this);
    public final IMDState downloads_waitingForInternetConnection = new waitingForInternetConnection(this);

    // connection region states
    public final IMDState connection_noConnection = new NoConnection(this);
    public final IMDState connection_hasConnection = new HasConnection(this);

    // player region states
    public final IMDState player_idle = new Idle(this);
    public final IMDState player_downloadingMovie = new DownloadingMovie(this);
    public final IMDState player_moviePaused = new MoviePaused(this);
    public final IMDState player_moviePlaying = new MoviePlaying(this);

    // user region states
    public final IMDState user_checkStatus = new CheckStatus(this);
    public final IMDState user_beginner = new Beginner(this);
    public final IMDState user_advanced = new Advanced(this);
    public final IMDState user_professional = new Professional(this);

    // variables
    private boolean isOn = false;
    public int userPoints = 0;
    public int stopPoint = 0;
    public List<String> downloadsQueue = new ArrayList<>();
    public boolean isConnection = true;

    public Context() {
        this.downloadsRegion_currentState = downloads_waitingForDownloads;
        this.connectionRegion_currentState = connection_noConnection;
        this.playerRegion_currentState = player_idle;
        this.userRegion_currentState = user_checkStatus;
    }

    public void setDownloadsRegion_currentState(IMDState newState) {
        downloadsRegion_currentState.exit();
        this.downloadsRegion_currentState = newState;
        downloadsRegion_currentState.entry();
    }

    public void setConnectionRegion_currentState(IMDState newState) {
        connectionRegion_currentState.exit();
        this.connectionRegion_currentState = newState;
        connectionRegion_currentState.entry();
    }

    public void setPlayerRegion_currentState(IMDState newState) {
        playerRegion_currentState.exit();
        this.playerRegion_currentState = newState;
        playerRegion_currentState.entry();
    }

    public void setUserRegion_currentState(IMDState newState) {
        userRegion_currentState.exit();
        this.userRegion_currentState = newState;
        userRegion_currentState.entry();
    }

    //  methods for receiving events //

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void internetOn() {
        if(isOn){
            isConnection = true;
            downloadsRegion_currentState.internetOn();
            connectionRegion_currentState.internetOn();
            playerRegion_currentState.internetOn();
            userRegion_currentState.internetOn();
        }
    }

    public void internetOff() {
        if(isOn){
            isConnection = false;
            downloadsRegion_currentState.internetOff();
            connectionRegion_currentState.internetOff();
            playerRegion_currentState.internetOff();
            userRegion_currentState.internetOff();
        }
    }

    public void fileRequest() {
        if(isOn){
            downloadsRegion_currentState.fileRequest();
            connectionRegion_currentState.fileRequest();
            playerRegion_currentState.fileRequest();
            userRegion_currentState.fileRequest();
        }
    }

    public void downloadAborted() {
        if(isOn){
            downloadsRegion_currentState.downloadAborted();
            connectionRegion_currentState.downloadAborted();
            playerRegion_currentState.downloadAborted();
            userRegion_currentState.downloadAborted();
        }
    }

    public void downloadError() {
        if(isOn){
            downloadsRegion_currentState.downloadError();
            connectionRegion_currentState.downloadError();
            playerRegion_currentState.downloadError();
            userRegion_currentState.downloadError();
        }
    }

    public void errorFixed() {
        if(isOn){
            downloadsRegion_currentState.errorFixed();
            connectionRegion_currentState.errorFixed();
            playerRegion_currentState.errorFixed();
            userRegion_currentState.errorFixed();
        }
    }

    public void downloadFinished() {
        if(isOn){
            downloadsRegion_currentState.downloadFinished();
            connectionRegion_currentState.downloadFinished();
            playerRegion_currentState.downloadFinished();
            userRegion_currentState.downloadFinished();
        }
    }

    public void movieOn() {
        if(isOn){
            downloadsRegion_currentState.movieOn();
            connectionRegion_currentState.movieOn();
            playerRegion_currentState.movieOn();
            userRegion_currentState.movieOn();
        }
    }

    public void restartMovie() {
        if(isOn){
            downloadsRegion_currentState.restartMovie();
            connectionRegion_currentState.restartMovie();
            playerRegion_currentState.restartMovie();
            userRegion_currentState.restartMovie();
        }
    }

    public void holdMovie() {
        if(isOn){
            downloadsRegion_currentState.holdMovie();
            connectionRegion_currentState.holdMovie();
            playerRegion_currentState.holdMovie();
            userRegion_currentState.holdMovie();
        }
    }

    public void movieOff() {
        if(isOn){
            downloadsRegion_currentState.movieOff();
            connectionRegion_currentState.movieOff();
            playerRegion_currentState.movieOff();
            userRegion_currentState.movieOff();
        }
    }

    public void resume() {
        if(isOn){
            downloadsRegion_currentState.resume();
            connectionRegion_currentState.resume();
            playerRegion_currentState.resume();
            userRegion_currentState.resume();
        }
    }

    public void downloadFailed(){
        if(isOn){
            downloadsRegion_currentState.downloadFailed();
            connectionRegion_currentState.downloadFailed();
            playerRegion_currentState.downloadFailed();
            userRegion_currentState.downloadFailed();
        }
    }

}
