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

    private MDState downloadsRegion;
    private MDState connectionRegion;
    private MDState playerRegion;
    private MDState userRegion;

    // downloads region states
    private final MDState downloads_waitingForDownloads = new WaitingForDownloads();
    private final MDState downloads_fixingError = new FixingError();
    private final MDState downloads_downloadingFile = new DownloadingFile();
    private final MDState downloads_checkingDiskSpace = new CheckingDiskSpace();
    private final MDState downloads_waitingForInternetConnection = new waitingForInternetConnection();

    // connection region states
    private final MDState connection_noConnection = new NoConnection();
    private final MDState connection_hasConnection = new HasConnection();

    // player region states
    private final MDState player_idle = new Idle();
    private final MDState player_downloadingMovie = new DownloadingMovie();
    private final MDState player_moviePaused = new MoviePaused();
    private final MDState player_moviePlaying = new MoviePlaying();

    // user region states
    private final MDState user_checkStatus = new CheckStatus();
    private final MDState user_beginner = new Beginner();
    private final MDState user_advanced = new Advanced();
    private final MDState user_professional = new Professional();

    // variables
    int userPoints = 0;
    int stopPoint = 0;
    List<String> downloadsQueue = new ArrayList<>();

    public Context() {
        this.downloadsRegion = downloads_waitingForDownloads;
        this.connectionRegion = connection_noConnection;
        this.playerRegion = player_idle;
        this.userRegion = user_checkStatus;
    }

    void setDownloadsRegion(MDState downloadsRegion) {
        this.downloadsRegion = downloadsRegion;
    }

    void setConnectionRegion(MDState connectionRegion) {
        this.connectionRegion = connectionRegion;
    }

    void setPlayerRegion(MDState playerRegion) {
        this.playerRegion = playerRegion;
    }

    void setUserRegion(MDState userRegion) {
        this.userRegion = userRegion;
    }

}
