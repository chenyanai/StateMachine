import java.util.ArrayList;
import java.util.List;

public class Context {

    private State region1Downloads;
    private State region2Connection;
    private State region3Player;
    private State region4User;

    // region1 states
    private final State downloads_waitingForDownloads;
    private final State downloads_fixingError;
    private final State downloads_downloadingFile;
    private final State downloads_checkingDiskSpace;
    private final State downloads_waitingForInternetConnection;

    // region2 states
    private final State connection_noConnection;
    private final State connection_hasConnection;

    // region3 states
    private final State player_idle;
    private final State player_downloadingMovie;
    private final State player_moviePaused;
    private final State player_moviePlaying;

    // region4 states
    private final State user_checkStatus;
    private final State user_beginner;
    private final State user_advanced;
    private final State user_professional;

    // variables
    int userPoints = 0;
    int stopPoint = 0;
    List<String> downloadsQueue = new ArrayList<>();

    public Context() {
        this.region1Downloads = downloads_waitingForDownloads;
        this.region2Connection = connection_noConnection;
        this.region3Player = player_idle;
        this.region4User = user_checkStatus;
    }

    void setRegion1Downloads(State region1Downloads) {
        this.region1Downloads = region1Downloads;
    }

    void setRegion2Connection(State region2Connection) {
        this.region2Connection = region2Connection;
    }

    void setRegion3Player(State region3Player) {
        this.region3Player = region3Player;
    }

    void setRegion4User(State region4User) {
        this.region4User = region4User;
    }

}
