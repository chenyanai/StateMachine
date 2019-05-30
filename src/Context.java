public class Context {

    private State region1State;
    private State region2State;
    private State region3State;
    private State region4State;

    // region1 states
    private final State waitingForDownloads;
    private final State fixingError;
    private final State downloadingFile;
    private final State checkingDiskSpace;
    private final State waitingForInternetConnection;

    // region2 states
    private final State noConnection;
    private final State hasConnection;

    // region3 states
    private final State idle;
    private final State downloadingMovie;
    private final State moviePaused;
    private final State moviePlaying;

    // region4 states
    private final State checkStatus;
    private final State beginner;
    private final State advanced;
    private final State professional;

    public Context() {
        this.region1State = waitingForDownloads;
        this.region2State = noConnection;
        this.region3State = idle;
        this.region4State = checkStatus;
    }


}
